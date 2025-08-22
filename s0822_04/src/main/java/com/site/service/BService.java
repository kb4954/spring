package com.site.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.site.dto.Board;

@Service
public interface BService {
	//게시판 리스트 
	List<Board> findAll();
	
	
	//글쓰기 저장
	void save(Board b);

}
