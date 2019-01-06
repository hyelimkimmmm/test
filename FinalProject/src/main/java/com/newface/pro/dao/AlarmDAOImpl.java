package com.newface.pro.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlarmDAOImpl {
  @Autowired
  private SqlSessionTemplate sqlSession;
}
