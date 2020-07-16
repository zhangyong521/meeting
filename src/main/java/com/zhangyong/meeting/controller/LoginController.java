package com.zhangyong.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-16 14:17
 * @PS:
 */
@Controller
public class LoginController {
    @RequestMapping("/")
    public String login(){
        return "login";
    }
}
