package com.no_1;

public class LendBook implements LendBookBean {
	Book book;

	@Override
	public void lendBookBean(Book book) {
		this.book = book;
		
		System.out.println("책을 대여했습니다.");
	}
	
}
