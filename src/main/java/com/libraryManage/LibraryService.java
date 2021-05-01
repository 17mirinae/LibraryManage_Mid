package com.libraryManage;

import java.util.*;
import org.springframework.beans.factory.annotation.*;

public class LibraryService {
	Scanner sc = new Scanner(System.in);

	private LibraryDAO libDAO;
	private BookDAO bookDAO;
	private MemberDAO memberDAO;

	@Autowired
	public LibraryService(LibraryDAO _libDAO, BookDAO _bookDAO, MemberDAO _memberDAO) {
		this.libDAO = _libDAO;
		this.bookDAO = _bookDAO;
		this.memberDAO = _memberDAO;
	}

	public void lendBook(MemberService MemSvc, BookService BookSvc, Member member) {
		searchBook();

		System.out.println("\n대여하실 책의 일련번호를 입력해주세요.");
		System.out.print("입력: ");
		String lendBookId = sc.nextLine();

		Book book = bookDAO.selectById(lendBookId);
		System.out.println(book.toString());

		System.out.print("\n이 책을 대여하시겠습니까? (Y/N) ");
		String memChoice = sc.nextLine();

		switch (memChoice) {
		case "Y":
			if (book.isLended()) { // 대여가능
				System.out.print("비밀번호를 입력: ");
				String inputPwd = sc.nextLine();

				if (member.getMemPwd().equals(inputPwd)) {
					book.setLended(false);
					book.setBookEmail(member.getMemEmail());
					bookDAO.exportToFile();

					List<Book> bookList = new ArrayList<Book>();

					bookList.add(book);
					member.setMemBook(bookList);
					memberDAO.exportToFile();
					System.out.println("\n대여했습니다.\n");
				} else {
					System.out.println("\n비밀번호 오류\n대여하지 못했습니다.\n");
				}
			} else { // 대여중
				System.out.println("\n대여할 수 없는 책입니다.\n");
			}
			break;
		case "N":
			break;
		}
	}

	public void returnBook(MemberService MemSvc, BookService BookSvc, Member member) {
		System.out.println("반납하실 도서의 일련번호를 입력해주세요.");
		System.out.print("입력: ");
		String inputBookId = sc.nextLine();

		Book book = bookDAO.selectById(inputBookId);
		System.out.println(book.toString());
		System.out.print("이 책을 반납하시겠습니까? (Y/N) ");
		String memChoice = sc.nextLine();

		switch (memChoice) {
		case "Y":
			if (book.getBookEmail().equals(member.getMemEmail())) { // 대여 중일 시

				System.out.print("비밀번호를 입력: ");
				String inputPwd = sc.nextLine();

				if (member.getMemPwd().equals(inputPwd)) {
					book.setLended(true);
					book.setBookEmail(null);
					bookDAO.exportToFile();

					List<Book> bookList = new ArrayList<Book>();
					bookList = member.getMemBook();
					bookList.remove(book);
					memberDAO.exportToFile();
					System.out.println("\n반납했습니다.\n");
				} else {
					System.out.println("\n비밀번호 오류\n반납하지 못했습니다.\n");
				}
			} else { // 대여 중이 아닐 시
				System.out.println("\n반납할 수 없는 책입니다.\n");
			}
			break;
		case "N":
			break;
		}

	}

	public void searchBook() {
		System.out.print("도서 제목 입력: ");
		String searchBookTitle = sc.nextLine();

		List<Book> bookList = bookDAO.selectByTitle(searchBookTitle);

		System.out.println("\n-----검색된 결과 출력-----");
		for (Book book : bookList) {
			System.out.println(book.toString());
		}
	}
}
