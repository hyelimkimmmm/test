package com.newface.pro.dao;

import java.util.List;

import com.newface.pro.model.AlarmBean;

public interface AlarmService {
  // �˶� ���
  public int insertAlarm(AlarmBean alarm) throws Exception;

  // �˶� ����Ʈ ��������
  public List<AlarmBean> getAlramList() throws Exception;
}
