package com.zhangyong.meeting.controller;

import com.zhangyong.meeting.bean.MeetingRoom;
import com.zhangyong.meeting.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-17 15:45
 * @PS: 会议室的控制层
 */
@Controller
public class MeetingRoomController {
    @Autowired
    private MeetingRoomService meetingRoomService;

    @RequestMapping("/meetingrooms")
    public String meeting(Model model) {
        model.addAttribute("mrs", meetingRoomService.getAllMr());
        return "meetingrooms";
    }

    @RequestMapping("/roomdetails")
    public String roomdetails(Integer roomId, Model model) {
        model.addAttribute("mr", meetingRoomService.getMrById(roomId));
        return "roomdetails";
    }

    @RequestMapping("/updateRoom")
    public String updateRoom(MeetingRoom meetingRoom) {
        Integer result = meetingRoomService.updateRoom(meetingRoom);
        if (result == 1) {
            return "redirect:/meetingrooms";
        } else {
            return "forward:/roomdetails";
        }
    }

    @RequestMapping("/admin/addmeetingroom")
    public String addMeetingRoom() {
        return "addmeetingroom";
    }

    @RequestMapping("/admin/doAddMr")
    public String doAddMr(MeetingRoom meetingRoom) {
        Integer result = meetingRoomService.addMr(meetingRoom);
        return "redirect:/meetingrooms";
    }
}
