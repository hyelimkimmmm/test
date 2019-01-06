package com.newface.pro.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.newface.pro.dao.MainService;

@Controller
public class MainAction {
  @Autowired
  private MainService mainService;
}
