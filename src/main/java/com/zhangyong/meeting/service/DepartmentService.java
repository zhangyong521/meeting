package com.zhangyong.meeting.service;

import com.zhangyong.meeting.bean.Department;
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
     *
     * @param id
     * @return
     */
    Department getDepById(Integer id);

    /**
     * 查询全部部门
     *
     * @return
     */
    List<Department> getAllDeps();


    /**
     * 添加部门信息
     *
     * @param departmentName
     * @return
     */
    Integer addDepartment(String departmentName);

    /**
     * 删除部门信息
     * @param departmentId
     * @return
     */
    Integer deleteDep(Integer departmentId);

    /**
     * 修改部门
     * @param id
     * @param name
     * @return
     */
    Integer updateDep(Integer id, String name);
}
