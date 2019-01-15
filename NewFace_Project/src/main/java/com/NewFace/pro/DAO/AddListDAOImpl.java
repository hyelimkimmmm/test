package com.NewFace.pro.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.NewFace.pro.Model.AddListBean;


@Repository
public class AddListDAOImpl {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public void Add_List(AddListBean m) {
		sqlSession.insert("Add_List",m);		
	}
	
	

}
