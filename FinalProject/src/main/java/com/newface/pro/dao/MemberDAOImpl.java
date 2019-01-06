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

  /* 회원저장 */
  public Object insertMember(MemberBean m) {
    return null;
  }

  /* 회원삭제 */
  public void deleteMember(MemberBean delm) throws Exception {}

  /* 회원수정 */
  public void updateMember(MemberBean m) throws Exception {}

  /* 아이디 찾기 */
  public List<MemberBean> searchMember(String id) throws Exception {
    return null;
  }
}
