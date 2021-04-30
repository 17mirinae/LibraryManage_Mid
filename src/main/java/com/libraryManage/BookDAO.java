package com.libraryManage;

import java.io.*;
import java.util.*;

public class BookDAO {
	private Map<String, Book> map = new HashMap<>();
	private String filePath = "./src/main/resources/book_data.data";

	public Book selectById(String bookId) { // 일련번호로 검색
		return map.get(bookId);
	}

	public Book selectByTitle(String bookTitle) { // 책 이름으로 검색
		return map.get(bookTitle);
	}

	public void insertBook(Book book) {
		map.put(book.getBookId(), book);
	}

	public void updateBook(Book book) {
		map.put(book.getBookId(), book);
	}

	public void deleteBook(Book book) {
		map.remove(book.getBookId(), book);
	}

	public Collection<Book> selectAll() {
		return map.values();
	}

	public void exportToFile(HashMap<String, Book> map) {
		try {
			
		}
	}

	public HashMap<String, Book> importFromFile(File file) {
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		
		ObjectOutputStream objInputStream = null;
		FileOutputStream
		
		return map;
	}
}
