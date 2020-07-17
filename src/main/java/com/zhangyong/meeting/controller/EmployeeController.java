package com.zhangyong.meeting.controller;

import com.zhangyong.meeting.bean.Employee;
import com.zhangyong.meeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-17 14:12
 * @PS: 员工的控制层
 */
@Controller
@RequestMapping("/admin")
public class EmployeeController {
    private static final Integer PAGE_SIZE = 10;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/searchemployees")
    public String getAllEmployees(Employee employee, @RequestParam(defaultValue = "1") Integer page, Model model) {
        List<Employee> emps = employeeService.getAllEmps(employee, page, PAGE_SIZE);
        Long total = employeeService.getTotal(employee);
        model.addAttribute("emps", emps);
        model.addAttribute("total", total);
        model.addAttribute("page", page);
        model.addAttribute("pagenum", total % PAGE_SIZE == 0 ? total / PAGE_SIZE : total / PAGE_SIZE + 1);

        return "searchemployees";

    }

    @RequestMapping("/updateemp")
    public String updateemp(Integer id) {
        employeeService.updatestatus(id, 2);
        return "redirect:/admin/searchemployees?status=1";
    }
}
