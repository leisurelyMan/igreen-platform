package com.igreen.boss.service.impl.basicInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.igreen.boss.service.basicInfo.QuestionnaireService;
import com.igreen.common.dao.QuestionnaireMapper;
import com.igreen.common.dao.SysDictionaryMapper;
import com.igreen.common.dao.SysNationMapper;
import com.igreen.common.dto.QuestionnaireDto;
import com.igreen.common.model.Questionnaire;
import com.igreen.common.model.SysDictionary;
import com.igreen.common.model.SysNation;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.RegularizationUtil;
import com.igreen.common.util.StrUtil;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {
	
	@Resource
	QuestionnaireMapper questionnaireMapper;
	
	@Resource
	SysDictionaryMapper sysDictionaryMapper;
	
	@Resource
	SysNationMapper sysNationMapper;

	@Override
	public QuestionnaireDto getOneQuestionnaire(Integer questionnaireId) {
		Questionnaire questionnaire = questionnaireMapper.selectByPrimaryKey(questionnaireId);
		QuestionnaireDto result = new QuestionnaireDto();
		if(questionnaire != null){
			result = new QuestionnaireDto(questionnaire);
		    result.setCustomerCompanyValue(getDictionaryValue(result.getCustomerCompany()));
		    result.setCountryValue(getNationValue(result.getCountry()));
		    result.setProvinceValue(getNationValue(result.getProvince()));
		    result.setIssuerQualityValue(getDictionaryValue(result.getIssuerQuality()));
		    result.setBondTypeValue(getDictionaryValue(result.getBondType()));
		    result.setIssueBondsAreaValue(getDictionaryValue(result.getIssueBondsArea()));
		    result.setBondsScopeValue(getDictionaryValue(result.getIssueBondsScope()));
		    result.setIssueBondsRecordsValue(getDictionaryValue(result.getIssueBondsRecords()));
		    result.setGreenBondsTypeValue(StringUtils.collectionToDelimitedString(getDicValues(result.getGreenBondsType()), ","));
		    result.setComplianceDocumentsValue(StringUtils.collectionToDelimitedString(getDicValues(result.getComplianceDocuments()), ","));
		    result.setComplianceProjectTypeValue(StringUtils.collectionToDelimitedString(getDicValues(result.getComplianceProjectType()), ","));
		    result.setAwardedComplianceDocumentsValue(StringUtils.collectionToDelimitedString(getDicValues(result.getAwardedComplianceDocuments()), ","));
		    
		}
		return result;
	}
	
	
	private String getDictionaryValue(Integer dicId){
		if(dicId == null)
			return "";
		SysDictionary dictionary = sysDictionaryMapper.selectByPrimaryKey(dicId);
		return dictionary == null?"":dictionary.getDicName();
	}
	
	
	private List<String> getDicValues(Integer dicId){
		if(dicId == null)
			return null;
		List<String> result = new ArrayList<String>();
		if(dicId.intValue() == 0){
			result.add("其他");
			return result;
		}
		SysDictionary dictionary = sysDictionaryMapper.selectByPrimaryKey(dicId);
		
		result.add(dictionary.getDicName());
		dictionary = sysDictionaryMapper.selectByPrimaryKey(dictionary.getDicParentId());
		result.add(dictionary.getDicName());
		return result;
	}
	
	private List<String> getDicValues(String dicId){
		if(dicId == null || "".equals(dicId.trim()))
			return null;
		List<String> result = new ArrayList<String>();
		String[] dicIds = dicId.split(",");
		for(String id:dicIds){
			if(RegularizationUtil.integerVerify(id))
				result.add(getDictionaryValue(Integer.parseInt(id)));
		}
		return result;
	}
	
	private String getNationValue(Integer nationId){
		if(nationId == null)
			return "";
		SysNation nation = sysNationMapper.selectByPrimaryKey(Long.parseLong(nationId+""));
		return nation == null?"":nation.getProvince();
	}
    

	@Override
	public ListRange questionnaireList(Questionnaire questionnaire, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(questionnaire.getProvince()))
			params.put("province", questionnaire.getProvince());
		if(!StrUtil.isNull(questionnaire.getStatus()))
			params.put("status", questionnaire.getStatus());
		if(!StrUtil.isNull(questionnaire.getCustomerName()))
			params.put("customerName", questionnaire.getCustomerName());
		if(!StrUtil.isNull(questionnaire.getCustomerMobile()))
			params.put("customerMobile", questionnaire.getCustomerMobile());
		if(!StrUtil.isNull(questionnaire.getCustomerMail()))
			params.put("customerMail", questionnaire.getCustomerMail());
		if(!StrUtil.isNull(questionnaire.getCustomerWechart()))
			params.put("customerWechart", questionnaire.getCustomerWechart());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(questionnaireMapper.pageQuestionnaire(params), questionnaireMapper.countQuestionnaire(params), currentPage, pageRows);
		return result;
	}

}
