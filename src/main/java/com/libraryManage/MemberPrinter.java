package com.libraryManage;

import java.util.Map;

public class MemberPrinter {

	public void print(Member member) {
		System.out.println("사용자 이메일: " + member.getMemEmail() + "\t\t사용자 비밀번호: " + member.getMemPwd() + "\t\t사용자 이름: "
				+ member.getMemName() + "\t\t사용자 연락처: " + member.getMemPhone() + "\t\t사용자 주소: " + member.getMemAddr()
				+ "\t\t사용자 등록일: " + member.getRegisterDate());
	}

}
