package com.libraryManage;

import java.util.*;
import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {
	Scanner sc = new Scanner(System.in);
	
	private MemberDAO memberDAO;

	@Autowired
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDAO = memberDao;
	}

	public void regist() {
		RegisterRequest req = new RegisterRequest();
		
		System.out.println("이메일 : ");
		String inputEmail = sc.next();
		req.setEmail(inputEmail);
		
		System.out.println("비밀번호 : ");
		String inputPwd = sc.next();
		req.setPassword(inputPwd);
		
		System.out.println("이름 : ");
		String inputName = sc.next();
		req.setName(inputName);
		
		Member member = memberDAO.selectByEmail(req.getEmail());

		if (member != null) {
			throw new AlreadyExistingMemberException("dup email " + req.getEmail());
		}

		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), new Date());
		memberDAO.insert(newMember);
	}
}
