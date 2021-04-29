package com.no_1;

public class AddBook implements AddBookBean {
	Book book;

	@Override
	public void addBookBean(Book book) {
		this.book = book;

		System.out.println("책이 추가되었습니다.");
	}
}
