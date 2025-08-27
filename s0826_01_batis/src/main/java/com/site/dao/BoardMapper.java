package com.site.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.site.dto.Board;

@Mapper
public interface BoardMapper {
	//게시글 전체 가져오기
	List<Board> findAll(@Param("startrow") int startrow, @Param("endrow") int endrow);

	int findByCount();

}
