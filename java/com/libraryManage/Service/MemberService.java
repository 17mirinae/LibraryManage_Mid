package com.libraryManage.Service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.libraryManage.DAO.*;
import com.libraryManage.DTO.*;

public class MemberService {
	Scanner sc = new Scanner(System.in);

	private MemberDAO memberDAO;

	@Autowired
	public MemberService(MemberDAO memberDao) {
		this.memberDAO = memberDao;
	}

	public void registMem() { // 회원가입
		System.out.print("이메일: ");
		String inputEmail = sc.nextLine();

		System.out.print("비밀번호: ");
		String inputPwd = sc.nextLine();

		System.out.print("비밀번호 확인: ");
		String inputConfirmPwd = sc.nextLine();

		System.out.print("이름: ");
		String inputName = sc.nextLine();

		System.out.print("연락처 (010-1234-5678): ");
		String inputPhone = sc.nextLine();

		System.out.print("주소: ");
		String inputAddr = sc.nextLine();

		MemberDTO member = memberDAO.selectByEmail(inputEmail);

		if (member != null) { // 중복된 이메일이 있을 경우
			System.out.println("\n중복된 이메일입니다.\n");
		} else if (!inputPwd.equals(inputConfirmPwd)) {
			// 입력한 비밀번호와 비밀번호 확인 칸의 입력된 값이 다를 경우
			System.out.println("\n입력 정보를 확인하세요.\n");
		} else {
			MemberDTO newMember = new MemberDTO(inputEmail, inputPwd, inputName, inputPhone, inputAddr);
			memberDAO.insertMem(newMember);
			System.out.println("\n회원가입이 완료되었습니다.\n");
		}

		memberDAO.showAll();
	}

	public MemberDTO loginMem() { // 로그인
		System.out.print("이메일 : ");
		String inputEmail = sc.nextLine();

		System.out.print("비밀번호 : ");
		String inputPwd = sc.nextLine();

		MemberDTO member = memberDAO.selectByEmail(inputEmail);

		if (member == null) {
			System.out.println("\n입력 정보를 확인하세요.\n");
			return null;
		} else if (!member.getMemPwd().equals(inputPwd)) { // 비밀번호 오류
			System.out.println("\n입력 정보를 확인하세요.\n");
			return null;
		} else {
			if (member.getMemEmail().equals("admin")) {
				System.out.println("\n관리자 로그인 성공\n");
			} else {
				System.out.println("\n사용자 로그인 성공\n");
			}
		}

		return member;
	}

	public void updateMem(MemberDTO _member) { // 회원 수정
		System.out.print("현재 비밀번호 : ");
		String oldPwd = sc.nextLine();

		System.out.print("새 비밀번호 : ");
		String newPwd = sc.nextLine();

		System.out.print("새 비밀번호 확인 : ");
		String newConfirmPwd = sc.nextLine();

		MemberDTO member = memberDAO.selectByEmail(_member.getMemEmail());

		if (member == null) { // 계정이 존재하지 않을 때
			System.out.println("\n계정이 존재하지 않습니다.\n");
		} else if (newPwd.equals(newConfirmPwd) && member.getMemPwd().equals(oldPwd)) {
			// 확인할 비밀번호와 입력한 비밀번호가 같을 시
			member.changePassword(oldPwd, newPwd);
			memberDAO.updateMem(member);
			System.out.println("\n비밀번호가 변경되었습니다.\n");
		} else
			System.out.println("\n입력 정보를 확인하세요.\n");

		memberDAO.showAll();
	}

	public void deleteMem() { // 회원 삭제
		memberDAO.showAll();
		
		System.out.println("\n삭제할 회원의 이메일을 입력하세요.\n");
		String inputEmail = sc.nextLine();

		MemberDTO member = memberDAO.selectByEmail(inputEmail);

		if (member == null) {
			System.out.println("\n계정이 존재하지 않습니다.\n");
		} else {
			memberDAO.deleteMem(member);
			System.out.println("\n회원이 삭제되었습니다.");
		}

		memberDAO.showAll();
	}
}
