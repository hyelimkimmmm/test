package com.newface.pro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newface.pro.model.MemberBean;

@Service
public class MatchingServiceImpl implements MatchingService {
  @Autowired
  private MatchingDAOImpl matchingDAO;

  @Override
  public List<MemberBean> matchingList(int my_id) throws Exception {
    return matchingDAO.matchingList(my_id);
  }

  @Override
  public MemberBean matchingDetail(int matchingFriend_id) throws Exception {
    return matchingDAO.matchingDetail(matchingFriend_id);
  }

  @Override
  public List<MemberBean> acceptList(int my_id) throws Exception {
    return matchingDAO.acceptList(my_id);
  }

  @Override
  public void yesMatching(int matchingFriend_id) throws Exception {
    matchingDAO.yesMatching(matchingFriend_id);
  }

  @Override
  public void noMatching(int matchingFriend_id) throws Exception {
    matchingDAO.noMatching(matchingFriend_id);
  }

  @Override
  public List<MemberBean> requestList(int my_id) throws Exception {
    return matchingDAO.requestList(my_id);
  }


}
