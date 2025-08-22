package com.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dao.BoardMapper;
import com.site.dto.Board;

@Service
public class BServiceImpl implements BService {

	@Autowired BoardMapper boardMapper;
	//게시판 전체 출력
	@Override
	public List<Board> findAll() {
		List<Board> list = boardMapper.findAll();
		
		return list;
	}
	
	//게시글 저장 리턴없음.
	@Override
	public void save(Board b) {
		boardMapper.save(b);
	}
	//게시글 보기

	@Override
	public Board findByBno(int bno) {
		Board board = boardMapper.findByBno(bno);
		return board;
	}
	//게시글 삭제 리턴없음
	@Override
	public void delete(int bno) {
		boardMapper.delete(bno);
		
	}


}
