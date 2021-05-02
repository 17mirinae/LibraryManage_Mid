package com.libraryManage;

import org.springframework.beans.factory.annotation.*;

public class MemberInfoPrinter {

	@Autowired
	private MemberDAO memDao;
	private MemberPrinter printer;

	public void setMemberDAO(MemberDAO memberDao) {
		this.memDao = memberDao;
	}

	@Autowired
	public void setPrinter(MemberPrinter printer) {
		System.out.println("setPrinter: " + printer);
		this.printer = printer;
	}

	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);

		if (member == null) {
			System.out.println("데이터 없음\n");
		} else {
			printer.print(member);
		}
		System.out.println();
	}

	public void printAllMember() {
		memDao.showAll();
	}
}
