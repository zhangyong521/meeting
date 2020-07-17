package com.zhangyong.meeting.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-17 15:48
 * @PS: 会议室的实体
 */
@Getter
@Setter
public class MeetingRoom {
    private Integer roomId;
    private Integer roomNum;
    private String roomName;
    private Integer capacity;
    private String status;
    private String description;
}
