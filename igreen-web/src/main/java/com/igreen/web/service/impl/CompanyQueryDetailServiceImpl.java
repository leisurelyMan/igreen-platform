package com.igreen.web.service.impl;

import com.igreen.common.dao.CompanyQueryDetailMapper;
import com.igreen.common.model.CompanyMonitorReportTemp;
import com.igreen.common.model.CompanyMonitorTemp;
import com.igreen.common.model.CompanyQueryBase;
import com.igreen.common.model.CompanyQueryDetail;
import com.igreen.web.service.CompanyQueryDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/8/12.
 */
@Service
public class CompanyQueryDetailServiceImpl implements CompanyQueryDetailService {

    @Resource
    CompanyQueryDetailMapper companyQueryDetailMapper;

    @Override
    public List<CompanyQueryDetail> selectByParam(CompanyQueryDetail example) {
        return companyQueryDetailMapper.selectByParam(example);
    }

    @Override
    public List<CompanyQueryBase> selectCompanyBaseByConfigId(Integer configid) {
        return companyQueryDetailMapper.selectCompanyBaseByConfigId(configid);
    }

    /**
     * 诉讼（件）
     *
     * @param configid
     * @return
     */
    @Override
    public List<CompanyMonitorTemp> selectJudgementsCountByConfigId(Integer configid) {
        return companyQueryDetailMapper.selectJudgementsCountByConfigId(configid);
    }

    /**
     * 专利（件）
     *
     * @param configid
     * @return
     */
    @Override
    public List<CompanyMonitorTemp> selectPatentCountByConfigId(Integer configid) {
        return companyQueryDetailMapper.selectPatentCountByConfigId(configid);
    }

    /**
     * 重点监管企业数
     *
     * @param configid
     * @return
     */
    @Override
    public List<CompanyMonitorTemp> selectCompaniesCountByConfigId(Integer configid) {
        return companyQueryDetailMapper.selectCompaniesCountByConfigId(configid);
    }

    /**
     * 排污许可数
     *
     * @param configid
     * @return
     */
    @Override
    public List<CompanyMonitorTemp> selectExecutionRecordsCountByConfigId(Integer configid) {
        return companyQueryDetailMapper.selectExecutionRecordsCountByConfigId(configid);
    }

    /**
     * 注册资本分布
     *
     * @param configid
     * @return
     */
    @Override
    public List<CompanyMonitorReportTemp> getRegistIndustry(Integer configid) {
        return companyQueryDetailMapper.getRegistIndustry(configid);
    }

    /**
     * 地域分布
     *
     * @param configid
     * @return
     */
    @Override
    public List<CompanyMonitorReportTemp> getRegistProvince(Integer configid) {
        return companyQueryDetailMapper.getRegistProvince(configid);
    }
}
