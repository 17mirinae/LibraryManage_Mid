package com.libraryManage;

import java.util.*;
import java.io.*;

public class FileInputter {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fileStream = new FileInputStream("./src/main/resources/hello.dat");

		ObjectInputStream objectInputStream = new ObjectInputStream(fileStream);

		Object object = objectInputStream.readObject();

		objectInputStream.close();

		System.out.println("읽어온 객체의 type->" + object.getClass());

		HashMap hashMap = (HashMap) object;

		Iterator<String> it = hashMap.keySet().iterator();

		while (it.hasNext()) { // 맵키가 존재할경우

			String key = it.next(); // 맵키를 꺼냄

			String value = (String) hashMap.get(key); // 키에 해당되는 객체 꺼냄

			System.out.println(key + "->" + value);

		}
	}
}
