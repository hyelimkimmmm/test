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
//����÷���ϱ�
	@RequestMapping(value="/Add_List_ok.nf", method = RequestMethod.POST )
		public void Add_List_ok(AddListBean m, HttpServletResponse response)throws Exception{
		
		/*
		 * MultipartFile UpFile = m.getProf_img();
		 * 
		 * if(!UpFile.isEmpty()) { //÷���� ���������� �ִٸ�
		 * 
		 * //���� ���ϸ� ���ؿ��� String fileName = UpFile.getOriginalFilename();
		 * 
		 * //�������ϸ� ���� m.setProf_original(fileName); //DB�� ������ ���ϸ� ���ؿɴϴ�. String
		 * fileDBName = getFileDBName(fileName); //������ saveFolder + fileDBName ��ġ�� ����
		 * UpFile.transferTo(new File(saveFolder + fileDBName)); //����� ÷�����ϸ����� ����
		 * m.setNew_prof_img(fileDBName); }
		 */
		 
			this.addlistservice.insertAddList(m);
			
			//�α����������� �̵�(*�̺κм����ϱ�*)
		 response.sendRedirect("AddList"); 
				
				
			
		}
	private String getFileDBName(String fileName) throws Exception {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR); //���� �⵵
		int month = c.get(Calendar.MONTH) + 1; //���� �� ���մϴ�.
		int date  = c.get(Calendar.DATE); //���� �� ���մϴ�.
		String homedir = saveFolder + "/" + year + "-" + month + "-" + date;
		
		//homedir�� file ��ü ����
		File path1 = new File(homedir);
		
		if(!(path1.exists())) {
			System.out.println("����������");
			path1.mkdir(); //���ο� ���� ����
			
			//������ ���մϴ�.
			Random r = new Random();
			int random = r.nextInt(100000000);
			
			//Ȯ���� ���ϱ� ����
			int index = fileName.lastIndexOf(".");
			System.out.println("index = " + index);
			
			String fileExtension = fileName.substring(index+1);
			System.out.println("fileExtension = " + fileExtension);
			//Ȯ���� ���ϱ� ��
			
			//���ο� ���ϸ� �����
			String refileName = "add" + year + month + date + random + "." + date +  fileExtension;
			System.out.println("refileName" + refileName);
			
			//����Ŭ ��� ����� ��
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

