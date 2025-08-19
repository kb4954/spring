package com.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//@RestController - 데이터로 전달
@Controller
public class MemberController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	


}
