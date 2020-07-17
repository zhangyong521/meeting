package com.zhangyong.meeting.dao;

import com.zhangyong.meeting.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
     *
     * @param username
     * @return
     */
    Employee loadEmpByUserName(String username);

    /**
     * 注册
     *
     * @param employee
     * @return
     */
    Integer doReg(Employee employee);

    /**
     * 查询所有的员工信息
     *
     * @return
     */
    List<Employee> getAllEmpsStatus(Integer status);

    /**
     * 更改状态
     *
     * @param employeeId
     * @param status
     * @return
     */
    Integer updatestatus(@Param("employeeId") Integer employeeId, @Param("status") Integer status);

    /**
     * 查询没有员工信息
     *
     * @param employee
     * @param page
     * @param pageSize
     * @return
     */
    List<Employee> getAllEmps(@Param("emp") Employee employee, @Param("page") Integer page, @Param("pagesize") Integer pageSize);

    /**
     * 获取总记录数
     * @param employee
     * @return
     */
    Long getTotal(Employee employee);
}
