package com.newface.pro.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newface.pro.model.MemberBean;

@Repository
public class MemberDAOImpl {
  @Autowired
  private SqlSessionTemplate sqlSession;

  /* ȸ������ */
  public Object insertMember(MemberBean m) {
    return null;
  }

  /* ȸ������ */
  public void deleteMember(MemberBean delm) throws Exception {}

  /* ȸ������ */
  public void updateMember(MemberBean m) throws Exception {}

  /* ���̵� ã�� */
  public List<MemberBean> searchMember(String id) throws Exception {
    return null;
  }
}
