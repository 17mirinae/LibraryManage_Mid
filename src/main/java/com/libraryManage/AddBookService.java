package com.libraryManage;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class AddBookService {
	Scanner sc = new Scanner(System.in);
	
	private BookDAO bookDAO;
	
	@Autowired
	public AddBookService(BookDAO _bookDAO) {
		this.bookDAO = _bookDAO;
	}
}
