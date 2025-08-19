package com.site.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StuController {
	@GetMapping("/stu/stuInput")
	public String stuInput() {
		return "stu/stuInput";
	}
	
	@PostMapping("/stu/stuInput")
	public String stuInput(HttpServletRequest requset,
			@RequestParam("sno") int sno,
			@RequestParam("sno") int sno,
			@RequestParam("sno") int sno,
			@RequestParam("sno") int sno,
			@RequestParam("sno") int sno,
			
			
			
			
			)
	
	
}
