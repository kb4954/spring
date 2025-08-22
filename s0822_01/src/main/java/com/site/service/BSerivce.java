package com.site.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.site.dto.Board;

@Service
public interface BSerivce {
	
	
	// 게시판 리스트
	List<Board> findAll();
	// 게시글 1개 
	Board findByBno(int bno);

}
