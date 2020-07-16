package com.zhangyong.meeting.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 14:33
 * @PS: 员工实体
 */
@Getter
@Setter
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String username;
    private String phone;
    private String email;
    private Integer status;
    private Integer departmentId;
    private String password;
    private Integer role;
}
