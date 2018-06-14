package com.igreen.boss.controller.ipepython;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.qichacha.QichachaCompanyBaseService;
import com.igreen.boss.util.ExcelUtil;
import com.igreen.boss.util.HttpClientHelper;
import com.igreen.common.dto.AiIpeSearch;
import com.igreen.common.model.AiIpe;
import com.igreen.common.model.QichachaCompanyBase;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.*;

/**
 * Created by Administrator on 2018/6/10.
 */
@Controller
@RequestMapping(value = "/aiIpe")
public class AiIpeController extends BaseController {

    private Logger log = Logger.getLogger(AiIpeController.class);

    @Resource
    QichachaCompanyBaseService companyBaseService;

    /**
     * 跳转爬虫数据列表页面
     * @param model
     * @return
     */
    @RequestMapping(value="toAiPage")
    public ModelAndView toMepData(ModelMap model){
        List<QichachaCompanyBase> companyBases = companyBaseService.selectIndustryByParam(null);
        model.addAttribute("companyBases", companyBases);
        return new ModelAndView("ai/ipe.jsp",model);
    }

    @RequestMapping(value = "getSubIndustry")
    public  @ResponseBody ResponseModel getSubIndustry(@RequestParam(value = "industry") String industry){

        Map<String , Object> param = new HashMap<String, Object>();
        param.put("industry",industry);
        ResponseModel model = new ResponseModel();
        try {
            model.setObj(companyBaseService.selectSubIndustryByParam(param));
            model.setCode(1);
            model.setMessage("成功！");
        } catch (Exception e) {
            log.error("系统异常", e);
            model.setCode(0);
            model.setMessage("系统异常，请稍后再试！");
        }

        return model;
    }

    @RequestMapping(value = "ipeListData")
    public @ResponseBody ListRange ipeListData(AiIpeSearch aiIpeSearch){
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();

        List<String> companyList = new ArrayList<String>();
        if(!StringUtils.isEmpty(aiIpeSearch.getCompany())){
            companyList = Arrays.asList(aiIpeSearch.getCompany().split(","));
        }
        for (String companyStr : companyList) {
            map = new HashMap<>();
            map.put("company", companyStr);
            if(!StringUtils.isEmpty(aiIpeSearch.getYear())){
                map.put("year", aiIpeSearch.getYear());
            }
            if(!StringUtils.isEmpty(aiIpeSearch.getSeason())){
                map.put("season", aiIpeSearch.getSeason());
            }
            JSONArray regionArr = new JSONArray();
            if(!StringUtils.isEmpty(aiIpeSearch.getProvince())){
                regionArr.add(aiIpeSearch.getProvince());
            }
            if(!StringUtils.isEmpty(aiIpeSearch.getCity())){
                regionArr.add(aiIpeSearch.getCity());
            }
            if(!regionArr.isEmpty()){
                map.put("region", JSON.toJSONString(regionArr));
            }
            if(!StringUtils.isEmpty(aiIpeSearch.getIndustry())){
                map.put("industry", aiIpeSearch.getIndustry());
            }
            if(!StringUtils.isEmpty(aiIpeSearch.getSubIndustry())){
                map.put("subIndustry", aiIpeSearch.getSubIndustry());
            }
            list.add(map);
        }

        if(list.size() == 0){
            return new ListRange();
        }

        Map<String, Object> param = new HashMap<String, Object>();
        //param.put("reqstr", JSON.toJSONString(list));
        param.put("reqstr", list);
        log.info("params="+JSON.toJSONString(param));
        String result = HttpClientHelper.sendPost3("http://localhost:4411", param, "UTF-8");
        log.info("result="+result);

        List<AiIpe> aiIpeList = convertModels(result);
        if(aiIpeList.size() == 0){
            return new ListRange();
        }

        return new ListRange(aiIpeList, aiIpeList.size(), 1, aiIpeList.size());
    }

    /**
     * 导入数据
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value="uploadCompany",method={RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResponseModel uploadMail(@RequestParam(value = "upexcel", required = false) MultipartFile upexcel,
                             Integer programId, HttpServletResponse response, HttpServletRequest request) throws Exception{
        if(upexcel.isEmpty()){
            throw new Exception("文件不存在！");
        }
        InputStream in = upexcel.getInputStream();
        ExcelUtil eu = new ExcelUtil();
        eu.setOnlyReadOneSheet(false);
        eu.setPrintMsg(false);
        List<Row> rows = eu.analysisExcel(in);
        List<String> list = new ArrayList<String>();
        for(Row row:rows){
            log.info(row.getRowNum());
            if(row.getRowNum() == 0)
                continue;
            String value = ExcelUtil.getCellValue(row.getCell(0));
            if(StringUtils.isEmpty(value)){
                break;
            }
            list.add(value);
        }
        ResponseModel result = new ResponseModel(1, "success");
        if(list.size()>0){
            String companys = StringUtils.collectionToDelimitedString(list, ",");
            result.setObj(companys);
        }

        return result;
    }

    private List<AiIpe> convertModels(String arrStr){
        List<AiIpe> aiIpeList = new ArrayList<>();
        if(StringUtils.isEmpty(arrStr) || arrStr.contains("The request key should contain")){
            return aiIpeList;
        }

        JSONArray array = JSON.parseArray(arrStr);
        for (int i = 0; i < array.size(); i++) {
            AiIpe aiIpe = new AiIpe();
            JSONArray arrValue = array.getJSONArray(i);
            aiIpe.setCompany(arrValue.getString(0));
            aiIpe.setFine(formatDouble(arrValue.getString(1)));
            aiIpe.setRevoke(formatDouble(arrValue.getString(2)));
            aiIpe.setConfiscate(formatDouble(arrValue.getString(3)));
            aiIpe.setDetention(formatDouble(arrValue.getString(4)));
            aiIpe.setProduction(formatDouble(arrValue.getString(5)));
            aiIpe.setInstruct(formatDouble(arrValue.getString(6)));

            double sum = 0D;
            for(int j = 0; j < 6; j++){
                sum += Double.valueOf(formatDouble(arrValue.getString(j+1)));
            }
            aiIpe.setTotalSum(formatDouble(String.valueOf(sum/100)));
            aiIpe.setOther(formatDouble(arrValue.getString(7)));
            aiIpe.setSeason(arrValue.getString(8));
            aiIpeList.add(aiIpe);
        }

        return aiIpeList;
    }

    public static String formatDouble(String d) {
        if(org.apache.commons.lang3.StringUtils.isEmpty(d)){
            return "0";
        }
        Double dv = Double.valueOf(d);
        NumberFormat nf = NumberFormat.getNumberInstance();
        // 保留两位小数
        nf.setMaximumFractionDigits(2);
        // 如果不需要四舍五入，可以使用RoundingMode.DOWN
        nf.setRoundingMode(RoundingMode.UP);
        return nf.format(dv * 100);
    }
}
