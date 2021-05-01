package com.libraryManage;

import java.util.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

import temp.MemberInfoPrinter;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		MemberService MemSvc = (MemberService) ctx.getBean("MemSvc"); // 회원가입, 로그인

		// MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter",
		// MemberInfoPrinter.class);

		BookService BookSvc = (BookService) ctx.getBean("BookSvc"); // 책 추가, 책 삭제

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n-----도서관-----");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 비밀번호 수정");
			System.out.println("4. 책 추가");
			System.out.println("5. 책 삭제");
			System.out.println("6. 책 수정");
			System.out.println("7. 도서 검색");
			System.out.println("8. 도서 대여");
			System.out.println("9. 도서 반납");
			System.out.println("그 외. 사용종료");
			System.out.print("입력: ");
			int inputMenu = sc.nextInt();

			switch (inputMenu) {
			case 1:
				System.out.println("회원가입을 수행합니다.");
				MemSvc.registMem();
				break;
			case 2:
				System.out.println("로그인을 수행합니다.");
				MemSvc.loginMem();
				break;
//			case 3:
//				System.out.println("비밀번호를 수정합니다.");
//				MemSvc.updateMem();
//				break;
			case 4:
				System.out.println("책을 추가합니다.");
				BookSvc.addBook();
				break;
			case 5:
				System.out.println("책을 삭제합니다.");
				BookSvc.deleteBook();
				break;
			default:
				System.out.println("종료합니다.");
				return;
			}
		}

//		
//			System.out.println("\n-----도서관-----");
//			System.out.println("1. 비밀번호 수정");
//			System.out.println("2. 도서 검색");
//			System.out.println("3. 도서 대여");
//			System.out.println("4. 도서 반납");
//			System.out.println("5. 대여 내역 조회");
//			System.out.println("6. 로그아웃");
//			System.out.print("입력: ");
//			int inputMenu = sc.nextInt();
//
//			switch (inputMenu) {
//			case 1:
//				System.out.println("비밀번호를 수정합니다.");
//				// MemSvc.updateMem(member);
//				break;
//			}
//		}
	}
}
