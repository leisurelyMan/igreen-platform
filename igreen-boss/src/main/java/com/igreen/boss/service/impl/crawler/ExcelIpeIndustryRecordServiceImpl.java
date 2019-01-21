package com.igreen.boss.service.impl.crawler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.crawler.ExcelIpeIndustryRecordService;
import com.igreen.boss.util.ExcelHead;
import com.igreen.boss.util.ExcelUtil;
import com.igreen.common.dao.ExcelIpeIndustryRecordManualMapper;
import com.igreen.common.dao.ExcelIpeIndustryRecordMapper;
import com.igreen.common.dao.IpeIndustryRecordMapper;
import com.igreen.common.enums.IpeIndustryRecordSourceEnum;
import com.igreen.common.enums.PunishTypeEnum;
import com.igreen.common.model.ExcelIpeIndustryRecord;
import com.igreen.common.model.ExcelIpeIndustryRecordExample;
import com.igreen.common.model.IpeIndustryRecord1;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.RegularizationUtil;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ExcelIpeIndustryRecordServiceImpl implements ExcelIpeIndustryRecordService {

    @Resource
    ExcelIpeIndustryRecordMapper excelIpeIndustryRecordMapper;

    @Resource
    ExcelIpeIndustryRecordManualMapper excelIpeIndustryRecordManualMapper;

    @Resource
    IpeIndustryRecordMapper ipeIndustryRecordMapper;

    @Value("#{prop['ipeHead']}")
    private String ipeHead;

    @Override
    public ListRange pageList(ExcelIpeIndustryRecord record, Integer currentPage, Integer pageRows) {
        PageHelper.startPage(currentPage, pageRows);

        ExcelIpeIndustryRecordExample example = new ExcelIpeIndustryRecordExample();
        ExcelIpeIndustryRecordExample.Criteria criteria = example.createCriteria();

        //年度
        if (!StrUtil.isNull(record.getYear()))
            criteria.andYearEqualTo(record.getYear());
        //详情页原url
        if (!StrUtil.isNull(record.getWebDetailUrl()))
            criteria.andWebDetailUrlLike(record.getWebDetailUrl()+"%");
        //公司名称
        if (!StrUtil.isNull(record.getCompanyName()))
            criteria.andCompanyNameLike("%"+record.getCompanyName()+"%");
        //省
        if (!StrUtil.isNull(record.getProvince()))
            criteria.andProvinceLike("%"+record.getProvince()+"%");
        //市
        if (!StrUtil.isNull(record.getCity()))
            criteria.andCityLike("%"+record.getCity()+"%");
        //县
        if (!StrUtil.isNull(record.getDistrict()))
            criteria.andDistrictLike("%"+record.getDistrict()+"%");
        //处罚类型
        if (!StrUtil.isNull(record.getPunishType())){
            if(record.getPunishType().equals(PunishTypeEnum.IS_NULL.getValue()))
                criteria.andPunishTypeIsNull();
            else
                criteria.andPunishTypeEqualTo(PunishTypeEnum.getEnumByValue(record.getPunishType()).getName());
        }
        example.setOrderByClause("id desc");

        List<ExcelIpeIndustryRecord> list = excelIpeIndustryRecordMapper.selectByExample(example);
        PageInfo<ExcelIpeIndustryRecord> p = new PageInfo<ExcelIpeIndustryRecord>(list);
        return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
    }

    @Override
    public ExcelIpeIndustryRecord getOne(Integer recordId) {
        return excelIpeIndustryRecordMapper.selectByPrimaryKey(recordId);
    }

    @Override
    public ResponseModel saveOrUpdate(ExcelIpeIndustryRecord record, Integer userId) {
        ResponseModel result = new ResponseModel(1, "SUCCESS");
        int opnum = 0;
        if(record.getId() != null){
            record.setUpdater(userId);
            opnum = excelIpeIndustryRecordMapper.updateByPrimaryKeySelective(record);
        }else {
            record.setCreater(userId);
            opnum = excelIpeIndustryRecordMapper.insertSelective(record);
        }
        if(opnum <= 0)
            result.setCode(-1);
        return result;
    }


    @Override
    public ResponseModel deleteRecord(Integer recordId, Integer userId) {
        ResponseModel result = new ResponseModel(1, "SUCCESS");

        ExcelIpeIndustryRecordExample example = new ExcelIpeIndustryRecordExample();
        ExcelIpeIndustryRecordExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(recordId);
        criteria.andCreaterEqualTo(userId);
        int opnum = excelIpeIndustryRecordMapper.deleteByExample(example);
        if(opnum <= 0){
            result.setCode(-1);
            result.setMessage("删除失败");
        }

        return result;
    }

    @Override
    public ResponseModel deleteAll(Integer userId) {
        ResponseModel result = new ResponseModel(1, "SUCCESS");

        ExcelIpeIndustryRecordExample example = new ExcelIpeIndustryRecordExample();
        ExcelIpeIndustryRecordExample.Criteria criteria = example.createCriteria();
        criteria.andCreaterEqualTo(userId);
        int opnum = excelIpeIndustryRecordMapper.deleteByExample(example);
        if(opnum <= 0){
            result.setCode(-1);
            result.setMessage("删除失败");
        }
        return result;
    }


    @Override
    public ResponseModel affirm(Integer userId) {
        ExcelIpeIndustryRecordExample example = new ExcelIpeIndustryRecordExample();
        ExcelIpeIndustryRecordExample.Criteria criteria = example.createCriteria();
        criteria.andCreaterEqualTo(userId);
        List<ExcelIpeIndustryRecord> excelIpeIndustryRecordList =
                excelIpeIndustryRecordMapper.selectByExample(example);
        List<IpeIndustryRecord1> record1List = new ArrayList<IpeIndustryRecord1>();
        for(ExcelIpeIndustryRecord record:excelIpeIndustryRecordList){
            IpeIndustryRecord1 record1 = new IpeIndustryRecord1();
            org.springframework.beans.BeanUtils.copyProperties(record,record1);
            record1.setCreatedTime(new Date());
            record1.setCreater(userId);
            record1.setSource(IpeIndustryRecordSourceEnum.EXCEL.getValue());
            record1List.add(record1);
        }

        if(record1List.size() > 0){
            if(record1List.size() > 100){
                for(int i=1;i<= (record1List.size() % 100 == 0 ? record1List.size()/100:record1List.size()/100+1);i++){
                    ipeIndustryRecordMapper.insertBatch(record1List.subList((i-1)*100,i*100>record1List.size()?record1List.size():i*100));
                }
            }else {
                ipeIndustryRecordMapper.insertBatch(record1List);
            }
        }
        int opnum = excelIpeIndustryRecordMapper.deleteByExample(example);
        ResponseModel result = new ResponseModel(1, "SUCCESS");
        if(opnum <= 0){
            result.setCode(-1);
            result.setMessage("删除失败");
        }
        return result;
    }

    @Override
    public ResponseModel importData(MultipartFile file, Integer userId) {

        try {

            //判断当前用户是否有未提交的记录
            ExcelIpeIndustryRecordExample example = new ExcelIpeIndustryRecordExample();
            ExcelIpeIndustryRecordExample.Criteria criteria = example.createCriteria();
            criteria.andCreaterEqualTo(userId);
            if(excelIpeIndustryRecordMapper.countByExample(example) > 0){
                return new ResponseModel(-1,"请先提交或删除已存在的记录");
            }
            InputStream in = file.getInputStream();
            ExcelUtil eu = new ExcelUtil();
            eu.setStartReadPos(1);
            eu.setOnlyReadOneSheet(true);
            eu.setPrintMsg(false);
            List<Row> rows = eu.analysisExcel(in);
            Map<String,ExcelHead> excelHeadMap = excelHead(this.ipeHead);
            List<ExcelIpeIndustryRecord> recordList = new ArrayList<ExcelIpeIndustryRecord>();
            for(Row row : rows){
                ExcelIpeIndustryRecord record = new ExcelIpeIndustryRecord();
                for (String fieldName : excelHeadMap.keySet()){
                    try {
                        String fieldValue = ExcelUtil.getCellValue(row.getCell(excelHeadMap.get(fieldName).getCellNum()));
                        if(!StringUtils.isEmpty(fieldValue) && RegularizationUtil.rularization(excelHeadMap.get(fieldName).getRegular(),fieldValue))
                            BeanUtils.setProperty(record,fieldName,fieldValue);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return new ResponseModel(-1,"读取Excel文件失败",JSON.toJSONString(row));
                    }
                }
                record.setCreater(userId);
                recordList.add(record);
            }

            if(recordList.size() > 0){
                if(recordList.size() > 100){
                    for(int i=1;i<= (recordList.size() % 100 == 0 ? recordList.size()/100:recordList.size()/100+1);i++){
                        excelIpeIndustryRecordManualMapper.insertBatch(recordList.subList((i-1)*100,i*100>recordList.size()?recordList.size():i*100));
                    }
                }else {
                    excelIpeIndustryRecordManualMapper.insertBatch(recordList);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseModel(-1,"读取Excel文件失败");
        }
        return new ResponseModel(1,"导入成功");
    }


    private Map<String,ExcelHead> excelHead(String excelHead){
        JSONArray jsonArray = JSONArray.parseArray(excelHead);
        List<ExcelHead> list = jsonArray.toJavaList(ExcelHead.class);
        return list.stream().collect(
                Collectors.toMap(ExcelHead::getFieldName,Function.identity(),(key1 , key2) -> key2)
        );
    }
}
