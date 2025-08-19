package com.site.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.dto.Member;

@Controller
public class MController {
	// 회원가입 페이지
	@GetMapping("/member/member")
	public String member() {
		return "member/memberInput";
	}

	// 회원가입 저장
	@PostMapping("/member/member")
	public String member(
			@RequestParam("id",Member.getId()) String id,
			@RequestParam("pw",Member.getpw()) String pw,
			@RequestParam("name",Member.getname()) String id,
			@RequestParam("phone",Member.getphone()) String phone,
			@RequestParam("gender",Member.getgender()) String gender,
			Model model) {
		
		model.addAttribute("member",Member);
		
		
		return "member/memberInput";
	}
}
