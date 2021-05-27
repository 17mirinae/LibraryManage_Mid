package com.libraryManage.Service;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import com.libraryManage.DAO.*;
import com.libraryManage.DTO.*;

public class BookService {
	Scanner sc = new Scanner(System.in);

	private BookDAO bookDAO;

	@Autowired
	public BookService(BookDAO _bookDAO) {
		this.bookDAO = _bookDAO;
	}

	public void showAll() { // 책 모두 출력
		bookDAO.showAll();
	}

	public void addBook() { // 책 추가
		System.out.print("책의 일련번호 : ");
		String inputBookId = sc.nextLine();

		System.out.print("책의 제목 : ");
		String inputBookTitle = sc.nextLine();

		System.out.print("책의 저자 : ");
		String inputBookAuthor = sc.nextLine();

		System.out.print("책의 출판사 : ");
		String inputBookPublisher = sc.nextLine();

		BookDTO book = bookDAO.selectById(inputBookId);

		if (book != null) { // 일련번호가 존재한다.
			System.out.println("\n같은 일련번호를 가진 책이 있습니다.\n");
		} else {
			BookDTO newBook = new BookDTO(inputBookId, inputBookTitle, inputBookAuthor, inputBookPublisher);
			bookDAO.insertBook(newBook);
			System.out.println("\n책 추가 성공\n");
		}
		
		bookDAO.showAll();
	}

	public void deleteBook() { // 책 삭제
		System.out.print("책의 일련번호 : ");
		String inputBookId = sc.nextLine();

		BookDTO book = bookDAO.selectById(inputBookId);

		if (book == null) {
			System.out.println("\n삭제할 책이 존재하지 않습니다.\n");
		} else {
			bookDAO.deleteBook(book);
			System.out.println("\n책 삭제 성공\n");
		}
		
		bookDAO.showAll();
	}

	public void updateBook() { // 책 수정

	}
}
