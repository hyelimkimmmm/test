package com.newface.pro.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newface.pro.model.MemberBean;


@Repository
public class MatchingDAOImpl {
  @Autowired
  private SqlSessionTemplate sqlSession;

  public List<MemberBean> matchingList(int my_id) throws Exception {
    List<MemberBean> list = sqlSession.selectList("matchingList", my_id);
    return list;
  }

  public MemberBean matchingDetail(int matchingFriend_id) throws Exception {
    return (MemberBean) sqlSession.selectOne("matchingDetail", matchingFriend_id);
  }

  public List<MemberBean> acceptList(int my_id) {
    List<MemberBean> list = sqlSession.selectList("acceptList", my_id);
    return list;
  }

  public void yesMatching(int matchingFriend_id) {
    sqlSession.insert("yesMatching", matchingFriend_id);
  }

  public void noMatching(int matchingFriend_id) {
    sqlSession.update("noMatching", matchingFriend_id);
  }

  public List<MemberBean> requestList(int my_id) {
    List<MemberBean> list = sqlSession.selectList("requestList", my_id);
    return list;
  }
}
