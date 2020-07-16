package com.zhangyong.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 15:48
 * @PS:
 */
@Controller
public class Notifications {
    @GetMapping("/notifications")
    public String notifications(){
        return "notifications";
    }
}
