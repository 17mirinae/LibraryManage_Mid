package com.libraryManage;

import java.io.*;
import java.util.*;

public class MemberDAO {
	private Map<String, Member> map = new HashMap<>();
	private String filePath = "./src/main/resources/member_data.dat";

	public Member selectByEmail(String email) {
		importFromFile();
		return map.get(email);
	}

	public void addToBookList(String memEmail, Book book) {

	}

	public void insertMem(Member member) {
		importFromFile();
		map.put(member.getMemEmail(), member);
		exportToFile();
	}

	public void updateMem(Member member) {
		importFromFile();
		map.replace(member.getMemEmail(), member);
		exportToFile();
	}

	public void deleteMem(Member member) {
		importFromFile();
		map.remove(member.getMemEmail());
		exportToFile();
	}

	public void showAll() {
		System.out.println("사용자 이메일\t\t사용자 비밀번호\t\t사용자 이름\t\t사용자 연락처\t\t사용자 주소\t\t사용자 등록시간");
		System.out.println("---------------------------------------------------------------------------------------");

		for (Map.Entry<String, Member> element : map.entrySet()) {
			Member valueFromMap = element.getValue();
			System.out.println(valueFromMap.toString());
		}
	}

	public void exportToFile() {
		try {
			FileOutputStream fileStream = new FileOutputStream(filePath);
			ObjectOutputStream objOutputStream = new ObjectOutputStream(fileStream);

			objOutputStream.writeObject(this.map);

			fileStream.close();
			objOutputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("\n파일이 없습니다.\n");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Map<String, Member> importFromFile() {
		try {
			FileInputStream fileStream = new FileInputStream(filePath);
			ObjectInputStream objInputStream = new ObjectInputStream(fileStream);

			HashMap<String, Member> objFromFile = (HashMap<String, Member>) objInputStream.readObject();
			objInputStream.close();

			this.map = objFromFile;

			Iterator<String> it = map.keySet().iterator();

			while (it.hasNext()) { // 맵 키가 존재할 경우
				String key = it.next();
				Member value = (Member) map.get(key); // 키에 해당되는 객체 꺼내옴
			}
		} catch (FileNotFoundException e) {
			System.out.println("\n파일이 없습니다.\n");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return this.map;
	}
}
