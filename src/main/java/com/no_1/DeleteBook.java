package com.no_1;

public class DeleteBook implements DeleteBookBean {
	Book book;
	
	@Override
	public void deleteBookBean(Book book) {
		this.book = book;
		
		System.out.println("책이 삭제되었습니다.");
	}
}
