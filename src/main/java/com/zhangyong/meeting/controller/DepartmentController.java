package com.zhangyong.meeting.controller;

import com.zhangyong.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 11:25
 * @PS: 部门信息的控制层
 */
@Controller
@RequestMapping("/admin")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/departments")
    public String departments(Model model) {
        model.addAttribute("deps", departmentService.getAllDeps());
        return "departments";
    }

    @RequestMapping("/addDepartment")
    public String addDepartment(String departmentName) {
        departmentService.addDepartment(departmentName);
        return "redirect:/admin/departments";
    }

    @RequestMapping("/deleteDep")
    public String deleteDep(Integer departmentId) {
        departmentService.deleteDep(departmentId);
        return "redirect:/admin/departments";
    }

    @RequestMapping("/updateDep")
    @ResponseBody
    public String updateDep(Integer id, String name) {
        Integer result = departmentService.updateDep(id, name);
        if (result == 1) {
            return "success";
        }
        return "error";
    }
}
