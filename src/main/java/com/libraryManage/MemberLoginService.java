package com.libraryManage;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberLoginService {
	Scanner sc = new Scanner(System.in);

	private MemberDAO memberDAO;

	@Autowired
	public MemberLoginService(MemberDAO memberDao) {
		this.memberDAO = memberDao;
	}

	public void login() {
		LoginRequest req = new LoginRequest();

		System.out.println("이메일 : ");
		String inputEmail = sc.next();
		req.setEmail(inputEmail);

		System.out.println("비밀번호 : ");
		String inputPwd = sc.next();
		req.setPassword(inputPwd);

		Member member = memberDAO.selectByEmail(req.getEmail());

		if (member == null) {
			System.out.println("입력 정보를 확인하세요.");
			throw new IdPasswordNotMatchingException();
		} else if (!member.getPassword().equals(inputPwd)) { // 비밀번호 오류
			System.out.println("입력 정보를 확인하세요.");
		} else {
			System.out.println("로그인 성공");
		}
	}
}