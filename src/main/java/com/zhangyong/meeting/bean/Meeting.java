package com.zhangyong.meeting.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-07-17 17:33
 * @PS: 会议的实体类
 */
@Getter
@Setter
public class Meeting {

  private Integer meetingId;
  private String meetingName;
  private Integer roomId;
  private Integer reservationIstId;
  private Integer numberOfParticipants;
  private Date startTime;
  private Date endTime;
  private Date reservationTime;
  private Date canceledTime;
  private String description;
  private String status;
}
