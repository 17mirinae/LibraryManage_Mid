package com.libraryManage;

import java.util.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		MemberService MemSvc = (MemberService) ctx.getBean("MemSvc"); // 회원가입, 로그인
		BookService BookSvc = (BookService) ctx.getBean("BookSvc"); // 책 추가, 책 삭제
		LibraryService LibSvc = (LibraryService) ctx.getBean("LibrarySvc"); // 책 대여, 반납

		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);

		mainMenu(MemSvc, BookSvc, LibSvc, infoPrinter);
	}

	public static void mainMenu(MemberService MemSvc, BookService BookSvc, LibraryService LibSvc,
			MemberInfoPrinter infoPrinter) {
		System.out.println("\n-----도서관-----");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("그 외. 사용종료");
		System.out.print("입력: ");
		int inputMenu = sc.nextInt();

		switch (inputMenu) {
		case 1:
			System.out.println("\n회원가입을 수행합니다.\n");
			MemSvc.registMem();
			mainMenu(MemSvc, BookSvc, LibSvc, infoPrinter);
			break;
		case 2:
			System.out.println("\n로그인을 수행합니다.\n");
			Member member = MemSvc.loginMem();

			if (member != null) {
				if (member.getMemEmail().equals("admin"))
					afterAdminLogin(MemSvc, BookSvc, LibSvc, infoPrinter);
				else
					afterMemberLogin(MemSvc, BookSvc, LibSvc, member);
			} else {
				System.out.println("\n로그인 실패\n");
			}

			mainMenu(MemSvc, BookSvc, LibSvc, infoPrinter);
			break;
		default:
			System.out.println("\n종료합니다.\n");
			return;
		}
	}

	public static void afterAdminLogin(MemberService MemSvc, BookService BookSvc, LibraryService LibSvc,
			MemberInfoPrinter infoPrinter) {
		System.out.println("\n----도서관-----");
		System.out.println("1. 도서 검색");
		System.out.println("2. 도서 추가");
		System.out.println("3. 도서 수정");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 회원 관리");
		System.out.println("그 외. 로그아웃");
		System.out.print("입력: ");
		int inputMenu = sc.nextInt();

		switch (inputMenu) {
		case 1:
			System.out.println("\n도서를 검색합니다.\n");
			LibSvc.searchBook();
			afterAdminLogin(MemSvc, BookSvc, LibSvc, infoPrinter);
			break;
		case 2:
			System.out.println("\n도서를 추가합니다.\n");
			BookSvc.addBook();
			afterAdminLogin(MemSvc, BookSvc, LibSvc, infoPrinter);
			break;
		case 3:
			System.out.println("\n도서 정보를 수정합니다.\n");
			BookSvc.updateBook();
			afterAdminLogin(MemSvc, BookSvc, LibSvc, infoPrinter);
			break;
		case 4:
			System.out.println("\n도서 정보를 삭제합니다.\n");
			BookSvc.deleteBook();
			afterAdminLogin(MemSvc, BookSvc, LibSvc, infoPrinter);
			break;
		case 5:
			System.out.println("\n회원 관리를 시작합니다.\n");
			manageMember(MemSvc, BookSvc, LibSvc, infoPrinter);
			afterAdminLogin(MemSvc, BookSvc, LibSvc, infoPrinter);
			break;
		default:
			System.out.println("\n로그아웃합니다.\n");
			break;
		}
	}

	public static void afterMemberLogin(MemberService MemSvc, BookService BookSvc, LibraryService LibSvc,
			Member member) {
		System.out.println("\n-----도서관-----");
		System.out.println("1. 비밀번호 수정");
		System.out.println("2. 도서 검색");
		System.out.println("3. 도서 대여");
		System.out.println("4. 도서 반납");
		System.out.println("5. 대여 내역 조회");
		System.out.println("그 외. 로그아웃");
		System.out.print("입력: ");
		int inputMenu = sc.nextInt();

		switch (inputMenu) {
		case 1:
			System.out.println("\n비밀번호를 변경합니다.\n");
			MemSvc.updateMem(member);
			afterMemberLogin(MemSvc, BookSvc, LibSvc, member);
			break;
		case 2:
			System.out.println("\n도서 정보를 검색합니다.\n");
			LibSvc.searchBook();
			afterMemberLogin(MemSvc, BookSvc, LibSvc, member);
			break;
		case 3:
			System.out.println("\n도서를 대여합니다.\n");
			LibSvc.lendBook(MemSvc, BookSvc, member);
			afterMemberLogin(MemSvc, BookSvc, LibSvc, member);
			break;
		case 4:
			System.out.println("\n도서를 반납합니다.\n");
			LibSvc.returnBook(MemSvc, BookSvc, member);
			afterMemberLogin(MemSvc, BookSvc, LibSvc, member);
			break;
		default:
			System.out.println("\n로그아웃합니다.\n");
			break;
		}
	}

	public static void manageMember(MemberService MemSvc, BookService BookService, LibraryService LibSvc,
			MemberInfoPrinter infoPrinter) {
		System.out.println("\n-----회원 관리-----");
		System.out.println("1. 회원 전체 조회");
		System.out.println("그 외. 뒤로");
		System.out.print("입력: ");
		int inputMenu = sc.nextInt();

		switch (inputMenu) {
		case 1:
			System.out.println("\n회원을 모두 출력합니다.");
//			System.out.println("\n조회할 회원의 이메일을 입력하세요.");
//			System.out.print("입력: ");
//			String inputEmail = sc.nextLine();
			infoPrinter.printAllMember();
			break;
		default:
			System.out.println("\n회원관리를 종료합니다.");
			break;
		}
	}
}
