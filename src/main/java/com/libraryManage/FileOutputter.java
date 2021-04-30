package com.libraryManage;

import java.io.*;

public class FileOutputter {
	private static String filePath = "./src/main/resources/";
	
	public static void output(String message, String fileName) throws IOException {
		FileWriter out = new FileWriter(filePath + fileName);
		out.write(message);
		out.close();
	}
	
	public static void main(String[] args) throws Exception {
		output("HI HELLO", "book_data.data");
		output("HI HEY", "member_data.data");
		output("HIHI", "library_data.data");
	}
}
