package com.libraryManage;

import java.io.*;
import java.util.*;

public class BookDAO implements Serializable {
	private Map<String, Book> map = new HashMap<>();
	private String filePath = "./src/main/resources/book_data.dat";
	
	public Book selectById(String bookId) { // 일련번호로 검색
		return map.get(bookId);
	}

	public Book selectByTitle(String bookTitle) { // 책 이름으로 검색
		return map.get(bookTitle);
	}

	public void insertBook(Book book) {
		map.put(book.getBookId(), book);
		exportToFile(map);
	}

	public void updateBook(Book book) {
		map.replace(book.getBookId(), book);
		exportToFile(map);
	}

	public void deleteBook(Book book) {
		map.remove(book.getBookId(), book);
	}

	public Collection<Book> selectAll() {
		importFromFile();
		return map.values();
	}

	public void exportToFile(Map<String, Book> map) {
		ObjectOutputStream oos;

		try {
			oos = new ObjectOutputStream(new FileOutputStream(filePath));

			oos.writeObject(map);

			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Map<String, Book> importFromFile() {
		ObjectInputStream ois;

		try {
			ois = new ObjectInputStream(new FileInputStream(filePath));

			this.map = (HashMap<String, Book>) ois.readObject();

			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return this.map;
	}
}
