package com.site.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.site.dto.Member;
import com.site.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired MemberService memberService;
	
	//로그인 페이지 열기
	@GetMapping("/member/login")
	public String login() {
		return "member/login";
	}
	
	//로그인 전송
	@PostMapping("/member/login")
	public String login(Member m, Model model) {
		String id = m.getId();
		
		System.out.println("id: "+id);
		Member member = memberService.findByIdAndPw(m);
		if(member.getId() != null) {
			System.out.println("로그인되었습니다.");
		}else {
			System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
		}
		return "member/login";
	}
}
