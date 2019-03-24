package com.igreen.boss.service.impl.crawler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.crawler.CrawlerIpeIndustryRecordService;
import com.igreen.common.dao.CrawlerIpeIndustryRecordManualMapper;
import com.igreen.common.dao.CrawlerIpeIndustryRecordMapper;
import com.igreen.common.dao.IpeAiResultManualMapper;
import com.igreen.common.dao.IpeIndustryRecordMapper;
import com.igreen.common.enums.IpeIndustryRecordSourceEnum;
import com.igreen.common.enums.PunishTypeEnum;
import com.igreen.common.model.*;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CrawlerIpeIndustryRecordServiceImpl implements CrawlerIpeIndustryRecordService {

    @Resource
    CrawlerIpeIndustryRecordMapper crawlerIpeIndustryRecordMapper;

    @Resource
    IpeIndustryRecordMapper ipeIndustryRecordMapper;

    @Resource
    CrawlerIpeIndustryRecordManualMapper industryRecordManualMapper;

    @Resource
    IpeAiResultManualMapper ipeAiResultManualMapper;

    @Override
    public ListRange pageList(CrawlerIpeIndustryRecord record, Integer currentPage, Integer pageRows) {
        PageHelper.startPage(currentPage, pageRows);

        CrawlerIpeIndustryRecordExample example = new CrawlerIpeIndustryRecordExample();
        CrawlerIpeIndustryRecordExample.Criteria criteria = example.createCriteria();

        //网站名称
        if (!StrUtil.isNull(record.getWebName()))
            criteria.andWebNameLike("%"+record.getWebName()+"%");
        //网站域名
        if (!StrUtil.isNull(record.getWebDomain()))
            criteria.andWebDomainLike("%"+record.getWebDomain()+"%");
        //年度
        if (!StrUtil.isNull(record.getYear()))
            criteria.andYearEqualTo(record.getYear());
        //详情标题 对应title
        if (!StrUtil.isNull(record.getWebDetailName()))
            criteria.andWebDetailNameLike("%"+record.getWebDetailName()+"%");
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
        //状态
        if (record.getState() != null)
            criteria.andStateEqualTo(record.getState());
        //处罚类型
        if (!StrUtil.isNull(record.getPunishType())){
            if(record.getPunishType().equals(PunishTypeEnum.IS_NULL.getValue())) {
                criteria.andPunishTypeIsNull();
            }else if(record.getPunishType().equals(PunishTypeEnum.NOT_EQUAL.getValue())){
                List<String> punishList = new ArrayList<>();
                for(PunishTypeEnum punishTypeEnum:PunishTypeEnum.values()){
                    punishList.add(punishTypeEnum.getName());
                }
                criteria.andPunishTypeNotIn(punishList);
            }
            else
                criteria.andPunishTypeEqualTo(PunishTypeEnum.getEnumByValue(record.getPunishType()).getName());
        }
        example.setOrderByClause("id desc");

        List<CrawlerIpeIndustryRecord> list = crawlerIpeIndustryRecordMapper.selectByExample(example);
        PageInfo<CrawlerIpeIndustryRecord> p = new PageInfo<CrawlerIpeIndustryRecord>(list);
        return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
    }

    @Override
    public List<CrawlerIpeIndustryRecord> selectCrawlerIpeIndustryRecord(CrawlerIpeIndustryRecord record) {
        CrawlerIpeIndustryRecordExample example = new CrawlerIpeIndustryRecordExample();
        CrawlerIpeIndustryRecordExample.Criteria criteria = example.createCriteria();

        //网站名称
        if (!StrUtil.isNull(record.getWebName()))
            criteria.andWebNameLike("%"+record.getWebName()+"%");
        //网站域名
        if (!StrUtil.isNull(record.getWebDomain()))
            criteria.andWebDomainLike("%"+record.getWebDomain()+"%");
        //年度
        if (!StrUtil.isNull(record.getYear()))
            criteria.andYearEqualTo(record.getYear());
        //详情标题 对应title
        if (!StrUtil.isNull(record.getWebDetailName()))
            criteria.andWebDetailNameLike("%"+record.getWebDetailName()+"%");
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
        //状态
        if (record.getState() != null)
            criteria.andStateEqualTo(record.getState());
        //处罚类型
        if (!StrUtil.isNull(record.getPunishType())){
            if(record.getPunishType().equals(PunishTypeEnum.IS_NULL.getValue())) {
                criteria.andPunishTypeIsNull();
            }else if(record.getPunishType().equals(PunishTypeEnum.NOT_EQUAL.getValue())){
                List<String> punishList = new ArrayList<>();
                for(PunishTypeEnum punishTypeEnum:PunishTypeEnum.values()){
                    punishList.add(punishTypeEnum.getName());
                }
                criteria.andPunishTypeNotIn(punishList);
            }
            else
                criteria.andPunishTypeEqualTo(PunishTypeEnum.getEnumByValue(record.getPunishType()).getName());
        }
        example.setOrderByClause("id desc");

        List<CrawlerIpeIndustryRecord> list = crawlerIpeIndustryRecordMapper.selectByExample(example);
        return list;
    }

    @Override
    public CrawlerIpeIndustryRecord getOne(Integer recordId) {
        return crawlerIpeIndustryRecordMapper.selectByPrimaryKey(recordId);
    }

    @Override
    public ResponseModel saveOrUpdate(CrawlerIpeIndustryRecord record, Integer id) {
        ResponseModel result = new ResponseModel(1, "SUCCESS");
        int opnum = 0;
        if(record.getId() != null){
            record.setUpdater(id);
            record.setUpdateTime(new Date());
            opnum = crawlerIpeIndustryRecordMapper.updateByPrimaryKeySelective(record);
        }else {
            record.setCreater(id);
            record.setUpdateTime(new Date());
            opnum = crawlerIpeIndustryRecordMapper.insertSelective(record);
        }
        if(opnum <= 0)
            result.setCode(-1);
        return result;
    }


    @Override
    public ResponseModel affirm(List<Integer> recordIdList, Integer userId) {
        CrawlerIpeIndustryRecordExample example = new CrawlerIpeIndustryRecordExample();
        CrawlerIpeIndustryRecordExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(recordIdList);
        criteria.andStateEqualTo(1);
        if(crawlerIpeIndustryRecordMapper.countByExample(example) > 0){
            return new ResponseModel(-1, "包含已提交记录");
        }

        example.clear();
        criteria = example.createCriteria();
        criteria.andStateEqualTo(0);
        criteria.andIdIn(recordIdList);

        List<CrawlerIpeIndustryRecord> crawlerIpeIndustryRecordList =
                crawlerIpeIndustryRecordMapper.selectByExample(example);
        List<IpeIndustryRecord1> record1List = new ArrayList<IpeIndustryRecord1>();
        List<IpeAiResult> aiResultList = new ArrayList<IpeAiResult>();

        for(CrawlerIpeIndustryRecord record:crawlerIpeIndustryRecordList){
            IpeIndustryRecord1 record1 = new IpeIndustryRecord1();
            org.springframework.beans.BeanUtils.copyProperties(record,record1);
            record1.setFileName(record.getSavePath());
            record1.setCreatedTime(new Date());
            record1.setCreater(userId);
            record1.setSource(IpeIndustryRecordSourceEnum.CRAW.getValue());
            record1List.add(record1);

            IpeAiResult aiResult = new IpeAiResult();
            aiResult.setCompanyName(record1.getCompanyName());
            aiResult.setCreatedTime(new Date());
            aiResult.setIndustryTime(record1.getPunishTime());
            aiResult.setRegion(record1.getProvince()+" "+record1.getCity());
            aiResult.setIpeRecordId(record1.getId());
            //{'罚款': '罚款', '责令停产整顿': '停止违法行为'}
            aiResult.setKeyWords("{'"+record1.getPunishType()+"':'"+record1.getPunishType()+"', '罚款':'"+record1.getPunishMoney()+"'}");
            aiResultList.add(aiResult);
        }

        if(record1List.size() > 0){
            if(record1List.size() > 100){
                for(int i=1;i<= (record1List.size() % 100 == 0 ? record1List.size()/100:record1List.size()/100+1);i++){
                    ipeIndustryRecordMapper.insertBatch(record1List.subList((i-1)*100,i*100>record1List.size()?record1List.size():i*100));
                    ipeAiResultManualMapper.insertBatch(aiResultList.subList((i-1)*100,i*100>aiResultList.size()?aiResultList.size():i*100));
                }
            }else {
                ipeIndustryRecordMapper.insertBatch(record1List);
                ipeAiResultManualMapper.insertBatch(aiResultList);
            }
        }
        int opnum = industryRecordManualMapper.commitRecord(recordIdList);
        ResponseModel result = new ResponseModel(1, "SUCCESS");
        if(opnum <= 0){
            result.setCode(-1);
            result.setMessage("删除失败");
        }
        return result;
    }

    @Override
    public ResponseModel deleteByWebDomain(String webDomain) {
        CrawlerIpeIndustryRecordExample example = new CrawlerIpeIndustryRecordExample();
        CrawlerIpeIndustryRecordExample.Criteria criteria = example.createCriteria();
        criteria.andWebDomainEqualTo(webDomain);
        int opnum = crawlerIpeIndustryRecordMapper.deleteByExample(example);
        ResponseModel result = new ResponseModel(1, "SUCCESS");
        if(opnum <= 0){
            result.setCode(-1);
            result.setMessage("删除失败");
        }
        return result;
    }


    @Override
    public ResponseModel deleteHistory(String webDomain) {
        CrawlerIpeIndustryRecordExample example = new CrawlerIpeIndustryRecordExample();
        CrawlerIpeIndustryRecordExample.Criteria criteria = example.createCriteria();
        criteria.andWebDomainEqualTo(webDomain);
        criteria.andYearNotEqualTo("2018");
        criteria.andYearNotEqualTo("");
        int opnum = crawlerIpeIndustryRecordMapper.deleteByExample(example);
        ResponseModel result = new ResponseModel(1, "SUCCESS");
        if(opnum <= 0){
            result.setCode(-1);
            result.setMessage("删除失败");
        }
        return result;
    }
}
