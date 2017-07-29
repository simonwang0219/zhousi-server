package com.dhu.wlq.test.dao;

import com.alibaba.fastjson.JSONObject;
import com.dhu.wlq.dao.EmpDao;
import com.dhu.wlq.test.AbstractTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by wanglongqing on 2017/7/23.
 */
public class EmpDaoTest extends AbstractTest {

    @Autowired
    private EmpDao empDao;

    @Test
    public void test() {
        Map<String, Object> result = empDao.loadEmpByEmpno(1);
        System.out.println(JSONObject.toJSON(result));
    }
}
