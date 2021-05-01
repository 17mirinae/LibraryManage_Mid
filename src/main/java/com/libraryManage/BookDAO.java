package com.libraryManage;

import java.io.*;
import java.util.*;

public class BookDAO implements Serializable {
	private Map<String, Book> map = new HashMap<>();
	private String filePath = "./src/main/resources/book_data.dat";

	public Book selectById(String bookId) { // 일련번호로 데이터 받아오기
		importFromFile();
		return map.get(bookId);
	}

	public List<Book> selectByTitle(String bookTitle) { // 책 이름으로 검색
		List<Book> bookSearched = new ArrayList<Book>();
		importFromFile(); // 현재 this.map 에 파일에서 가져온 데이터를 넣어놨음

		for (Map.Entry<String, Book> element : map.entrySet()) {
			String bookTitleFromMap = element.getValue().getBookTitle(); // 책 제목
			if (bookTitleFromMap.equals(bookTitle)) {
				bookSearched.add(element.getValue());
			}
		}

		return bookSearched;
	}

	public void insertBook(Book book) {
		importFromFile();
		map.put(book.getBookId(), book);
		exportToFile();
	}

	public void updateBook(Book book) {
		importFromFile();
		map.replace(book.getBookId(), book);
		exportToFile();
	}

	public void deleteBook(Book book) {
		importFromFile();
		map.remove(book.getBookId());
		exportToFile();
	}

	public void showAll() {
		System.out.println("책 일련번호\t\t책 제목\t\t책 저자\t\t책 출판사\t\t대여 여부\t\t대여한 사람");
		System.out.println("---------------------------------------------------------------------------------------");

		for (Map.Entry<String, Book> element : map.entrySet()) {
			// String bookIdFromMap = element.getKey();
			Book valueFromMap = element.getValue();
			System.out.println(valueFromMap.toString());
		}
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
				// System.out.println(key + "-> " + value.toString());
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
