package com.libraryManage;

import org.springframework.context.annotation.*;

@Configuration
public class JavaConfig {
	
	@Bean(name="addBookBean") // 책 추가
	public AddBookBean addBookBean() {
		return new AddBookBean();
	}
	
	@Bean // 책 삭제
	public DeleteBookBean deleteBookBean() {
		DeleteBookBean dbb = new DeleteBookBean();
		return dbb;
	}
	@Bean // 검색
	@Bean // 대여
	@Bean // 반납
	@Bean // 로그인
	
	@Bean // 회원가입
	@Scope("prototype")
	public MemberDAO memberDAO() {
		return new MemberDAO();
	}
}
