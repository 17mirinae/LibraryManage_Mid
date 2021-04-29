package com.libraryManage;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {
	Scanner sc = new Scanner(System.in);

	private MemberDAO memberDAO;

	@Autowired
	public MemberService(MemberDAO memberDao) {
		this.memberDAO = memberDao;
	}

	public void regist() { // 회원가입
		MemberRequest req = new MemberRequest();

		System.out.print("이메일 : ");
		String inputEmail = sc.nextLine();
		req.setMemEmail(inputEmail);

		System.out.print("비밀번호 : ");
		String inputPwd = sc.nextLine();
		req.setMemPassword(inputPwd);

		System.out.print("비밀번호 확인 : ");
		String inputConfirmPwd = sc.nextLine();
		req.setMemConfirmPwd(inputConfirmPwd);

		System.out.print("이름 : ");
		String inputName = sc.nextLine();
		req.setMemName(inputName);

		System.out.print("연락처 (010-1234-5678) : ");
		String inputPhone = sc.nextLine();
		req.setMemPassword(inputPhone);

		Member member = memberDAO.selectByEmail(req.getMemEmail());

		if (member != null) { // 중복된 이메일이 있을 경우
			System.out.println("\n중복된 이메일입니다.\n");
		} else if (!req.isPwdEqualToConfirmPwd()) { // 입력한 비밀번호와 비밀번호 확인 칸의 입력된 값이 다를 경우
			System.out.println("\n입력 정보를 확인하세요.\n");
		} else {
			Member newMember = new Member(req.getMemEmail(), req.getMemPwd(), req.getMemName(), req.getMemPhone(),
					req.getMemAddr());
			memberDAO.insert(newMember);
			System.out.println("\n회원가입이 완료되었습니다.\n");
		}
	}

	public void login() { // 로그인
		MemberRequest req = new MemberRequest();

		System.out.print("이메일 : ");
		String inputEmail = sc.nextLine();
		req.setMemEmail(inputEmail);

		System.out.print("비밀번호 : ");
		String inputPwd = sc.nextLine();
		req.setMemPassword(inputPwd);

		Member member = memberDAO.selectByEmail(req.getMemEmail());

		if (member == null) {
			System.out.println("입력 정보를 확인하세요.");
		} else if (!member.getMemPwd().equals(inputPwd)) { // 비밀번호 오류
			System.out.println("입력 정보를 확인하세요.");
		} else {
			System.out.println("로그인 성공");
		}
	}
}
