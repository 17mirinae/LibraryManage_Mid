package com.libraryManage;

import java.util.*;

public class MemberDAO {

	private static long nextId = 0;

	private Map<String, Member> map = new HashMap<>();

	public Member selectByEmail(String email) {
		return map.get(email);
	}

	public void insert(Member member) {
		member.setMemId(++nextId);
		map.put(member.getMemEmail(), member);
	}

	public void update(Member member) {
		map.put(member.getMemEmail(), member);
	}

	public Collection<Member> selectAll() {
		return map.values();
	}

}
