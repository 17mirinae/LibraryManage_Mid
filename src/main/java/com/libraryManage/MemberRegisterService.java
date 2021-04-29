package com.libraryManage;

import java.util.*;

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

		System.out.print("이메일 : ");
		String inputEmail = sc.next();
		req.setEmail(inputEmail);

		System.out.print("비밀번호 : ");
		String inputPwd = sc.next();
		req.setPassword(inputPwd);

		System.out.print("비밀번호 확인 : ");
		String inputConfirmPwd = sc.next();
		req.setConfirmPassword(inputConfirmPwd);

		System.out.print("이름 : ");
		String inputName = sc.next();
		req.setName(inputName);

		Member member = memberDAO.selectByEmail(req.getEmail());

		if (member != null) { // 중복된 이메일이 있을 경우
			System.out.println("중복된 이메일입니다.");
			throw new AlreadyExistingMemberException("중복된 이메일");
		} else if (!req.isPasswordEqualToConfirmPassword()) { // 입력한 비밀번호와 비밀번호 확인 칸의 입력된 값이 다를 경우
			System.out.println("입력 정보를 확인하세요.");
			throw new IdPasswordNotMatchingException();
		} else {
			Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), new Date());
			memberDAO.insert(newMember);
			System.out.println("회원가입이 완료되었습니다.");
		}
	}
}
