package com.libraryManage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class MemberDAO {
	// private static long nextId = 0;
	private Map<String, Member> map = new HashMap<>();
	private String filePath = "./src/main/resources/member_data.dat";

	public Member selectByEmail(String email) {
		return map.get(email);
	}

	public void insert(Member member) {
		// member.setMemId(++nextId);
		map.put(member.getMemEmail(), member);
		exportToFile();
		importFromFile();
	}

	public void update(Member member) {
		map.put(member.getMemEmail(), member);
	}

	public void delete(Member member) {
		map.remove(member.getMemEmail(), member);
	}

	public Collection<Member> selectAll() {
		return map.values();
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
				System.out.println(key + "-> " + value.getMemName());
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
