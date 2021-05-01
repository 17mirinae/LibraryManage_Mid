package com.libraryManage;

import java.util.*;
import org.springframework.beans.factory.annotation.*;

public class BookService {
	Scanner sc = new Scanner(System.in);

	private BookDAO bookDAO;

	@Autowired
	public BookService(BookDAO _bookDAO) {
		this.bookDAO = _bookDAO;
	}

	public void showAll() { // 책 검색
		bookDAO.showAll();
	}
	
	public void addBook() { // 책 추가
		BookRequest req = new BookRequest();

		System.out.print("책의 일련번호 : ");
		String inputBookId = sc.nextLine();
		req.setBookId(inputBookId);

		System.out.print("책의 제목 : ");
		String inputBookTitle = sc.nextLine();
		req.setBookTitle(inputBookTitle);

		System.out.print("책의 저자 : ");
		String inputBookAuthor = sc.nextLine();
		req.setBookAuthor(inputBookAuthor);

		System.out.print("책의 출판사 : ");
		String inputBookPublisher = sc.nextLine();
		req.setBookPublisher(inputBookPublisher);

		Book book = bookDAO.selectById(req.getBookId());

		if (book != null) { // 일련번호가 존재한다.
			System.out.println("같은 일련번호를 가진 책이 있습니다.");
		} else {
			Book newBook = new Book(req.getBookId(), req.getBookTitle(), req.getBookAuthor(), req.getBookPublisher());
			bookDAO.insertBook(newBook);
			System.out.println("\n책 추가 성공\n");
		}
	}

	public void deleteBook() { // 책 삭제
		BookRequest req = new BookRequest();

		System.out.print("책의 일련번호 : ");
		String inputBookId = sc.nextLine();
		req.setBookId(inputBookId);

		Book book = bookDAO.selectById(req.getBookId());

		if (book == null) {
			System.out.println("삭제할 책이 존재하지 않습니다.");
		} else {
			bookDAO.deleteBook(book);
			System.out.println("\n책 삭제 성공\n");
		}
	}
	
	public void updateBook() { // 책 수정
		
	}
}
