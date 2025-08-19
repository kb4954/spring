package com.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BController {
		@GetMapping("/board/blist/{page}")
		public String blist(@PathVariable(value="page", required=false) int page, Model model) {
			System.out.println("page : "+page);
			model.addAttribute("page",page);
			return "board/blist";
		}
		@GetMapping("/board/board")
		public String borad(@RequestParam(name="page", defaultValue="1") int page, Model model) {
			System.out.println("pageParam : "+page);
			model.addAttribute("pageparam",page);
			return "board/blist";

			
			
		
		}
}
