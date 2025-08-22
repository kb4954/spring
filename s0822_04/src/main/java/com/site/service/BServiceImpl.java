package com.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dao.BoardMapper;
import com.site.dto.Board;

@Service
public class BServiceImpl implements BService {
	
	@Autowired BoardMapper boardMapper;
	//게시판 리스트 
	@Override
	public List<Board> findAll() {
		List<Board> list = boardMapper.findAll();
		
		return list;
	}
	
	//글쓰기 저장
	@Override
	public void save(Board b) {
		boardMapper.save(b);
	}

}
