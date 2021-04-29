package com.no_1;

public class Book {
	private String bookId; // 일련번호
	private String bookTitle; // 제목
	private String bookAuthor; // 저자
	private String bookGenre; // 장르
	private String bookPublisher; // 출판사
	private boolean isLended; // 대여 여부

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

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public boolean isLended() {
		return isLended;
	}

	public void setLended(boolean isLended) {
		this.isLended = isLended;
	}

}
