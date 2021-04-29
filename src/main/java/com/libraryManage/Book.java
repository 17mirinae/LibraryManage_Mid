package com.libraryManage;

public class Book {
	private String bookId; // 책 아이디
	private String bookTitle; // 책 제목
	private String bookAuthor; // 책 저자
	private String bookPublisher; // 책 출판사
	private int bookCount = 0; // 책 재고수
	private boolean isLended; // 책 대여여부

	Book(String _bookTitle, String _bookAuthor, String _bookPublisher, boolean isLended) {
		this.bookTitle = _bookTitle;
		this.bookAuthor = _bookAuthor;
		this.bookPublisher = _bookPublisher;
		this.isLended = false;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
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

	public boolean isLended() {
		return isLended;
	}

}
