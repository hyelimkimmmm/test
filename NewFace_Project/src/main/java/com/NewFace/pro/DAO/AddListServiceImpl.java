package com.NewFace.pro.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NewFace.pro.Model.AddListBean;

@Service("addListSerivce")
public class AddListServiceImpl implements AddListService {
	
@Autowired
	private AddListDAOImpl AddDAO;
public void updateAdd_List(AddListBean m)throws Exception{
		AddDAO.Add_List(m);
		
		
	}
@Override
public void insertAddList(AddListBean m) throws Exception {
	AddDAO.Add_List(m);
}

}
