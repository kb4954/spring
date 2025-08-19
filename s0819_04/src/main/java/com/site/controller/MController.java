package com.site.controller;

import java.lang.reflect.Member;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.service.MServiceImpl;

@Controller
public class MController {
	@Autowired
	
	@GetMapping("/member/mLisst")
	public String mList(Model model) {
		
		
		Member member = mService.selectOne();
		model.addAttribute("member",member)
		return "member/mView";
		
	}
	@GetMapping("/member/mView")
	public String mView(Model model) {
		//member정보
//		MServiceImpl mServiceImpl = new MServiceImpl();
//		Member member = MServiceImpl.selectOne();
		
		
		//스프링이 객체선언을 대행해서 주입(DI)
		Member member = mService.selectOne();
		model.addAttribute("member",member)
		return "member/mView";
		
	}
	@GetMapping("/member/member")
	public String member() {
		return "member/memberInput";
		
	}
	@PostMapping("/member/member")
	public String member(Member member,
			Model model) {
		mService.insertOne(member);
		return "redirect:/";
	}
		
//			@RequestParam("hobby") String[] hobby,
//			Model model) {
//		System.out.println(Arrays.toString(hobby));
//		model.addAttribute("member",member);
	
	
}
