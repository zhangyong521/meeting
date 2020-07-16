package com.zhangyong.meeting.service;

import com.zhangyong.meeting.bean.Department;
import com.zhangyong.meeting.bean.Employee;
import com.zhangyong.meeting.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 11:23
 * @PS:
 */
@Service
public interface DepartmentService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Department getDepById(Integer id);

    /**
     * 查询全部部门
     * @return
     */
    List<Department> getAllDeps();


}
