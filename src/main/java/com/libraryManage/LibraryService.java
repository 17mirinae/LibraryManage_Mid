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

	public void lendBook(MemberService MemSvc, BookService BookSvc) {
		searchBook();

		System.out.println("대여하실 책의 일련번호를 입력해주세요.");
		System.out.print("입력: ");
		String lendBookId = sc.nextLine();

		Book book = bookDAO.selectById(lendBookId);

		if (book.isLended()) { // 대여가능
			System.out.print("이 책을 대여하시겠습니까? (Y/N) ");
			String memChoice = sc.nextLine();

			switch (memChoice) {
			case "Y":
				System.out.print("이메일 입력: ");
				String inputEmail = sc.nextLine();
				Member member = memberDAO.selectByEmail(inputEmail);

				System.out.println(member.toString());

				if (member != null) {
					book.setLended(false);
					book.setBookEmail(inputEmail);
					bookDAO.exportToFile();
					System.out.println("\n대여했습니다.\n");
				}
				break;
			case "N":
				break;
			}
		} else { // 대여중
			System.out.println("\n대여할 수 없는 책입니다.\n");
		}
	}

	public void returnBook() {
		
	}

	public void searchBook() {
		String searchBookTitle = sc.nextLine();

		List<Book> bookList = bookDAO.selectByTitle(searchBookTitle);

		for (Book book : bookList) {
			System.out.println(book.toString());
		}
	}
}
