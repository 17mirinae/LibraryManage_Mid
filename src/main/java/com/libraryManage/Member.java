package com.libraryManage;

import java.util.*;
import java.io.*;

public class Member implements Serializable {
	// private Long memId; // 사용자 번호
	private String memEmail; // 사용자 이메일
	private String memPwd; // 사용자 비밀번호
	private String memName; // 사용자 이름
	private String memPhone; // 사용자 연락처
	private String memAddr; // 사용자 주소
	private Date registerDate; // 사용자 등록시간
	private List<Book> memBook = new ArrayList<Book>(); // 대여한 도서 리스트

	public Member(String _memEmail, String _memPwd, String _memName, String _memPhone, String _memAddr) {
		this.memEmail = _memEmail;
		this.memPwd = _memPwd;
		this.memName = _memName;
		this.memPhone = _memPhone;
		this.memAddr = _memAddr;
		this.registerDate = new Date();
	}

//	public Long getMemId() {
//		return memId;
//	}
//
//	public void setMemId(Long memId) {
//		this.memId = memId;
//	}

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemAddr() {
		return memAddr;
	}

	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public List<Book> getMemBook() {
		return memBook;
	}

	public void setMemBook(List<Book> memBook) {
		this.memBook = memBook;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (!memPwd.equals(oldPassword))
			System.out.println("입력 정보를 확인하세요.");
		else
			this.memPwd = newPassword;
	}

	public String toString() {
		return "" + getMemEmail() + "\t\t" + getMemPwd() + "\t\t" + getMemName() + "\t\t" + getMemPhone() + "\t\t"
				+ getMemAddr();
	}
}
