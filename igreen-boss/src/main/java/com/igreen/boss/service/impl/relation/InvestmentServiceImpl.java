package com.igreen.boss.service.impl.relation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.relation.InvestmentService;
import com.igreen.common.dao.InvestmentMapper;
import com.igreen.common.model.Investment;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class InvestmentServiceImpl implements InvestmentService {
	
	Logger log = Logger.getLogger(InvestmentServiceImpl.class);
	
	@Resource
	InvestmentMapper investmentMapper;

	@Override
	public ResponseModel addInvestment(Investment investment, Integer userId) {
		try{
			if(StrUtil.isNull(investment.getId())){
				investment.setStatus(1);
				investment.setCreater(userId);
				investment.setCreatedTime(new Date());
				investmentMapper.insertSelective(investment);
			}
			else{
				investment.setUpdater(userId);
				investment.setUpdatedTime(new Date());
				investmentMapper.updateByPrimaryKeySelective(investment);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public Investment getOneInvestment(Integer investmentId) {
		return investmentMapper.selectByPrimaryKey(investmentId);
	}

	@Override
	public ListRange investmentList(Investment investment, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(investment.getRegistItemId()))
			params.put("registItemId", investment.getRegistItemId()); 
		if(!StrUtil.isNull(investment.getCompanyName()))
			params.put("companyName", investment.getCompanyName()); 
		if(!StrUtil.isNull(investment.getRegistNo()))
			params.put("registNo", investment.getRegistNo());
		if(!StrUtil.isNull(investment.getCompanyType()))
			params.put("companyType", investment.getCompanyType());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(investmentMapper.pageInvestment(params), 
				investmentMapper.countInvestment(params), currentPage, pageRows);
		return result;
	}

}
