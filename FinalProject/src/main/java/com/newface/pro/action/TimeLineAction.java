package com.newface.pro.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.newface.pro.dao.TimeLineService;

@Controller
public class TimeLineAction {
  @Autowired
  private TimeLineService timelineService;
}
