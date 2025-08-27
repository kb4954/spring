package com.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Http;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.dto.Member;
import com.site.service.MemberService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	
	@Autowired MemberService memberService;
	@Autowired HttpSession session;
	
	
	@GetMapping("/member/login")
	public String login(){
		return "member/login";
	}
	
	
	
	
	
//	 로그인 전송
	@PostMapping("/member/login") 
	public String login(HttpServletResponse response, Member m, Model model) {
		String url = "";
//		@RequestParam(name="id",required = false,defaultValue = "1") int id, // 다른방법으로 또 받는 방법 
//		@RequestParam(name="id",required = false) int id, // 형변환 할때 에러남 
		System.out.println("id : "+m.getId());
		System.out.println("pw : "+m.getPw());
//		 pw, id가 있는지 확인 - findByIdAndPw()
		Member member = memberService.findByIdAndPw(m.getId(),m.getPw());
		if(member.getId()==null) {
			System.out.println("아이디 또는 패스워드가 없습니다. 다시 입력해주세요");
			url = "/member/login";
		}else {
			System.out.println("로그인 성공");
			url = "redirect:/?flag=1";
		}
		
		
		
		System.out.println("member : "+member);
		model.addAttribute("member",member);
		
		
//		id가 있는지 확인
//		Member member = memberService.findById(m.getId());
//		메소드 이름을 임의로 변경 
//		Member member = memberService.findLogin(m.getId(),m.getPw());
		return url;
	}
	
}
