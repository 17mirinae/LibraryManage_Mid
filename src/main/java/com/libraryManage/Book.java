package com.libraryManage;

import java.io.*;

public class Book implements Serializable {
	private String bookId; // 책 ISBN
	private String bookTitle; // 책 제목
	private String bookAuthor; // 책 저자
	private String bookPublisher; // 책 출판사
	private int bookCount; // 책 재고수
	private boolean isLended; // 책 대여여부

	Book(String _bookId, String _bookTitle, String _bookAuthor, String _bookPublisher) {
		this.bookId = _bookId;
		this.bookTitle = _bookTitle;
		this.bookAuthor = _bookAuthor;
		this.bookPublisher = _bookPublisher;
		this.bookCount = 0;
		this.isLended = false;
	}

	public String getBookId() {
		return bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public boolean isLended() {
		return isLended;
	}

	public void setLended(boolean isLended) {
		this.isLended = isLended;
	}

	public String toString() {
		return "" + getBookId() + "\t\t" + getBookTitle() + "\t\t" + getBookAuthor() + "\t\t" + getBookPublisher()
				+ "\t\t" + isLended();
	}
}
