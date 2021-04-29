package com.no_1;

public class SearchBook implements SearchBookBean {
	Book book;

	@Override
	public void searchBookBean(Book book) {
		this.book = book;
		
		System.out.println("책을 검색했습니다.");
	}
	
}
