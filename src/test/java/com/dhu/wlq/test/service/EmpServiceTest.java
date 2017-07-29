package com.dhu.wlq.test.service;

import com.alibaba.fastjson.JSONObject;
import com.dhu.wlq.service.EmpService;
import com.dhu.wlq.test.AbstractTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by wanglongqing on 2017/7/23.
 */
public class EmpServiceTest extends AbstractTest {

    @Autowired
    private EmpService empService;

    @Test
    public void test() {
        Map<String, Object> result = empService.loadEmpInfo(1);
        System.out.println(JSONObject.toJSON(result));
    }
}
