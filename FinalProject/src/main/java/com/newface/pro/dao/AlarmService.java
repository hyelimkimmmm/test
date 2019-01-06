package com.newface.pro.dao;

import java.util.List;

import com.newface.pro.model.AlarmBean;

public interface AlarmService {
  // 알람 등록
  public int insertAlarm(AlarmBean alarm) throws Exception;

  // 알람 리스트 가져오기
  public List<AlarmBean> getAlramList() throws Exception;
}
