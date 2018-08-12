package com.igreen.web.service.impl;

import com.igreen.common.dao.CompanyQueryDetailMapper;
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
}
