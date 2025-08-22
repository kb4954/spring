package com.site.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.site.dto.Board;

@Mapper
public interface BoardMapper {
	//게시글 전체 가져오기 
	List<Board> selectAll();

	
	//게시글 상세보기
	Board findByBno(int bno);

	// 게시글 저장
	void save(Board board);

}
