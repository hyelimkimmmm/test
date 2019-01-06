package com.newface.pro.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.newface.pro.dao.MemberService;

@Controller
public class MemberAction {
  @Autowired
  private MemberService memberService;
}
