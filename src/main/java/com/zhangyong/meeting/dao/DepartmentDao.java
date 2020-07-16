package com.zhangyong.meeting.dao;

import com.zhangyong.meeting.bean.Department;
import com.zhangyong.meeting.bean.Employee;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 11:23
 * @PS: 部门接口
 */
public interface DepartmentDao {
    /**
     * 根据ID查询
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
