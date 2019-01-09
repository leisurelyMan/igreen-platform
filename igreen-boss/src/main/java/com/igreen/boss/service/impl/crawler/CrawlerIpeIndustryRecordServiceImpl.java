package com.igreen.boss.service.impl.crawler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.crawler.CrawlerIpeIndustryRecordService;
import com.igreen.common.dao.CrawlerIpeIndustryRecordMapper;
import com.igreen.common.enums.PunishTypeEnum;
import com.igreen.common.model.CrawlerIpeIndustryRecord;
import com.igreen.common.model.CrawlerIpeIndustryRecordExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CrawlerIpeIndustryRecordServiceImpl implements CrawlerIpeIndustryRecordService {

    @Resource
    CrawlerIpeIndustryRecordMapper crawlerIpeIndustryRecordMapper;

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
        //处罚类型
        if (!StrUtil.isNull(record.getPunishType())){
            if(record.getPunishType().equals(PunishTypeEnum.IS_NULL.getValue()))
                criteria.andPunishTypeIsNull();
            else
                criteria.andPunishTypeEqualTo(PunishTypeEnum.getEnumByValue(record.getPunishType()).getName());
        }
        example.setOrderByClause("id desc");

        List<CrawlerIpeIndustryRecord> list = crawlerIpeIndustryRecordMapper.selectByExample(example);
        PageInfo<CrawlerIpeIndustryRecord> p = new PageInfo<CrawlerIpeIndustryRecord>(list);
        return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
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
    public ResponseModel importData(List<Row> rows, Integer id) {

        return null;
    }

}
