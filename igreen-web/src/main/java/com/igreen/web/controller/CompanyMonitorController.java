package com.igreen.web.controller;

import com.igreen.web.service.IndexService;
import com.igreen.web.view.IgreenSearch;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/8/12.
 */
@Controller(value = "companyMonitorController")
@RequestMapping(value = "/company/monitor/")
public class CompanyMonitorController {

    @Resource
    public IndexService indexService;

    @RequestMapping(value = "index")
    public ModelAndView index(ModelMap model){
        String[] companyArr = {"广州市越秀区潮辉牛肉美食店","广州市越秀区潮辉牛肉美食店","广州市越秀区盘福肉菜市场","广州市越秀区盘福肉菜市场","广州市越秀区盘福肉菜市场","广州市越秀区潮人码头海鲜酒家","广州市越秀区潮人码头海鲜酒家","广州市越秀区来记面食店","广州市越秀区来记面食店","广州市越秀区农林永盈茶餐厅","广州市越秀区农林永盈茶餐厅","广州市越秀区农林永盈茶餐厅","广州市越秀区农林永盈茶餐厅","广州市越秀区农林永盈茶餐厅","广州市越秀区鸿星海鲜酒家","广州市越秀区鸿星海鲜酒家","广州市越秀区鸿星海鲜酒家","广州市金喜饮食有限公司","广州市金喜饮食有限公司","广州市金喜饮食有限公司","广州市金喜饮食有限公司","广州市金喜饮食有限公司","广州市越秀区大可以饭店","广州市越秀区大可以饭店","广州市越秀区大可以饭店","广州市越秀区大可以饭店","广州市越秀区大可以饭店","广州市越秀区大可以饭店"};
        model.addAttribute("companyList", Arrays.asList(companyArr));
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
