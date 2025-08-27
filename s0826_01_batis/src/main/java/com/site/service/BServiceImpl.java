package com.site.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dao.BoardMapper;
import com.site.dto.Board;

@Service
public class BServiceImpl implements BService {
	@Autowired BoardMapper boardMapper;

	@Override
	public Map<String,Object> findAll(int page) {
		// 하단 넘버링 
		// 1. 게시글 개수  2. maxpage
		int rowPerpage = 10; // 한페이지당 게시글 수 
		int countAll = boardMapper.findByCount();
		int maxpage =(int)Math.ceil((double)countAll/rowPerpage); // 나눠서 남은 소수점을 올림 해줘야함, 둘다 int일땐 소수점이 안나와서 하나는 double타입으로 바꿔줘야함
		// 올림자체선언 타입이 double이라서  ceil 타입을 int로 바꿔줌
		int startpage=((int)(page-1)/10)*10+1;
		int endpage = startpage+10-1;
		if(maxpage<endpage) endpage = maxpage;
		
		
		// 페이지 리스트에 출력할 게시글 개수 가져오기
		int startrow = (page-1)*rowPerpage+1;
		int endrow = (startrow-1)+10;
		
		List<Board> list = boardMapper.findAll(startrow,endrow);
		Map<String,Object> map = new HashMap<>();
		map.put("list", list);
		map.put("countAll", countAll);
		map.put("maxpage", maxpage);
		map.put("startpage", startpage);
		map.put("rowPerpage", rowPerpage);
		map.put("endpage", endpage);
		System.out.println("countAll 개수 :"+countAll);
		return map;
	}
	// page Method를 생성해서 리턴 받아도 됨.
//	public Map<String, Object> pageMethod(){
//		return "";
//	}

}
