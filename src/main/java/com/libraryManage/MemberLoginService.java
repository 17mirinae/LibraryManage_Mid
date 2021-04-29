package com.libraryManage;

import java.util.*;
import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberLoginService {
	Scanner sc = new Scanner(System.in);
	
	private MemberDAO memberDAO;

	@Autowired
	public MemberLoginService(MemberDAO memberDao) {
		this.memberDAO = memberDao;
	}

	public void regist() {
		LoginRequest req = new LoginRequest();
		
		System.out.println("이메일 : ");
		String inputEmail = sc.next();
		req.setEmail(inputEmail);
		
		System.out.println("비밀번호 : ");
		String inputPwd = sc.next();
		req.setPassword(inputPwd);
		
		Member member = memberDAO.selectByEmail(req.getEmail());

		if (member != null) {
			throw new AlreadyExistingMemberException("dup email " + req.getEmail());
		}

		// Member newMember = new Member(req.getEmail(), req.getPassword());
		memberDAO.insert(newMember);
	}
}