package com.libraryManage;

public class MemberRequest {
	private String memEmail; // 이메일
	private String memPwd; // 비밀번호
	private String memConfirmPwd; // 비밀번호 확인
	private String memName; // 이름
	private String memPhone; // 연락처
	private String memAddr; // 주소

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public void setMemPassword(String memPwd) {
		this.memPwd = memPwd;
	}

	public String getMemConfirmPwd() {
		return memConfirmPwd;
	}

	public void setMemConfirmPwd(String memConfirmPwd) {
		this.memConfirmPwd = memConfirmPwd;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemAddr() {
		return memAddr;
	}

	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}

	public boolean isPwdEqualToConfirmPwd() {
		return memPwd.equals(memConfirmPwd);
	}
}
