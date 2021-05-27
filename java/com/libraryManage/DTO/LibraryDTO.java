package com.libraryManage.DTO;

public class LibraryDTO {
	private String memEmail;
	private String bookId;
	private String lendDate;

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemId(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

}
