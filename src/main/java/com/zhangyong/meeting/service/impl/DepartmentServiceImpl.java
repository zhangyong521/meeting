package com.zhangyong.meeting.service.impl;

import com.zhangyong.meeting.bean.Department;
import com.zhangyong.meeting.bean.Employee;
import com.zhangyong.meeting.dao.DepartmentDao;
import com.zhangyong.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 17:07
 * @PS:
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
   @Autowired
    private DepartmentDao departmentDao;



    public Department getDepById(Integer id) {
        return departmentDao.getDepById(id);
    }

    public List<Department> getAllDeps() {
        return departmentDao.getAllDeps();
    }


}
