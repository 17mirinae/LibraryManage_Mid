package com.libraryManage;

import java.util.*;

public class BookDAO {
	private static long nextId = 0;
	
	private Map<String, Member> map = new HashMap<>();
	
	public Book selectByTitle(String bookTitle) {
		return map.get(bookTitle);
	}
	
	public void insert(Book book) {
		book.setBookId(++nextId);
		map.put(book.getBookId(), book);
	}
	
	public void update(Book book) {
		map.put(member.getBookId(), book);
	}
	
	public Collection<Book> selectAll() {
		return map.values();
	}
}
