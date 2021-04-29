package com.libraryManage;

import java.util.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

import temp.MemberInfoPrinter;

public class Library {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		MemberService MemSvc = (MemberService) ctx.getBean("MemSvc"); // 회원가입, 로그인

		// MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter",
		// MemberInfoPrinter.class);

		BookService BookSvc = (BookService) ctx.getBean("BookSvc");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n-----도서관-----");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 책 추가");
			System.out.println("4. 책 삭제");
			System.out.println("5. 책 수정");
			System.out.println("6. 도서 검색");
			System.out.println("7. 도서 대여");
			System.out.println("8. 도서 반납");
			System.out.println("그 외. 사용종료");
			System.out.print("입력: ");
			int inputMenu = sc.nextInt();

			switch (inputMenu) {
			case 1:
				System.out.println("회원가입을 수행합니다.");
				MemSvc.regist();
				break;
			case 2:
				System.out.println("로그인을 수행합니다.");
				MemSvc.login();
				break;
			case 3:
				System.out.println("책을 추가합니다.");
				BookSvc.addBook();
				break;
			case 4:
				System.out.println("책을 삭제합니다.");
				BookSvc.deleteBook();
				break;
			default:
				return;
			}
		}
	}
}
