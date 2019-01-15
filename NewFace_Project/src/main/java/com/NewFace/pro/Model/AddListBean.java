package com.NewFace.pro.Model;

import org.springframework.web.multipart.MultipartFile;

public class AddListBean {
	
	//▼테이블 추가!!
	private MultipartFile prof_img; //기본파일첨부 (사진이미지)
	private String new_prof_img; //변경된 첨부 파일명 (사진이미지)
	private String prof_original;
	private MultipartFile uploadfile;
	
	private String sido; //시도
	private String sigungu; //시군구
	
	private String m_hobby; //취미(매칭)
	private String m_gender; //성별
	private String m_pr; //자기소개
	
	public MultipartFile getProf_img() {
		return prof_img;
	}
	public void setProf_img(MultipartFile prof_img) {
		this.prof_img = prof_img;
	}
	public String getNew_prof_img() {
		return new_prof_img;
	}
	public void setNew_prof_img(String new_prof_img) {
		this.new_prof_img = new_prof_img;
	}
	public String getProf_original() {
		return prof_original;
	}
	public void setProf_original(String prof_original) {
		this.prof_original = prof_original;
	}
	public MultipartFile getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getSigungu() {
		return sigungu;
	}
	public void setSigungu(String sigungu) {
		this.sigungu = sigungu;
	}
	public String getM_hobby() {
		return m_hobby;
	}
	public void setM_hobby(String m_hobby) {
		this.m_hobby = m_hobby;
	}
	public String getM_gender() {
		return m_gender;
	}
	public void setM_gender(String m_gender) {
		this.m_gender = m_gender;
	}
	public String getM_pr() {
		return m_pr;
	}
	public void setM_pr(String m_pr) {
		this.m_pr = m_pr;
	}
	
}