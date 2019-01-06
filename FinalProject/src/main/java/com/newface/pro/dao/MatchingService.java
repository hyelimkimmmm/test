package com.newface.pro.dao;

import java.util.List;

import com.newface.pro.model.MemberBean;


public interface MatchingService {

  /* 일대일 대화 페이지: 매칭 친구 목록 불러오기 */
  public List<MemberBean> matchingList(int my_id) throws Exception;

  /* 일대일 대화 페이지: 매칭 친구 상세정보 불러오기 */
  public MemberBean matchingDetail(int matchingFriend_id) throws Exception;

  /* 매칭 요청 수신 목록 페이지 */
  public List<MemberBean> acceptList(int my_id) throws Exception;

  /* 매칭 요청 수신 목록 페이지: 요청 수락 */
  public void yesMatching(int matchingFriend_id) throws Exception;

  /* 매칭 요청 수신 목록 페이지: 요청 삭제 */
  public void noMatching(int matchingFriend_id) throws Exception;

  /* 매칭 요청 발신 목록 페이지 */
  public List<MemberBean> requestList(int my_id) throws Exception;
}
