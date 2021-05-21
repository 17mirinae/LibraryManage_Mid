package com.libraryManage.Controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {
	@GetMapping("/signUpProcess")
	public String signUpProcess() {
		return "signUpSuccess";
	}
}
