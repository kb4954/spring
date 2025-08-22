package com.site.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.site.dto.Board;

@Mapper
public interface BoardMapper {
	//게시글 리스트 
	List<Board> findAll();
	
	
	//글쓰기저장
	void save(Board b);

}
