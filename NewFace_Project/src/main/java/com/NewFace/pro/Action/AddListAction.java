package com.NewFace.pro.Action;

import java.io.File;
import java.util.Calendar;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.NewFace.pro.DAO.AddListService;
import com.NewFace.pro.Model.AddListBean;

@Controller
public class AddListAction {
	@Autowired
	private AddListService addlistservice;
	private String saveFolder = "C:\\Users\\user1\\Documents\\workspace-sts-3.9.7.RELEASE\\NewFace_Project\\src\\main\\webapp\\resources\\upload";
//	@RequestMapping(value="/Add_List.nf")
//	public String Add_List() {
//		return"jsp/Add_List"; 
//	}
//파일첨부하기
	@RequestMapping(value="/Add_List_ok.nf", method = RequestMethod.POST )
		public void Add_List_ok(AddListBean m, HttpServletResponse response)throws Exception{
		
		/*
		 * MultipartFile UpFile = m.getProf_img();
		 * 
		 * if(!UpFile.isEmpty()) { //첨부한 이진파일이 있다면
		 * 
		 * //원래 파일명 구해오기 String fileName = UpFile.getOriginalFilename();
		 * 
		 * //원래파일명 저장 m.setProf_original(fileName); //DB에 저장할 파일명 구해옵니다. String
		 * fileDBName = getFileDBName(fileName); //파일을 saveFolder + fileDBName 위치에 저장
		 * UpFile.transferTo(new File(saveFolder + fileDBName)); //변경될 첨부파일명으로 저장
		 * m.setNew_prof_img(fileDBName); }
		 */
		 
			this.addlistservice.insertAddList(m);
			
			//로그인페이지로 이동(*이부분수정하기*)
		 response.sendRedirect("AddList"); 
				
				
			
		}
	private String getFileDBName(String fileName) throws Exception {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR); //오늘 년도
		int month = c.get(Calendar.MONTH) + 1; //오늘 월 구합니다.
		int date  = c.get(Calendar.DATE); //오늘 일 구합니다.
		String homedir = saveFolder + "/" + year + "-" + month + "-" + date;
		
		//homedir에 file 객체 생성
		File path1 = new File(homedir);
		
		if(!(path1.exists())) {
			System.out.println("폴더만들어요");
			path1.mkdir(); //새로운 폴더 생성
			
			//난수를 구합니다.
			Random r = new Random();
			int random = r.nextInt(100000000);
			
			//확장자 구하기 시작
			int index = fileName.lastIndexOf(".");
			System.out.println("index = " + index);
			
			String fileExtension = fileName.substring(index+1);
			System.out.println("fileExtension = " + fileExtension);
			//확장자 구하기 끝
			
			//새로운 파일명 만들기
			String refileName = "add" + year + month + date + random + "." + date +  fileExtension;
			System.out.println("refileName" + refileName);
			
			//오라클 디비에 저장될 값
			String fileDBName = "/" + year + "-" + month + "-" + date + "/" + refileName;
			System.out.println("fileDBName = " + fileDBName);
			
			return fileDBName;
		}
		return homedir;
	
		
	}
	@RequestMapping(value = "/Add_List.nf")
	public ModelAndView add_list() throws Exception{
		ModelAndView list = new ModelAndView("AddList");
		return list;
	}
	

		
	}

