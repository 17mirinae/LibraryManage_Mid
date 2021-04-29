package com.libraryManage;

import java.util.*;

public class BookDAO {
	private Map<String, Book> map = new HashMap<>();

	public Book selectById(String bookId) { // 일련번호로 검색
		return map.get(bookId);
	}

	public Book selectByTitle(String bookTitle) { // 책 이름으로 검색
		return map.get(bookTitle);
	}

	public void insert(Book book) {
		map.put(book.getBookId(), book);
	}

	public void update(Book book) {
		map.put(book.getBookId(), book);
	}
	
	public void delete(Book book) {
		map.remove(book.getBookId(), book);
	}

	public Collection<Book> selectAll() {
		return map.values();
	}
}
