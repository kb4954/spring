package com.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dao.BoardMapper;
import com.site.dto.Board;

@Service
public class BServiceImpl implements BService {
	@Autowired BoardMapper boardMapper;
	@Override
	public List<Board> selectAll() {
		
		
		List<Board> list = boardMapper.selectAll();
		return list;
	}
	

	//게시글 상세보기
	@Override
	public Board findByBno(int bno) {
		Board board = boardMapper.findByBno(bno);
		return board;
	}


	@Override
	public void save(Board board) {
		boardMapper.save(board);
	}

}
