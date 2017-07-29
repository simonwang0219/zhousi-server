package com.dhu.wlq.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by wanglongqing on 2017/7/23.
 */
public interface EmpDao {

    Map<String, Object> loadEmpByEmpno(@Param("empNo") int empNo);

}
