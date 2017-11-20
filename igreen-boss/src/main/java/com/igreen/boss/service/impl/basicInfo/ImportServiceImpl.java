package com.igreen.boss.service.impl.basicInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Service;

import com.igreen.boss.enums.ImportEnum;
import com.igreen.boss.service.basicInfo.ImportService;
import com.igreen.boss.util.ExcelUtil;
import com.igreen.common.dao.AdministrativePenaltyMapper;
import com.igreen.common.dao.BranchMapper;
import com.igreen.common.dao.BrandMapper;
import com.igreen.common.dao.BreakPromiseExecutedMapper;
import com.igreen.common.dao.ChattelMortgageMapper;
import com.igreen.common.dao.CompanyEmployeeMapper;
import com.igreen.common.dao.CopyrightMapper;
import com.igreen.common.dao.CourtNoticeMapper;
import com.igreen.common.dao.DomainNameMapper;
import com.igreen.common.dao.ExchangeMapper;
import com.igreen.common.dao.ExecutedItemMapper;
import com.igreen.common.dao.FreezeStockRightMapper;
import com.igreen.common.dao.InvestmentMapper;
import com.igreen.common.dao.InviteMapper;
import com.igreen.common.dao.OpenCourtNoticeMapper;
import com.igreen.common.dao.OrganizationItemMapper;
import com.igreen.common.dao.PatentMapper;
import com.igreen.common.dao.PledgeStockRightMapper;
import com.igreen.common.dao.RegistItemMapper;
import com.igreen.common.dao.RelationCompanyMapper;
import com.igreen.common.dao.ShareholderMapper;
import com.igreen.common.dao.SoftwareCopyrightMapper;
import com.igreen.common.dao.ThingChattelMortgageMapper;
import com.igreen.common.dao.WrittenJudgementMapper;
import com.igreen.common.model.AdministrativePenalty;
import com.igreen.common.model.Branch;
import com.igreen.common.model.Brand;
import com.igreen.common.model.BreakPromiseExecuted;
import com.igreen.common.model.ChattelMortgage;
import com.igreen.common.model.CompanyEmployee;
import com.igreen.common.model.Copyright;
import com.igreen.common.model.CourtNotice;
import com.igreen.common.model.DomainName;
import com.igreen.common.model.Exchange;
import com.igreen.common.model.ExecutedItem;
import com.igreen.common.model.FreezeStockRight;
import com.igreen.common.model.Investment;
import com.igreen.common.model.Invite;
import com.igreen.common.model.OpenCourtNotice;
import com.igreen.common.model.OrganizationItem;
import com.igreen.common.model.Patent;
import com.igreen.common.model.PledgeStockRight;
import com.igreen.common.model.RegistItem;
import com.igreen.common.model.RelationCompany;
import com.igreen.common.model.Shareholder;
import com.igreen.common.model.SoftwareCopyright;
import com.igreen.common.model.ThingChattelMortgage;
import com.igreen.common.model.WrittenJudgement;
import com.igreen.common.util.BeanToMapUtil;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class ImportServiceImpl implements ImportService {
	
	@Resource
	RegistItemMapper registItemMapper;
	
	@Resource
	ShareholderMapper shareholderMapper;
	
	@Resource
	CompanyEmployeeMapper companyEmployeeMapper;
	
	@Resource
	ExchangeMapper exchangeMapper;
	
	@Resource
	OrganizationItemMapper organizationItemMapper;
	
	@Resource
	OpenCourtNoticeMapper openCourtNoticeMapper;
	
	@Resource
	WrittenJudgementMapper writtenJudgementMapper;
	
	@Resource
	ExecutedItemMapper executedItemMapper;
	
	@Resource
	BreakPromiseExecutedMapper breakPromiseExecutedMapper;
	
	@Resource
	CourtNoticeMapper courtNoticeMapper;
	
	@Resource
	AdministrativePenaltyMapper administrativePenaltyMapper;
	
	@Resource
	FreezeStockRightMapper freezeStockRightMapper;
	
	@Resource
	PledgeStockRightMapper pledgeStockRightMapper;
	
	@Resource
	ChattelMortgageMapper chattelMortgageMapper;
	
	@Resource
	ThingChattelMortgageMapper thingChattelMortgageMapper;
	
	@Resource
	BranchMapper branchMapper;
	
	@Resource
	InvestmentMapper investmentMapper;
	
	@Resource
	RelationCompanyMapper relationCompanyMapper;
	
	@Resource
	InviteMapper inviteMapper;
	
	@Resource
	PatentMapper patentMapper;
	
	@Resource
	BrandMapper brandMapper;
	
	@Resource
	CopyrightMapper copyrightMapper;
	
	@Resource
	SoftwareCopyrightMapper softwareCopyrightMapper;
	
	@Resource
	DomainNameMapper domainNameMapper;
	
	private int index;
	
	@Override
	public ResponseModel importCompanyData(List<Row> rows,String override,Integer userId) {
		
		String colComents = "企业名称,法人代表姓名,注册号,原注册号,注册资本(万元),实收资本 (万元),币种,企业(机构)类型,经营状态,经营期限 自,经营期限 至,开业日期,注销日期,吊销日期,登记机关,"
				+ "地址,最后年检年度,最后年检日期,行业门类代码,行业门类名称,国民经济行业代码,国民经济行业名称,许可经营项目,一般经营项目,经营(业务)范围,经营(业务)范围及方式";
		String colNames = "companyName,legalRepresentative,registNumber,oldRegistNumber,registeredCapital,paidInCapital,currency,companyType,operateState,"
				+ "startTime,endTime,openTime,cancelTime,revokeTime,registOffice,address,annualYear,annualDay,tradeCode,tradeName,countryTradeCode,"
				+ "countryTradeName,permission,general,businessScope,businessWay";
		String[] arrayColComents = colComents.split(",");
		String[] arrayColNames = colNames.split(",");
		Map<String, String> registItems = new HashMap<String, String>();
		Map<String, String> registItemMap = new HashMap<String, String>();
		for(int i=0;i<arrayColComents.length;i++){
			registItems.put(arrayColComents[i], arrayColNames[i]);
		}
		RegistItem registItem = new RegistItem();
		index = 0;
		for(;index<rows.size();){
			Row row = rows.get(index);
			//登记信息
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("登记信息")){
				for(int j=0;j<=25;j++){
					row = rows.get(++index);
					if(registItems.containsKey(ExcelUtil.getCellValue(row.getCell(0))))
						registItemMap.put(registItems.get(ExcelUtil.getCellValue(row.getCell(0))), ExcelUtil.getCellValue(row.getCell(1)));
				}
				registItemMap.put("creater", userId+"");
				registItemMap.put("status", 0+"");
				//重复性判断
				if(!registItemMap.containsKey("registNumber") || StrUtil.isNull(registItemMap.get("registNumber")))
					return new ResponseModel(-1, ImportEnum.REGISTNUMBER_ERROR.getStrVal());
				Integer registNum = registItemMapper.countByRegistNumber(registItemMap.get("registNumber"));
				if(override.equals("0")){
					//不覆盖
					if(registNum.intValue() > 0)
						return new ResponseModel(-1, ImportEnum.EXISTST.getStrVal());
				}else{
					//覆盖数据，若存在，则清空
					if(registNum.intValue() > 0)
						deleteRegistItem(registItemMap.get("registNumber"));
				}
				registItem = (RegistItem) BeanToMapUtil.convertMap(RegistItem.class, registItemMap);
				registItem.setDataSource(2);
				if(registItem != null)
					registItemMapper.insertSelective(registItem);
				else
					return new ResponseModel(-1, ImportEnum.ERROR.getStrVal());
			}
			
			//股东及出资信息
			List<Map<String, String>> datas = new ArrayList<Map<String, String>>();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("股东及出资信息")){
				row = rows.get(++index);
				colComents = "股东名称,认缴出资额(万元),币种,出资比例,出资日期,国籍";
				colNames = "shareholderName,capital,currency,ratio,contributiveTime,nationality";
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
				    data.put("status", 0+"");
				    data.put("creater", userId+"");
					Shareholder record = (Shareholder) BeanToMapUtil.convertMap(Shareholder.class, data);
					record.setCreatedTime(new Date());
					if(record != null)
						shareholderMapper.insertSelective(record);
				}
			}
			
			//主要人员信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("主要人员信息")){
				row = rows.get(++index);
				colComents = "人员姓名,职务";
				colNames = "name,job";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
				    data.put("status", 0+"");
				    data.put("creater", userId+"");
					CompanyEmployee record = (CompanyEmployee) BeanToMapUtil.convertMap(CompanyEmployee.class, data);
					record.setCreatedTime(new Date());
					companyEmployeeMapper.insertSelective(record);
				}
			}
			
			//变更信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("变更信息")){
				row = rows.get(++index);
				colComents = "变更事项,变更前内容,变更后内容,变更日期";
				colNames = "exchangeItem,beforeItem,afterItem,exchangeTime";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
				    data.put("status", 0+"");
				    data.put("creater", userId+"");
					Exchange record = (Exchange) BeanToMapUtil.convertMap(Exchange.class, data);
					record.setCreatedTime(new Date());
					exchangeMapper.insertSelective(record);
				}
			}
			
			//组织机构代码证信息
			row = rows.get(index);
			printRow(row);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("组织机构代码证信息")){
				row = rows.get(++index);
				colComents = "机构代码,机构名称,机构类型,机构地址,管辖机构";
				colNames = "organizationCode,organizationName,organizationType,organizationAddress,jurisdictionalAgency";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
				    data.put("status", 0+"");
				    data.put("creater", userId+"");
					OrganizationItem record = (OrganizationItem) BeanToMapUtil.convertMap(OrganizationItem.class, data);
					record.setCreatedTime(new Date());
					organizationItemMapper.insertSelective(record);
				}
			}
			
			//开庭公告
			row = rows.get(index);
			printRow(row);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("开庭公告")){
				row = rows.get(++index);
				colComents = "标题";
				colNames = "title";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
				    data.put("status", 0+"");
				    data.put("creater", userId+"");
					OpenCourtNotice record = (OpenCourtNotice) BeanToMapUtil.convertMap(OpenCourtNotice.class, data);
					record.setCreatedTime(new Date());
					openCourtNoticeMapper.insertSelective(record);
				}
			}
			
			//裁判文书信息
			row = rows.get(index);
			printRow(row);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("裁判文书信息")){
				row = rows.get(++index);
				colComents = "时间,案件类型,标题";
				colNames = "caseTime,caseType,caseTitle";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
				    data.put("status", 0+"");
				    data.put("creater", userId+"");
					WrittenJudgement record = (WrittenJudgement) BeanToMapUtil.convertMap(WrittenJudgement.class, data);
					record.setCreatedTime(new Date());
					writtenJudgementMapper.insertSelective(record);
				}
			}
			
			//被执行人信息
			row = rows.get(index);
			printRow(row);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("被执行人信息")){
				row = rows.get(++index);
				colComents = "立案时间,案件状态,案号,执行标的,执行法院";
				colNames = "caseFilingTime,caseStatus,caseNo,executeTarget,executeCourt";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
				    data.put("status", 0+"");
				    data.put("creater", userId+"");
					ExecutedItem record = (ExecutedItem) BeanToMapUtil.convertMap(ExecutedItem.class, data);
					record.setCreatedTime(new Date());
					executedItemMapper.insertSelective(record);
				}
			}
			
			//失信被执行人信息
			row = rows.get(index);
			printRow(row);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("失信被执行人信息")){
				row = rows.get(++index);
				colComents = "立案时间,法定代表人,组织机构号,生效法律文书确定的义务,失信被执行人为具体情形,被执行人的履行情况,全部未履行,公布时间,省份,执行依据文号,执行法院";
				colNames = "caseFilingTime,legalPerson,organizationNo,obligation,executedCondition,performCondition,nonperforming,publishTime,province,accordingNo,executeCourt";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
				    data.put("status", 0+"");
				    data.put("creater", userId+"");
					BreakPromiseExecuted record = (BreakPromiseExecuted) BeanToMapUtil.convertMap(BreakPromiseExecuted.class, data);
					record.setCreatedTime(new Date());
					breakPromiseExecutedMapper.insertSelective(record);
				}
			}
			
			//法院公告
			row = rows.get(index);
			printRow(row);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("法院公告")){
				row = rows.get(++index);
				colComents = "时间,公告类型,法院,公告内容";
				colNames = "noticeTime,noticeType,court,notice";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					//BreakPromiseExecuted record = new BreakPromiseExecuted(data);
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						CourtNotice record = (CourtNotice) BeanToMapUtil.convertMap(CourtNotice.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							courtNoticeMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//行政处罚信息
			row = rows.get(index);
			printRow(row);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("行政处罚信息")){
				row = rows.get(++index);
				colComents = "案发时间,案由,案件类型,执行类别,案件结果,处罚决定书签发日期,处罚机关,主要违法事实,处罚依据,处罚种类,处罚结果,处罚金额,处罚执行情况";
				colNames = "crimeTime,crimeReason,caseType,executeType,caseResult,punishTime,punishOffice,factMalfeasance,punishBase,punishType,punishResult,punishAmount,punishment";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					//BreakPromiseExecuted record = new BreakPromiseExecuted(data);
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						AdministrativePenalty record = (AdministrativePenalty) BeanToMapUtil.convertMap(AdministrativePenalty.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							administrativePenaltyMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//股权冻结信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("股权冻结信息")){
				row = rows.get(++index);
				colComents = "冻结文号,冻结机关,冻结起始日期,冻结截至日期,冻结金额,解冻机关,解冻文号,解冻日期,解冻说明";
				colNames = "freezeNo,freezeOffice,freezeBeginTime,freezeEndTime,freezeAmount,unfreezeOffice,unfreezeNo,unfreezeTime,unfreezeExplain";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					//BreakPromiseExecuted record = new BreakPromiseExecuted(data);
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						FreezeStockRight record = (FreezeStockRight) BeanToMapUtil.convertMap(FreezeStockRight.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							freezeStockRightMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			
			//股权质押信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("股权质押信息")){
				row = rows.get(++index);
				colComents = "质权人姓名,出质人类别,出质金额,出质备案日期,出质审批部门,出质批准日期,出质截至日期";
				colNames = "pledgee,pledgeeType,pledgeAmount,recordTime,examinedOffice,examinedTime,examinedEndTime";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					//BreakPromiseExecuted record = new BreakPromiseExecuted(data);
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						PledgeStockRight record = (PledgeStockRight) BeanToMapUtil.convertMap(PledgeStockRight.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							pledgeStockRightMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			
			//动产抵押信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("动产抵押信息")){
				row = rows.get(++index);
				colComents = "抵押ID,抵押人,抵押权人,登记机关,登记日期,状态标识,登记证号,申请抵押原因,被担保主债权种类,被担保主债权数额(万元),履约起始日期,履约截止日期,注销日期";
				colNames = "mortgageId,mortgagee,pledgee,registOffice,registTime,mortgageStatus,registNo,mortgageReason,creditorType,creditorAmount,beginTime,endTime,cancelTime";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					//BreakPromiseExecuted record = new BreakPromiseExecuted(data);
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						ChattelMortgage record = (ChattelMortgage) BeanToMapUtil.convertMap(ChattelMortgage.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							chattelMortgageMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//动产抵押物信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("动产抵押物信息")){
				row = rows.get(++index);
				colComents = "抵押ID,抵押物名称,数量,价值(万元)";
				colNames = "mortgageId,thingName,thingNum,thingAmount";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						ThingChattelMortgage record = (ThingChattelMortgage) BeanToMapUtil.convertMap(ThingChattelMortgage.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							thingChattelMortgageMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//分支机构信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("分支机构信息")){
				row = rows.get(++index);
				colComents = "分支机构名称,分支机构企业注册号,分支机构负责人,一般经营项目,分支机构地址";
				colNames = "branchName,branchRegistNo,principal,general,address";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						Branch record = (Branch) BeanToMapUtil.convertMap(Branch.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							branchMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//企业投资
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("企业投资")){
				row = rows.get(++index);
				colComents = "企业(机构)名称,注册号,企业(机构)类型,注册资本(万元),注册资本币种,企业状态,注销日期,吊销日期,登记机关,认缴出资额(万元),认缴出资币种,出资比例,开业日期,法定代表人姓名";
				colNames = "companyName,registNo,companyType,registAmount,registCurrency,companyStatus,cancelTime,revokeTime,registOffice,subscribeCapital,subscribeCurrency,ratio,openTime,legalRepresentative";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						Investment record = (Investment) BeanToMapUtil.convertMap(Investment.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							investmentMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			
			//关联企业
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("关联企业")){
				row = rows.get(++index);
				colComents = "企业名称,任职,投资（万元）,持股比例,注册资本（万元）,注册资本币种,企业（机构）类型,注册号,登记机关,企业状态";
				colNames = "companyName,job,investment,ratio,registAmount,registCurrency,companyType,registNo,registOffice,companyStatus";
				registItems.clear();
				//关联人信息
				Integer employeeId=null;
				Map<String, Object> param = new HashMap<String, Object>();
				param.put("registItemId", registItem.getId());
				param.put("name", ExcelUtil.getCellValue(row.getCell(0)));
				List<CompanyEmployee> employees = companyEmployeeMapper.selectByRegistItemIdAndName(param);
				if(!employees.isEmpty())
					employeeId = employees.get(0).getId();
				row = rows.get(++index);
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);

				//插入数据
				for(Map<String, String> data : datas){
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						RelationCompany record = (RelationCompany) BeanToMapUtil.convertMap(RelationCompany.class, data);
						record.setCreatedTime(new Date());
						record.setEmployeeId(employeeId);
						if(record != null)
							relationCompanyMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//招聘信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("招聘信息")){
				row = rows.get(++index);
				colComents = "职位,薪资,经验要求,地点,学历,发布日期,来源";
				colNames = "job,salary,experience,address,education,publishTime,source";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						Invite record = (Invite) BeanToMapUtil.convertMap(Invite.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							inviteMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//专利信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("专利信息")){
				row = rows.get(++index);
				colComents = "申请日期,类型,名称";
				colNames = "applyTime,patentType,patentName";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						Patent record = (Patent) BeanToMapUtil.convertMap(Patent.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							patentMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//商标信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("商标信息")){
				row = rows.get(++index);
				colComents = "商标名称,申请日期,状态,注册号,类别";
				colNames = "brandName,applyTime,brandStatus,registNo,brandType";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						Brand record = (Brand) BeanToMapUtil.convertMap(Brand.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							brandMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//著作权信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("著作权信息")){
				row = rows.get(++index);
				colComents = "作品名称,登记号,类别,创作完成日期,登记日期,首次发布日期,最后更新时间";
				colNames = "productionName,registNo,productionType,completeTime,registTime,firstPublishTime,lastUpdateTime";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						Copyright record = (Copyright) BeanToMapUtil.convertMap(Copyright.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							copyrightMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//软件著作权信息
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("软件著作权信息")){
				row = rows.get(++index);
				colComents = "软件名称,软件简称,登记号,版本号,分类号,登记批准日期";
				colNames = "softwareName,softwareShopName,registNo,softwareVersion,classifyNo,approveRegistTime";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						SoftwareCopyright record = (SoftwareCopyright) BeanToMapUtil.convertMap(SoftwareCopyright.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							softwareCopyrightMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			//域名
			row = rows.get(index);
			datas.clear();
			if(row.getLastCellNum()==1 && ExcelUtil.getCellValue(row.getCell(0)).trim().equals("域名")){
				row = rows.get(++index);
				colComents = "网址,网址名称,网站备案/许可证号,登记批准日期";
				colNames = "location,locationName,licenseKey,approveRegistTime";
				registItems.clear();
				createDatas(rows, userId, colComents, colNames, registItems, registItem, datas);
				//插入数据
				for(Map<String, String> data : datas){
					try {
					    data.put("status", 0+"");
					    data.put("creater", userId+"");
						DomainName record = (DomainName) BeanToMapUtil.convertMap(DomainName.class, data);
						record.setCreatedTime(new Date());
						if(record != null)
							domainNameMapper.insertSelective(record);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			index++;
			printRow(row);
		}
		return null;
	}



	private void createDatas(List<Row> rows, Integer userId, String colComents, String colNames,
			Map<String, String> registItems, RegistItem registItem, List<Map<String, String>> datas) {
		
		String[] arrayColComents;
		String[] arrayColNames;
		arrayColComents = colComents.split(",");
		arrayColNames = colNames.split(",");
		Row row = rows.get(index);
		for(int k=0;k<arrayColComents.length;k++){
			registItems.put(arrayColComents[k], arrayColNames[k]);
		}
		Map<Integer, String> headMap = new HashMap<Integer, String>();
		//表头
		for (int j = 0; j < row.getLastCellNum(); j++) {
			if(registItems.containsKey(ExcelUtil.getCellValue(row.getCell(j))))
				headMap.put(j, registItems.get(ExcelUtil.getCellValue(row.getCell(j))));
		}
		//组装数据
		while(rows.size()> ++index && (row = rows.get(index)).getLastCellNum()>1){
			Map<String, String> data = new HashMap<String, String>();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				data.put(headMap.get(j), ExcelUtil.getCellValue(row.getCell(j)));
			}
			data.put("registItemId", registItem.getId()+"");
			data.put("creater", userId+"");
			datas.add(data);
		}
	}



	private void printRow(Row row) {
		for (int j = 0; j < row.getLastCellNum(); j++) {
			 String value = ExcelUtil.getCellValue(row.getCell(j));
			 if (!value.equals("")) {
				 System.out.print(value+"|");
			 }
		 }
		 System.out.println("");
	}

	
	
	private void deleteRegistItem(String registNumber) {
		List<RegistItem> list = registItemMapper.selectByRegistNumber(registNumber);
		RegistItem item = null;
		if(list.isEmpty())
			return;
		item = list.get(0);
		deleteRegistItemById(item.getId());
	}



	@Override
	public void deleteRegistItemById(Integer id) {
		shareholderMapper.deleteByRegistItemId(id);
		companyEmployeeMapper.deleteByRegistItemId(id);
		exchangeMapper.deleteByRegistItemId(id);
		organizationItemMapper.deleteByRegistItemId(id);
		openCourtNoticeMapper.deleteByRegistItemId(id);
		writtenJudgementMapper.deleteByRegistItemId(id);
		executedItemMapper.deleteByRegistItemId(id);
		breakPromiseExecutedMapper.deleteByRegistItemId(id);
		courtNoticeMapper.deleteByRegistItemId(id);
		administrativePenaltyMapper.deleteByRegistItemId(id);
		freezeStockRightMapper.deleteByRegistItemId(id);
		pledgeStockRightMapper.deleteByRegistItemId(id);
		chattelMortgageMapper.deleteByRegistItemId(id);
		thingChattelMortgageMapper.deleteByRegistItemId(id);
		branchMapper.deleteByRegistItemId(id);
		investmentMapper.deleteByRegistItemId(id);
		relationCompanyMapper.deleteByRegistItemId(id);
		inviteMapper.deleteByRegistItemId(id);
		patentMapper.deleteByRegistItemId(id);
		brandMapper.deleteByRegistItemId(id);
		copyrightMapper.deleteByRegistItemId(id);
		softwareCopyrightMapper.deleteByRegistItemId(id);
		domainNameMapper.deleteByRegistItemId(id);
		
		registItemMapper.deleteByPrimaryKey(id);
	}

}
