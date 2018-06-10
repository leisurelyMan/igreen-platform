package com.igreen.boss.controller.ipepython;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.igreen.boss.controller.BaseController;
import com.igreen.boss.util.HttpClientHelper;
import com.igreen.common.dto.AiIpeSearch;
import com.igreen.common.model.AiIpe;
import com.igreen.common.util.ListRange;
import org.apache.log4j.Logger;
import org.apache.poi.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/10.
 */
@Controller
@RequestMapping(value = "/aiIpe")
public class AiIpeController extends BaseController {

    private Logger log = Logger.getLogger(AiIpeController.class);

    /**
     * 跳转爬虫数据列表页面
     * @param model
     * @return
     */
    @RequestMapping(value="toAiPage")
    public ModelAndView toMepData(ModelMap model){
        return new ModelAndView("ai/ipe.jsp",model);
    }

    @RequestMapping(value = "ipeListData")
    public @ResponseBody ListRange ipeListData(AiIpeSearch aiIpeSearch){
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();

        if(!StringUtils.isEmpty(aiIpeSearch.getCompany())){
            map.put("company", aiIpeSearch.getCompany());
        }
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

        if(!map.isEmpty()){
            list.add(map);
        }

        if(list.size() == 0){
            return new ListRange();
        }

        Map<String, String> param = new HashMap<String, String>();
        param.put("reqstr", JSON.toJSONString(list));
        log.info("params="+JSON.toJSONString(param));
        String result = HttpClientHelper.sendPost("http://172.17.215.145:4411", param, "UTF-8");
        log.info("result="+result);

        List<AiIpe> aiIpeList = convertModels(result);

        return new ListRange(aiIpeList, aiIpeList.size(), 1, aiIpeList.size());
    }


    private List<AiIpe> convertModels(String arrStr){
        List<AiIpe> aiIpeList = new ArrayList<>();
        if(StringUtils.isEmpty(arrStr)){
            return aiIpeList;
        }

        JSONArray array = JSON.parseArray(arrStr);
        for (int i = 0; i < array.size(); i++) {
            AiIpe aiIpe = new AiIpe();
            JSONArray arrValue = array.getJSONArray(i);
            aiIpe.setFine(arrValue.getString(0));
            aiIpe.setRevoke(arrValue.getString(1));
            aiIpe.setConfiscate(arrValue.getString(2));
            aiIpe.setDetention(arrValue.getString(3));
            aiIpe.setProduction(arrValue.getString(4));
            aiIpe.setInstruct(arrValue.getString(5));
            aiIpe.setOther(arrValue.getString(6));
            aiIpeList.add(aiIpe);
        }

        return aiIpeList;
    }
}
