package com.libraryManage;

import java.io.*;

public class FileOutputter {
	private static String filePath = "./src/main/java/com/libraryManage/";
	
	public static void output(String message, String fileName) throws IOException {
		FileWriter out = new FileWriter(filePath + fileName);
		out.write(message);
		out.close();
	}
	
	public static void main(String[] args) throws Exception {
		output("HI HELLO", "book_data.txt");
	}
}
