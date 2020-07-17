package com.zhangyong.meeting.controller;

import com.zhangyong.meeting.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/bookmeeting")
    public String bookMeeting(Model model) {
        model.addAttribute("mrs",meetingRoomService.getAllMr());
        return "bookmeeting";
    }
}
