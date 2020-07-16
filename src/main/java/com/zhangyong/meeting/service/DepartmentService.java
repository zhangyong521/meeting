package com.zhangyong.meeting.service;

import com.zhangyong.meeting.bean.Department;
import com.zhangyong.meeting.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 11:23
 * @PS:
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    public Department getDepById(Integer id) {
        return departmentDao.getDepById(id);
    }
}
