package com.libraryManage;

import java.util.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Library {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		MemberRegisterService memRegSvc = (MemberRegisterService) ctx.getBean("memberRegSvc"); // 회원가입
		MemberLoginService memLoginSvc = (MemberLoginService) ctx.getBean("memberLoginSvc"); // 로그인

		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);

//		AddBookService addBookSvc = (AddBookService) ctx.getBean("addBookSvc");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n-----도서관-----");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("그 외. 사용종료");
			System.out.print("입력: ");
			int inputMenu = sc.nextInt();

			switch (inputMenu) {
			case 1:
				System.out.println("회원가입을 수행합니다.");
				memRegSvc.regist();
				break;
			case 2:
				System.out.println("로그인을 수행합니다.");
				memLoginSvc.login();
				break;
			default:
				return;
			}
		}
	}
}
