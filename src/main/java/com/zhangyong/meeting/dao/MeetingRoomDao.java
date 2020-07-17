package com.zhangyong.meeting.dao;

import com.zhangyong.meeting.bean.MeetingRoom;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-17 15:51
 * @PS:
 */
public interface MeetingRoomDao {
    /**
     * 查询没有的会议室
     * @return
     */
    List<MeetingRoom> getAllMr();

    /**
     * 根据Id查询会员详情
     * @param roomId
     * @return
     */
    MeetingRoom getMrById(Integer roomId);

    /**
     * 修改会议详情
     * @param meetingRoom
     * @return
     */
    Integer updateRoom(MeetingRoom meetingRoom);

    /**
     * 添加会议室
     * @return
     */
    Integer addMr(MeetingRoom meetingRoom);

}
