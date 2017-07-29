package com.dhu.wlq.controller;

import com.alibaba.fastjson.JSONObject;
import com.dhu.wlq.dao.EmpDao;
import com.dhu.wlq.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by wanglongqing on 2017/7/23.
 */
@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public ModelAndView queryEmp() {
        try {
            Map<String, Object> result = empService.loadEmpInfo(1);
            System.out.println(JSONObject.toJSONString(result));
        } catch (Exception e) {
            System.out.println("error occured");
            e.printStackTrace();
        }
        ModelAndView modelAndView = new ModelAndView("record");
        modelAndView.addObject("empInfo", "hello");
        return modelAndView;
    }

    public static void main(String[] args) {
        EmpService empService = new EmpService();
        Map<String, Object> result = empService.loadEmpInfo(1);
        System.out.println(JSONObject.toJSONString(result));
    }
}
