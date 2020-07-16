package com.zhangyong.meeting.dao;

import com.zhangyong.meeting.bean.Department;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 11:23
 * @PS:
 */
public interface DepartmentDao {
    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Department getDepById(Integer id);

}
