package com.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller // 객체선언자동으로 진행
public class FrontController {
//	@RequestMapping() - get방식, post방식
//	@PostMapping() - post 방식
//	@GetMapping() - url 주소 확인해서 해당되는 형태로 이동해서 실행
	
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
	public String requestMethodName(@RequestParam String param) {
		return new String();
	}
	
	 public String index() {
		 return "index"; // /WEB-INF/views / index.jsp
	 }
}
