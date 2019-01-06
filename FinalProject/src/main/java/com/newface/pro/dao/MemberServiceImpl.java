package com.newface.pro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newface.pro.model.MemberBean;

@Service
public class MemberServiceImpl implements MemberService {
  @Autowired
  private MemberDAOImpl memDAO;

  @Override
  public void insertMember(MemberBean m) throws Exception {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteMember(MemberBean delm) throws Exception {
    // TODO Auto-generated method stub

  }

  @Override
  public void updateMember(MemberBean member) throws Exception {
    // TODO Auto-generated method stub

  }

  @Override
  public List<MemberBean> searchMember(String id) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

}
