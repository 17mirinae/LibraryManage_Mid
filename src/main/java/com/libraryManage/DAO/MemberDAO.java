package com.libraryManage.DAO;

import java.io.*;
import java.util.*;
import com.libraryManage.DTO.*;

public class MemberDAO {
	private Map<String, MemberDTO> map = new HashMap<>();
	private String filePath = "./src/main/resources/member_data.dat";

	public MemberDTO selectByEmail(String email) {
		importFromFile();
		return map.get(email);
	}

	public void printBookList(MemberDTO member) {
		System.out.println("\n-----대여한 도서-----");
		List<BookDTO> bookList = member.getMemBook();
		
		for(BookDTO book : bookList) {
			System.out.println(book.toString());
		}
	}

	public void insertMem(MemberDTO member) {
		importFromFile();
		map.put(member.getMemEmail(), member);
		exportToFile();
	}

	public void updateMem(MemberDTO member) {
		importFromFile();
		map.replace(member.getMemEmail(), member);
		exportToFile();
	}

	public void deleteMem(MemberDTO member) {
		importFromFile();
		map.remove(member.getMemEmail());
		exportToFile();
	}

	public void showAll() {
		System.out.println("사용자 이메일\t\t사용자 비밀번호\t\t사용자 이름\t\t사용자 연락처\t\t사용자 주소\t\t사용자 등록시간");
		System.out.println("---------------------------------------------------------------------------------------");

		for (Map.Entry<String, MemberDTO> element : map.entrySet()) {
			MemberDTO valueFromMap = element.getValue();
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

	public Map<String, MemberDTO> importFromFile() {
		try {
			FileInputStream fileStream = new FileInputStream(filePath);
			ObjectInputStream objInputStream = new ObjectInputStream(fileStream);

			HashMap<String, MemberDTO> objFromFile = (HashMap<String, MemberDTO>) objInputStream.readObject();
			objInputStream.close();

			this.map = objFromFile;

			Iterator<String> it = map.keySet().iterator();

			while (it.hasNext()) { // 맵 키가 존재할 경우
				String key = it.next();
				MemberDTO value = (MemberDTO) map.get(key); // 키에 해당되는 객체 꺼내옴
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
