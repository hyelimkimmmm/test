package com.newface.pro.dao;

public interface MainService {
  public String board(String id, int board_no) throws Exception;

  public String reply(String id, int board_no, int reply_no) throws Exception;
}
