package com.libraryManage.Controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/user_login")
	public String user_login() {
		return "user_login";
	}
	
	@GetMapping("/user_register")
	public String user_register() {
		return "user_register";
	}
	
	@GetMapping("/user_forgotPwd")
	public String user_forgotPwd() {
		return "user_forgotPwd";
	}
}