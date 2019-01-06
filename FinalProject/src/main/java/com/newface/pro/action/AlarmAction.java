package com.newface.pro.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.newface.pro.dao.AlarmService;
import com.newface.pro.model.AlarmBean;

@Controller
public class AlarmAction {
  @Autowired
  private AlarmService alramService;

  // 알람 등록
  // @RequestMapping
  public int insertAlarm(AlarmBean alarm) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

  // 알람 리스트 가져오기
  public List<AlarmBean> getAlramList() throws Exception {
    // TODO Auto-generated method stub
    return null;
  }
}
