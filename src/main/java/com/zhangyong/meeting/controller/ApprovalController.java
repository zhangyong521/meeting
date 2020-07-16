package com.zhangyong.meeting.controller;

import com.zhangyong.meeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 23:58
 * @PS: 审批的控制层
 */
@Controller
@RequestMapping("/admin")
public class ApprovalController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/approveaccount")
    public String approvalAccount(Model model) {
        model.addAttribute("emps", employeeService.getAllEmpsStatus(0));
        return "approveaccount";
    }

    @RequestMapping("/updatestatus")
    public String updatestatus(Integer employeeId, Integer status) {
        Integer result = employeeService.updatestatus(employeeId, status);
        return "redirect:/admin/approveaccount";
    }
}
