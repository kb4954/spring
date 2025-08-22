package com.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.dto.Board;
import com.site.service.BSerivce;

@Controller
public class BController {
	
	@Autowired BSerivce bSerivce;
	//게시글 전체보기
	@GetMapping("/board/bList")
	public String bList(Model model) {
		
		//게시글 여러개 List. 1개 - board
		List<Board> list = bSerivce.findAll();
		model.addAttribute("list",list);
		
		
		return "board/bList";
	}
	
	// 게시글 상세보기
	@GetMapping({"/board/bView","/board/bView/{bno}"})
	public String bView(
//			@PathVariable(name="bno",required = false) int no,
//			@RequestParam(name="bno",defaultValue = "1") int bno, 
			Board board,Model model) {
		int bno = board.getBno();
		System.out.println("게시글 번호 : "+bno);
		//게시글 1개 - board 객체
		Board b = bSerivce.findByBno(bno);
		model.addAttribute("board",b);
		return "board/bView";
	}
	
	
	
	
	
	
	
}
