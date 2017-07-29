package com.dhu.wlq.service;

import com.dhu.wlq.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by wanglongqing on 2017/7/23.
 */
@Service("empService")
public class EmpService {

    @Autowired
    private EmpDao empDao;

    public Map<String, Object> loadEmpInfo(int empNo) {
        return empDao.loadEmpByEmpno(empNo);
    }
}
