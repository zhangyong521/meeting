package com.zhangyong.meeting.controller;

import com.zhangyong.meeting.bean.Department;
import com.zhangyong.meeting.bean.Employee;
import com.zhangyong.meeting.bean.Meeting;
import com.zhangyong.meeting.service.DepartmentService;
import com.zhangyong.meeting.service.EmployeeService;
import com.zhangyong.meeting.service.MeetingRoomService;
import com.zhangyong.meeting.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-17 17:31
 * @PS: 预订会议管理层
 */
@Controller
public class MeetingController {

    @Autowired
    private MeetingRoomService meetingRoomService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private MeetingService meetingService;


    @RequestMapping("/bookmeeting")
    public String bookMeeting(Model model) {
        model.addAttribute("mrs", meetingRoomService.getAllMr());
        return "bookmeeting";
    }

    @RequestMapping("/alldeps")
    @ResponseBody
    public List<Department> getAllDeps() {
        return departmentService.getAllDeps();
    }

    @RequestMapping("/getempsbydepid")
    @ResponseBody
    public List<Employee> getEmpsByDepId(Integer depId) {
        return employeeService.getEmpsByDepId(depId);
    }

    @RequestMapping("/doAddMeeting")
    public String doAddMeeting(Meeting meeting, Integer[] mps, HttpSession session) {
        Employee currentuser = (Employee) session.getAttribute("currentuser");
        meeting.setReservationIstId(currentuser.getEmployeeId());
        Integer result = meetingService.addMeeting(meeting, mps);
        if (result == 1) {
            return "redirect:/searchmeetings";
        } else {
            return "forward:/bookmeeting";
        }
    }

    @RequestMapping("/searchmeetings")
    public String searchmeetings() {
        return "searchmeetings";
    }


}
