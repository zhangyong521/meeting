package com.zhangyong.meeting.service;

import com.zhangyong.meeting.bean.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 14:38
 * @PS: 员工的Service
 */
public interface EmployeeService {
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    Employee doLogin(String username, String password);

    /**
     * 注册
     * @param employee
     * @return
     */
    Integer doReg(Employee employee);

    /**
     * 查询所有的用户
     * @return
     */
    List<Employee> getAllEmpsStatus(Integer status);

    /**
     * 更改状态
     * @param employeeId
     * @param status
     * @return
     */
    Integer updatestatus(Integer employeeId, Integer status);

}
