package com.no_1;

import org.springframework.context.annotation.*;

@Configuration
public class JavaConfig {

	@Bean // 책 추가
	public AddBookBean addBookBean() {
		AddBookBean adb = new AddBook();

		return adb;
	}

	@Bean // 책 삭제
	public DeleteBookBean deleteBookBean() {
		DeleteBookBean dbb = new DeleteBook();

		return dbb;
	}

	@Bean // 검색
	public SearchBookBean searchBookBean() {
		SearchBookBean sbb = new SearchBook();

		return sbb;
	}

	@Bean // 대여
	public LendBookBean lendBookBean() {
		LendBookBean lbb = new LendBook();

		return lbb;
	}

	@Bean // 반납
	public ReturnBookBean returnBookBean() {
		ReturnBookBean rbb = new ReturnBook();

		return rbb;
	}

	@Bean // 로그인
	public LoginBean login() {
		LoginBean login = new Login();

		return login;
	}

	@Bean // 회원가입
	@Scope("prototype")
	public RegisterBean register() {
		RegisterBean register = new Register();

		return register;
	}
}
