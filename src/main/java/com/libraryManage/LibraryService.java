package com.libraryManage;

import java.util.*;
import org.springframework.beans.factory.annotation.*;

public class LibraryService {
	Scanner sc = new Scanner(System.in);

	private LibraryDAO libDAO;
	private BookDAO bookDAO;
	private MemberDAO memberDAO;

	@Autowired
	public LibraryService(LibraryDAO _libDAO) {
		this.libDAO = _libDAO;
	}

	public void lendBook() {
		searchBook();
		
		System.out.println("대여하실 책의 일련번호를 입력해주세요.");
		System.out.print("입력: ");
		String lendBookId = sc.nextLine();
		
		Book book = bookDAO.selectById(lendBookId);
		
		if(book.isLended()) { // 대여가능
			System.out.println("이 책을 대여하시겠습니까? ");
			
		} else {
			
		}
	}

	public void returnBook() {

	}

	public void searchBook() {
		String searchBookTitle = sc.nextLine();
		
		Book book = bookDAO.selectByTitle(searchBookTitle);
		
		System.out.println(); // 여기서 책 보여주자
	}
}
