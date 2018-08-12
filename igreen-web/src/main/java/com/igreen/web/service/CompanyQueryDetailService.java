package com.igreen.web.service;

import com.igreen.common.model.CompanyQueryDetail;

import java.util.List;

public interface CompanyQueryDetailService {

    List<CompanyQueryDetail> selectByParam(CompanyQueryDetail example);

}
