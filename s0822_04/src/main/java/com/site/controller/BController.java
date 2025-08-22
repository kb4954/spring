package com.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.site.dto.Board;
import com.site.service.BService;

@Controller
public class BController {
	
	@Autowired BService bService;
	//게시글 리스트 
	@GetMapping("/bList")
	public String bList(Model model) {
		System.out.println("list");
		List<Board> list = bService.findAll();
		model.addAttribute("list",list);
		return "bList";
	}
	
	//게시글 글쓰기 화면보여주기
	@GetMapping("/bWrite")
	public String bWrite() {
		return "bWrite";
	}
	
	//게시글 글쓰기 저장
	@PostMapping("/bWrite")
	public String bWrite(Board b,Model model) {
		System.out.println("제목: "+b.getBtitle());
		System.out.println("작성자: "+b.getId());
		System.out.println("내용: "+b.getBcontent());
		System.out.println("파일이미지: "+b.getBfile());
		
		//글쓰기 저장 보내기
		// board가 매개변수 b인데 그냥 객체 전체를 데이터로 보냄
		bService.save(b);
		
		
		return "redirect:/bList?flag=1";
	}
	
	
	@GetMapping("/bDelate")
	
	
	
}
