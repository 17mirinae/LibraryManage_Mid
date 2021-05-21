package com.libraryManage.Controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signIn")
	public String signIn() {
		return "signIn";
	}
	
	@GetMapping("/signUp")
	public String signUp() {
		return "signUp";
	}
}