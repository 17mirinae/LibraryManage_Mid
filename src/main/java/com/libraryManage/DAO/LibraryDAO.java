package com.libraryManage.DAO;

import java.util.*;
import com.libraryManage.DTO.*;

import java.io.*;

public class LibraryDAO {
	private Map<String, LibraryDTO> map = new HashMap<>();
	private String filePath = "./src/main/resources/library_data.dat";

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

	public Map<String, LibraryDTO> importFromFile() {
		try {
			FileInputStream fileStream = new FileInputStream(filePath);
			ObjectInputStream objInputStream = new ObjectInputStream(fileStream);

			HashMap<String, LibraryDTO> objFromFile = (HashMap<String, LibraryDTO>) objInputStream.readObject();
			objInputStream.close();

			this.map = objFromFile;

			Iterator<String> it = map.keySet().iterator();

			while (it.hasNext()) { // 맵 키가 존재할 경우
				String key = it.next();
				LibraryDTO value = (LibraryDTO) map.get(key); // 키에 해당되는 객체 꺼내옴
				// System.out.println(key + "-> " + value.getMemPwd());
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
