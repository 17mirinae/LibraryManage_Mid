package com.libraryManage;

import java.util.Date;

public class Member {

	private Long id;
	private String email;
	private String password;
	private String name;
	private Date registerDate;

	public Member(String email, String password, String name, Date registerDate) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}

	void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (!password.equals(oldPassword)) {
			System.out.println("입력 정보를 확인하세요.");
			// throw new IdPasswordNotMatchingException();
		}
		this.password = newPassword;
	}

}
