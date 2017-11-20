package com.igreen.boss.service.impl.basicInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.basicInfo.CompanyEmployeeService;
import com.igreen.common.dao.CompanyEmployeeMapper;
import com.igreen.common.model.CompanyEmployee;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.SelectOption;
import com.igreen.common.util.StrUtil;

@Service
public class CompanyEmployeeServiceImpl implements CompanyEmployeeService {
	
	Logger log = Logger.getLogger(CompanyEmployeeServiceImpl.class);
	
	@Resource
	CompanyEmployeeMapper employeeMapper;

	@Override
	public ResponseModel addEmployee(CompanyEmployee employee, Integer userId) {
		try{
			if(StrUtil.isNull(employee.getId())){
				employee.setStatus(1);
				employee.setCreater(userId);
				employee.setCreatedTime(new Date());
				employeeMapper.insertSelective(employee);
			}
			else{
				employee.setUpdater(userId);
				employee.setUpdatedTime(new Date());
				employeeMapper.updateByPrimaryKeySelective(employee);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public CompanyEmployee getOneEmployee(Integer employeeId) {
		return employeeMapper.selectByPrimaryKey(employeeId);
	}

	@Override
	public ListRange employeeList(CompanyEmployee employee, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(employee.getRegistItemId()))
			params.put("registItemId", employee.getRegistItemId());
		if(!StrUtil.isNull(employee.getName()))
			params.put("name", employee.getName());
		if(!StrUtil.isNull(employee.getJob()))
			params.put("job", employee.getJob());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(employeeMapper.pageEmployee(params), employeeMapper.countEmployee(params), currentPage, pageRows);
		return result;
	}

	@Override
	public List<SelectOption> getEmployeeOption(Integer registItemId) {
		List<SelectOption> result = new ArrayList<SelectOption>();
		List<CompanyEmployee> employees = employeeMapper.selectByRegistItemId(registItemId);
		for(CompanyEmployee employee : employees){
			result.add(new SelectOption(employee.getId(), employee.getName()+","+employee.getJob()));
		}
		return result;
	}

}
