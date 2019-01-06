package com.newface.pro.dao;

import java.util.List;

import com.newface.pro.model.MemberBean;


public interface MatchingService {

  /* �ϴ��� ��ȭ ������: ��Ī ģ�� ��� �ҷ����� */
  public List<MemberBean> matchingList(int my_id) throws Exception;

  /* �ϴ��� ��ȭ ������: ��Ī ģ�� ������ �ҷ����� */
  public MemberBean matchingDetail(int matchingFriend_id) throws Exception;

  /* ��Ī ��û ���� ��� ������ */
  public List<MemberBean> acceptList(int my_id) throws Exception;

  /* ��Ī ��û ���� ��� ������: ��û ���� */
  public void yesMatching(int matchingFriend_id) throws Exception;

  /* ��Ī ��û ���� ��� ������: ��û ���� */
  public void noMatching(int matchingFriend_id) throws Exception;

  /* ��Ī ��û �߽� ��� ������ */
  public List<MemberBean> requestList(int my_id) throws Exception;
}
