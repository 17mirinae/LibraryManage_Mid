package com.libraryManage;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class RegisterService {
	Scanner sc = new Scanner(System.in);

	private MemberDAO memberDAO;

	@Autowired
	public RegisterService(MemberDAO memberDao) {
		this.memberDAO = memberDao;
	}

	public void regist() {
		RegisterRequest req = new RegisterRequest();

		System.out.print("이메일 : ");
		String inputEmail = sc.nextLine();
		req.setEmail(inputEmail);

		System.out.print("비밀번호 : ");
		String inputPwd = sc.nextLine();
		req.setPassword(inputPwd);

		System.out.print("비밀번호 확인 : ");
		String inputConfirmPwd = sc.nextLine();
		req.setConfirmPassword(inputConfirmPwd);

		System.out.print("이름 : ");
		String inputName = sc.nextLine();
		req.setName(inputName);

		Member member = memberDAO.selectByEmail(req.getEmail());

		if (member != null) { // 중복된 이메일이 있을 경우
			System.out.println("\n중복된 이메일입니다.\n");
			// throw new AlreadyExistingMemberException("중복된 이메일");
		} else if (!req.isPasswordEqualToConfirmPassword()) { // 입력한 비밀번호와 비밀번호 확인 칸의 입력된 값이 다를 경우
			System.out.println("\n입력 정보를 확인하세요.\n");
			// throw new IdPasswordNotMatchingException();
		} else {
			Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), new Date());
			memberDAO.insert(newMember);
			System.out.println("\n회원가입이 완료되었습니다.\n");
		}
	}
}
