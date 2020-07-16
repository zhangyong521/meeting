package com.zhangyong.meeting.service.impl;

import com.zhangyong.meeting.bean.Employee;
import com.zhangyong.meeting.dao.EmployeeDao;
import com.zhangyong.meeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
