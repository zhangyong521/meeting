package com.zhangyong.meeting.controller;

import com.zhangyong.meeting.bean.Department;
import com.zhangyong.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 11:25
 * @PS:
 */
@Controller
@RequestMapping("/admin")
public class DepartmentController {
    @RequestMapping("/departments")
    public String departments() {
        return "departments";
    }

}
