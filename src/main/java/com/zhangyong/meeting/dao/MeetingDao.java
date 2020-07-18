package com.zhangyong.meeting.dao;

import com.zhangyong.meeting.bean.Meeting;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-18 11:07
 * @PS: 添加会议
 */
public interface MeetingDao {
    /**
     * 添加会议
     * @param meeting
     * @return
     */
    Integer addMeeting(Meeting meeting);

    /**
     * 添加会议人
     * @param meetingId
     * @param mps
     */
    void addParticipants(@Param("meetingId") Integer meetingId, @Param("mps") Integer[] mps);
}
