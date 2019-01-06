package com.newface.pro.dao;

import java.util.List;

import com.newface.pro.model.MemberBean;

public interface MemberService {
  /* ȸ������ */
  public void insertMember(MemberBean m) throws Exception;

  /* ȸ������ */
  public void deleteMember(MemberBean delm) throws Exception;

  /* ȸ������ */
  public void updateMember(MemberBean member) throws Exception;

  /* ���̵� ã�� */
  public List<MemberBean> searchMember(String id) throws Exception;
}
