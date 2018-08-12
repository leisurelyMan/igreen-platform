package com.igreen.web.controller;

import com.igreen.common.model.CompanyQueryDetail;
import com.igreen.web.service.CompanyQueryDetailService;
import com.igreen.web.service.IndexService;
import com.igreen.web.view.IgreenSearch;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/8/12.
 */
@Controller(value = "companyMonitorController")
@RequestMapping(value = "/company/monitor/")
public class CompanyMonitorController {

    @Resource
    public IndexService indexService;
    @Resource
    public CompanyQueryDetailService detailService;

    @RequestMapping(value = "index")
    public ModelAndView index(ModelMap model, @RequestParam("configid") Integer configid){
        CompanyQueryDetail detail = new CompanyQueryDetail();
        if(configid != null){
            detail.setConfigId(configid);
        }

        List<CompanyQueryDetail> list = detailService.selectByParam(detail);
        //String[] companyArr = {"广州市越秀区潮辉牛肉美食店","广州市越秀区潮辉牛肉美食店","广州市越秀区盘福肉菜市场","广州市越秀区盘福肉菜市场","广州市越秀区盘福肉菜市场","广州市越秀区潮人码头海鲜酒家","广州市越秀区潮人码头海鲜酒家","广州市越秀区来记面食店","广州市越秀区来记面食店","广州市越秀区农林永盈茶餐厅","广州市越秀区农林永盈茶餐厅","广州市越秀区农林永盈茶餐厅","广州市越秀区农林永盈茶餐厅","广州市越秀区农林永盈茶餐厅","广州市越秀区鸿星海鲜酒家","广州市越秀区鸿星海鲜酒家","广州市越秀区鸿星海鲜酒家","广州市金喜饮食有限公司","广州市金喜饮食有限公司","广州市金喜饮食有限公司","广州市金喜饮食有限公司","广州市金喜饮食有限公司","广州市越秀区大可以饭店","广州市越秀区大可以饭店","广州市越秀区大可以饭店","广州市越秀区大可以饭店","广州市越秀区大可以饭店","广州市越秀区大可以饭店"};
        //model.addAttribute("companyList", Arrays.asList(companyArr));
        model.addAttribute("companyList", list);
        model.addAttribute("configid", configid);
        return new ModelAndView("monitor.jsp");
    }

    /**
     * 跳转到
     * @param model
     * @return
     */
    @RequestMapping(value="monitorData")
    public ModelAndView monitorData(ModelMap model,@RequestParam("companyName") String companyName,@RequestParam("deleId") String deleId){
        IgreenSearch igreen = indexService.searchNew(companyName);
        model.addAttribute("igreen", igreen);
        model.addAttribute("companyName", companyName);
        model.addAttribute("deleId", deleId);
        return new ModelAndView("monitor_item.jsp");
    }

}
