package com.newface.pro.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
  @Autowired
  private MainDAOImpl mainDAO;

  @Override
  public String board(String id, int board_no) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String reply(String id, int board_no, int reply_no) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

}
