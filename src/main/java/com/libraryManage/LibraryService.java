package com.libraryManage;

import java.util.*;
import org.springframework.beans.factory.annotation.*;

public class LibraryService {
	Scanner sc = new Scanner(System.in);
	
	private LibraryDAO libDAO;
	
	@Autowired
	public LibraryService(LibraryDAO _libDAO) {
		this.libDAO = _libDAO;
	}
}
