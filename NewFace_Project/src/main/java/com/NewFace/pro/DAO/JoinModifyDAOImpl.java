package com.NewFace.pro.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JoinModifyDAOImpl {
	

	@Autowired
	private SqlSessionTemplate sqlsession;

}
