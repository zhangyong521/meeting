package com.zhangyong.meeting.service;

import com.zhangyong.meeting.bean.Meeting;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-18 11:07
 * @PS: 添加会议
 */
public interface MeetingService {
    /**
     * 添加会议
     * @param meeting
     * @param mps
     * @return
     */
    Integer addMeeting(Meeting meeting, Integer[] mps);
}
