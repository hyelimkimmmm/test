package com.newface.pro.dao;

import java.util.List;

import com.newface.pro.model.MemberBean;

public interface MemberService {
  /* 회원저장 */
  public void insertMember(MemberBean m) throws Exception;

  /* 회원삭제 */
  public void deleteMember(MemberBean delm) throws Exception;

  /* 회원수정 */
  public void updateMember(MemberBean member) throws Exception;

  /* 아이디 찾기 */
  public List<MemberBean> searchMember(String id) throws Exception;
}
