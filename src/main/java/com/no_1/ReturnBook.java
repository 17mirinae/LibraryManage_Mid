package com.no_1;

public class ReturnBook implements ReturnBookBean {
	Book book;

	@Override
	public void returnBookBean(Book book) {
		this.book = book;
		
		System.out.println("책을 반납했습니다.");
	}
	
}
