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

	public void registMem() { // 회원가입
		MemberRequest req = new MemberRequest();

		System.out.print("이메일 : ");
		String inputEmail = sc.nextLine();
		req.setMemEmail(inputEmail);

		System.out.print("비밀번호 : ");
		String inputPwd = sc.nextLine();
		req.setMemPwd(inputPwd);

		System.out.print("비밀번호 확인 : ");
		String inputConfirmPwd = sc.nextLine();
		req.setMemConfirmPwd(inputConfirmPwd);

		System.out.print("이름 : ");
		String inputName = sc.nextLine();
		req.setMemName(inputName);

		System.out.print("연락처 (010-1234-5678) : ");
		String inputPhone = sc.nextLine();
		req.setMemPhone(inputPhone);

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

	public Member loginMem() { // 로그인
		MemberRequest req = new MemberRequest();

		System.out.print("이메일 : ");
		String inputEmail = sc.nextLine();
		req.setMemEmail(inputEmail);

		System.out.print("비밀번호 : ");
		String inputPwd = sc.nextLine();
		req.setMemPwd(inputPwd);

		Member member = memberDAO.selectByEmail(req.getMemEmail());

		if (member == null) {
			System.out.println("입력 정보를 확인하세요.");
			return null;
		} else if (!member.getMemPwd().equals(inputPwd)) { // 비밀번호 오류
			System.out.println("입력 정보를 확인하세요.");
			return null;
		} else {
			if (member.getMemEmail().equals("admin")) {
				System.out.println("관리자 로그인 성공");
			} else {
				System.out.println("사용자 로그인 성공");
			}
		}
		
		return member;
	}

	public void updateMem(Member member) { // 회원 수정
		MemberRequest req = new MemberRequest();
		req.setMemEmail(member.getMemEmail());

		System.out.print("현재 비밀번호 : ");
		String oldPwd = sc.nextLine();

		System.out.print("새 비밀번호 : ");
		String newPwd = sc.nextLine();
		req.setMemPwd(newPwd);

		System.out.print("새 비밀번호 확인 : ");
		String newConfirmPwd = sc.nextLine();
		req.setMemConfirmPwd(newConfirmPwd);

		Member newMember = memberDAO.selectByEmail(req.getMemEmail());

		if (newMember == null) { // 계정이 존재하지 않을 때
			System.out.println("\n계정이 존재하지 않습니다.\n");
		} else if (req.isPwdEqualToConfirmPwd() && member.getMemPwd().equals(oldPwd)) { // 확인할 비밀번호와 입력한 비밀번호가 같을 시
			member.changePassword(oldPwd, newPwd);
			memberDAO.update(member);
			System.out.println("\n비밀번호가 변경되었습니다.\n");
		} else
			System.out.println("\n입력 정보를 확인하세요.\n");
	}
}
