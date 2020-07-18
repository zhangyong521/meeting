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

    /**
     * 搜索员工
     * @param employee
     * @param page
     * @param pageSize
     * @return
     */
    List<Employee> getAllEmps(Employee employee, Integer page, Integer pageSize);

    /**
     * 查询员工总的条数
     * @param employee
     * @return
     */
    Long getTotal(Employee employee);

    /**
     * 根据ID查询员工
     * @param depId
     * @return
     */
    List<Employee> getEmpsByDepId(Integer depId);
}
