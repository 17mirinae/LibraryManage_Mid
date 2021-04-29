package com.libraryManage;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginService {
	Scanner sc = new Scanner(System.in);

	private MemberDAO memberDAO;

	@Autowired
	public LoginService(MemberDAO _memberDAO) {
		this.memberDAO = _memberDAO;
	}

	public void login() {
		LoginRequest req = new LoginRequest();

		System.out.print("이메일 : ");
		String inputEmail = sc.nextLine();
		req.setEmail(inputEmail);

		System.out.print("비밀번호 : ");
		String inputPwd = sc.nextLine();
		req.setPassword(inputPwd);

		Member member = memberDAO.selectByEmail(req.getEmail());

		if (member == null) {
			System.out.println("입력 정보를 확인하세요.");
			// throw new IdPasswordNotMatchingException();
		} else if (!member.getPassword().equals(inputPwd)) { // 비밀번호 오류
			System.out.println("입력 정보를 확인하세요.");
		} else {
			System.out.println("로그인 성공");
		}
	}
}