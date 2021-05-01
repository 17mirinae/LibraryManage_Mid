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

	}

	public void returnBook() {

	}
}
