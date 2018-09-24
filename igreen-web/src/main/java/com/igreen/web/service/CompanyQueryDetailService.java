package com.igreen.web.service;

import com.igreen.common.model.CompanyMonitorReportTemp;
import com.igreen.common.model.CompanyMonitorTemp;
import com.igreen.common.model.CompanyQueryBase;
import com.igreen.common.model.CompanyQueryDetail;

import java.util.List;

public interface CompanyQueryDetailService {

    List<CompanyQueryDetail> selectByParam(CompanyQueryDetail example);

    List<CompanyQueryBase> selectCompanyBaseByConfigId(Integer configid);

    /**
     * 诉讼（件）
     * @param configid
     * @return
     */
    List<CompanyMonitorTemp> selectJudgementsCountByConfigId(Integer configid);

    /**
     * 专利（件）
     * @param configid
     * @return
     */
    List<CompanyMonitorTemp> selectPatentCountByConfigId(Integer configid);

    /**
     * 重点监管企业数
     * @param configid
     * @return
     */
    List<CompanyMonitorTemp> selectCompaniesCountByConfigId(Integer configid);

    /**
     * 排污许可数
     * @param configid
     * @return
     */
    List<CompanyMonitorTemp> selectExecutionRecordsCountByConfigId(Integer configid);

    /**
     * 注册资本分布
     * @param configid
     * @return
     */
    List<CompanyMonitorReportTemp> getRegistIndustry(Integer configid);

    /**
     * 地域分布
     *
     * @param configid
     * @return
     */
    List<CompanyMonitorReportTemp> getRegistProvince(Integer configid);
}
