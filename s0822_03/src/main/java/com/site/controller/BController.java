package com.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.dto.Board;
import com.site.service.BService;

@Controller
public class BController {

    private final FController FController;
	@Autowired BService bService;

    BController(FController FController) {
        this.FController = FController;
    }
	
	@GetMapping("/bList")
	public String bList(Model model) {
		List<Board> list = bService.findAll();
		System.out.println("게시글 개수 : "+list.size());
		model.addAttribute("list",list);
		
		return "bList";
	}
	
	//게시글 상세보기
	@GetMapping("/bView")
	public String bView(Board b, Model model) {
		
		//데이터가 없는데 꺼내면 에러남 
		int bno = b.getBno(); // 데이터 하나를 뽑기
		Board board = bService.findByBno(bno);
		model.addAttribute("board",board);
		
		return "bView";
	}
	// 게시글 글쓰기 화면
	@GetMapping("/bWrite")
	public String bWrite() {

		return "bWrite";
	}
	//게시글 글쓰기 저장
	@PostMapping("/bWrite")
	public String bWrite(Board b,Model model) {
		System.out.println("제목 : "+b.getBtitle());
		System.out.println("아이디 : "+b.getId());
		System.out.println("내용 : "+b.getBcontent());
		System.out.println("파일이미지 : "+b.getBfile());
		//리턴없음 매개변수 Board 전송
		bService.save(b);
		
		
		
		return "redirect:/bList?flag=1";
	}
	
	//게시글 삭제
	@GetMapping("/bDelete")
	public String bDelete(
			@RequestParam(name="bno",defaultValue ="0") int bno) {
		System.out.println("bno: "+bno);
		
		//리턴 없음, 매개변수 : bno
		bService.delete(bno);
		return "redirect:/bList?flag=2"; // flag=2 : 삭제
	}
	
	
	
	
}
