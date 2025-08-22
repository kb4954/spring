package com.site.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.site.dto.Board;

@Service
public interface BService {
	//리스트 전체 불러오기
	List<Board> selectAll();
	//리스트 한개 불러오기
	Board findByBno(int bno);
	
	//게시글 저장
	void save(Board board);

}
