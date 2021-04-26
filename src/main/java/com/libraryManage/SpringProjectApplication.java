package com.libraryManage;

import java.io.*;

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
		
		// 7개 Bean 객체 등록 (setter, constructor injection 사용할 것)
		// Spring boot
		// 주요 객체들간의 dependency 를 spring 설정 기능을 이용
		// constructor/setter injection 사용 연결
		
		try {
			FileReader fr = new FileReader(new File("./src/main/java/com/libraryManage/book_data.txt"));
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		
		
	}

}
