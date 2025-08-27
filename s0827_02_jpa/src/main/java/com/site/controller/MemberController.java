package com.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.site.dto.Member;
import com.site.service.MemberService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class MemberController {
	
	@Autowired MemberService memberService;
	@Autowired HttpSession session;

	//로그인
	@GetMapping("member/login")
	public String login() {
		return "member/login";
	}
	
	//로그아웃
	@GetMapping("member/logout")
	public String logout(RedirectAttributes redirect) {
		session.invalidate ();
		redirect.addFlashAttribute("flag","-1");
		
		return "redirect:/";
		
	}
	
	//회원가입 페이지 열기
	@GetMapping("/member/insert01")
	public String insert01() {
		return "member/insert01";
		
	}
	//회원가입 페이지 열기
	@GetMapping("/member/insert02")
	public String insert02() {
		return "member/insert02";
		
	}
	
	//ajax - > json데이터 전송 중복 id확인
	@ResponseBody
	@PostMapping("/member/idBtn")
	public Member idBtn(Member m) {
		System.out.println("controller id : "+m.getId());
		Member member  = memberService.findById(m.getId());
		
		
		String flag = "";
		if(member.getId() != null) {
			flag="-1";// 동일아이디가 있음 아이디 사용 불가 
			
		}else {
			flag="1"; //사용가능 아이디
		}
		return member;
		
	}
	
	
	
	
	
	
	
	
	
	@PostMapping("member/login")
	public String login(HttpServletResponse response,
			RedirectAttributes redirect,
			Member m, Model model) {
		String url = ""; // 초기화하고 변수생성
		Member member = memberService.findByIdAndPw(m.getId(),m.getPw());
		if(member.getId()==null) {
			System.out.println("아이디 또는 패스워드가 없습니다. 다시 입력해주세요");
			url= "redirect:/member/login";
		}else {
			System.out.println("로그인 성공.");
			session.setAttribute("session_id", member.getId());
			session.setAttribute("session_name", member.getName());
			redirect.addFlashAttribute("flag","1"); // redirect시 변수전달가능
			url = "redirect:/";
		}
		
		System.out.println("member : "+member);
		model.addAttribute("member",member);

		
		return url;
	}
}








