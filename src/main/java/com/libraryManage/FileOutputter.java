package com.libraryManage;

import java.io.*;
import java.util.*;

public class FileOutputter {
	private static String filePath = "./src/main/resources/hello.dat";

	public static void main(String[] args) throws IOException {
		FileOutputStream fileStream = new FileOutputStream(filePath);

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileStream);

		HashMap userInfoMap = new HashMap();
		userInfoMap.put("TEL", "02-324-2424");
		userInfoMap.put("phone", "010-9999-9999");
		userInfoMap.put("address", "서울서 서추구 방배동 34244");
		userInfoMap.put("age", "43");
		userInfoMap.put("bitrhday", "19330101");

		objectOutputStream.writeObject(userInfoMap);

		objectOutputStream.close();

	}
}
