package com.libraryManage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
		// 기본기능
		// 다중 사용자의 도서 검색, 대여, 반납 기능
		// 사용자 정보입력 및 수정 (이름, 연락처, 주소 등...)
		
		// 추가기능
		// 도서대출 예약
		// 기타 도서관 시스템 추가기능
	}

}
