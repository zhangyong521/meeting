package com.zhangyong.meeting.service.impl;

import com.zhangyong.meeting.bean.Meeting;
import com.zhangyong.meeting.dao.MeetingDao;
import com.zhangyong.meeting.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-18 11:07
 * @PS:
 */
@Service
public class MeetingServiceImpl implements MeetingService {
    @Autowired
    private MeetingDao meetingDao;


    public Integer addMeeting(Meeting meeting, Integer[] mps) {
        meeting.setReservationTime(new Date());
        Integer result = meetingDao.addMeeting(meeting);
        meetingDao.addParticipants(meeting.getMeetingId(), mps);
        return result;
    }

}
