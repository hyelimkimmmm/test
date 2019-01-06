package com.newface.pro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newface.pro.model.AlarmBean;

@Service
public class AlarmServiceImpl implements AlarmService {
  @Autowired
  private AlarmDAOImpl alarmDAO;

  @Override
  public int insertAlarm(AlarmBean alarm) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public List<AlarmBean> getAlramList() throws Exception {
    // TODO Auto-generated method stub
    return null;
  }
}
