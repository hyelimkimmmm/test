package com.newface.pro.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.newface.pro.dao.FriendListService;

@Controller
public class FriendListAction {
  @Autowired
  private FriendListService friendListService;
}
