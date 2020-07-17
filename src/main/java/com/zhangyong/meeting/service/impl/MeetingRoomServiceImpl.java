package com.zhangyong.meeting.service.impl;

import com.zhangyong.meeting.bean.MeetingRoom;
import com.zhangyong.meeting.dao.MeetingRoomDao;
import com.zhangyong.meeting.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-17 15:52
 * @PS:
 */
@Service
public class MeetingRoomServiceImpl implements MeetingRoomService {

    @Autowired
    private MeetingRoomDao meetingRoomDao;

    public List<MeetingRoom> getAllMr() {
        return meetingRoomDao.getAllMr();
    }

    public MeetingRoom getMrById(Integer roomId) {
        return meetingRoomDao.getMrById(roomId);
    }

    public Integer updateRoom(MeetingRoom meetingRoom) {
        return meetingRoomDao.updateRoom(meetingRoom);
    }

    /**
     * 添加会议室
     * @return
     */
    public Integer addMr(MeetingRoom meetingRoom) {
        return meetingRoomDao.addMr(meetingRoom);
    }
}
