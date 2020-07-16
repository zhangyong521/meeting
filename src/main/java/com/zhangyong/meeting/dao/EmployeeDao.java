package com.zhangyong.meeting.dao;

import com.zhangyong.meeting.bean.Employee;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 14:37
 * @PS: 员工接口
 */
public interface EmployeeDao {

    /**
     * 登录
     * @param username
     * @return
     */
    Employee loadEmpByUserName(String username);

    /**
     * 注册
     * @param employee
     * @return
     */
    Integer doReg(Employee employee);
}
