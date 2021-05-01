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
		exportToFile();
		importFromFile();
	}

	public void updateBook(Book book) {
		map.replace(book.getBookId(), book);
	}

	public void deleteBook(Book book) {
		map.remove(book.getBookId(), book);
	}

	public Collection<Book> selectAll() {
		return map.values();
	}

	public void exportToFile() {
		try {
			FileOutputStream fileStream = new FileOutputStream(filePath);
			ObjectOutputStream objOutputStream = new ObjectOutputStream(fileStream);

			objOutputStream.writeObject(this.map);
			
			fileStream.close();
			objOutputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("\n파일이 없습니다.\n");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Map<String, Book> importFromFile() {
		try {
			FileInputStream fileStream = new FileInputStream(filePath);
			ObjectInputStream objInputStream = new ObjectInputStream(fileStream);

			HashMap<String, Book> objFromFile = (HashMap<String, Book>) objInputStream.readObject();
			objInputStream.close();

			this.map = objFromFile;

			Iterator<String> it = map.keySet().iterator();

			while (it.hasNext()) { // 맵 키가 존재할 경우
				String key = it.next();
				Book value = (Book) map.get(key); // 키에 해당되는 객체 꺼내옴
				System.out.println(key + "-> " + value.getBookTitle());
			}
		} catch (FileNotFoundException e) {
			System.out.println("\n파일이 없습니다.\n");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return this.map;
	}
}
