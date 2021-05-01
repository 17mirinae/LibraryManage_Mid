package com.libraryManage;

import java.io.*;

public class Book implements Serializable {
	private String bookId; // 책 ISBN
	private String bookTitle; // 책 제목
	private String bookAuthor; // 책 저자
	private String bookPublisher; // 책 출판사
	private int bookCount; // 책 재고수
	private String bookEmail; // 빌린 사람
	private boolean isLended; // 책 대여여부

	Book(String _bookId, String _bookTitle, String _bookAuthor, String _bookPublisher) {
		this.bookId = _bookId;
		this.bookTitle = _bookTitle;
		this.bookAuthor = _bookAuthor;
		this.bookPublisher = _bookPublisher;
		this.bookEmail = null;
		this.bookCount = 0;
		this.isLended = true;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public String getBookEmail() {
		return bookEmail;
	}

	public void setBookEmail(String bookEmail) {
		this.bookEmail = bookEmail;
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
