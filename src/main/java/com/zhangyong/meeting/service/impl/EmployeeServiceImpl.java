package com.zhangyong.meeting.service.impl;

import com.zhangyong.meeting.bean.Employee;
import com.zhangyong.meeting.dao.EmployeeDao;
import com.zhangyong.meeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 14:39
 * @PS:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public Employee doLogin(String username, String password) {
        Employee employee = employeeDao.loadEmpByUserName(username);
        if (employee == null || !employee.getPassword().equals(password)) {
            return null;
        }
        return employee;
    }

    public Integer doReg(Employee employee) {
        Employee emp = employeeDao.loadEmpByUserName(employee.getUsername());
        if (emp != null) {
            return -1;
        }
        employee.setRole(1);
        employee.setStatus(0);
        return employeeDao.doReg(employee);
    }

    public List<Employee> getAllEmpsStatus(Integer status) {
        return employeeDao.getAllEmpsStatus(status);
    }

    public Integer updatestatus(Integer employeeId, Integer status) {
        return employeeDao.updatestatus(employeeId, status);
    }

    public List<Employee> getAllEmps(Employee employee, Integer page, Integer pageSize) {
        page = (page - 1) * pageSize;
        return employeeDao.getAllEmps(employee, page, pageSize);
    }

    public Long getTotal(Employee employee) {
        return employeeDao.getTotal(employee);
    }

    public List<Employee> getEmpsByDepId(Integer depId) {
        return employeeDao.getEmpsByDepId(depId);
    }
}
