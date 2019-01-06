package com.newface.pro.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendListServiceImpl implements FriendListService {
  @Autowired
  private FriendListDAOImpl friendListDAO;
}
