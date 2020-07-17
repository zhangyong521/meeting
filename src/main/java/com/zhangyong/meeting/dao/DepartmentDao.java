package com.zhangyong.meeting.dao;

import com.zhangyong.meeting.bean.Department;
import org.apache.ibatis.annotations.Param;

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
     * 根据部门名称进行查询
     *
     * @param departmentName
     * @return
     */
    Department getDepByName(String departmentName);

    /**
     * 删除部门信息
     *
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
    Integer updateDep(@Param("id") Integer id, @Param("name")String name);
}
