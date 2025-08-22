package com.site.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.site.dto.Board;

@Service
public interface BService {
	// 게시판 전체 출력
	List<Board> findAll();
	// 게시글 저장
	void save(Board b);
	
	
	//게시글 보기
	Board findByBno(int bno);
	
	
	//게시글 삭제
	void delete(int bno);

}
