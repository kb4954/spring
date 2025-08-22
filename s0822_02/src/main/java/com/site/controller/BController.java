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
	// 게시글 상세보기
	@GetMapping("/board/bView")
	public String bView(Board b, Model model) {
		
		int bno = b.getBno();
		Board board = bService.findByBno(bno);
		model.addAttribute("board",board);
		
		return "bView";
	}
	
	
	
	
	
	//글쓰기
	@GetMapping("/board/bWrite")
	public String bWrite(Model model) {
		return "bWrite";
	}
	
	
	//글쓰기 저장
	@PostMapping("/board/bWrite") 
	public String bWrite(Board board,Model model) {
		System.out.println("제목 : "+board.getBtitle());
		System.out.println("내용 : "+board.getBcontent());
		System.out.println("작성자 : "+board.getId());
		System.out.println("첨부파일 : "+board.getBfile());
		
		bService.save(board);
		return "redirect:/board/bList?flag=1";
		
		
	}
	
	//게시판 리스트
	@GetMapping("/board/bList")
	public String bList(
			@RequestParam(name="flag",defaultValue = "0") String flag,
			Model model) {
		List<Board> list = bService.selectAll(); 
		model.addAttribute("list",list);
		model.addAttribute("flag",flag);
		return "bList";
	}
}
