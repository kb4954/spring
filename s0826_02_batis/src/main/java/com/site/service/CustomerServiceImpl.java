package com.site.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dao.CustomerMapper;
import com.site.dto.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired CustomerMapper customerMapper;
	@Override
	
	//공지사항 리스트 가져오기
	public Map<String,Object> findAll(int page) {
		int rowPerpage = 10; // 1페이지 10개 게시글 적용
		int countAll = customerMapper.findByCount(); // 게시글 총개수
		int maxpage = (int)Math.ceil((double)countAll/rowPerpage);
		int startpage = (int)((page-1)/10)*10+1;
		int endpage = startpage+10-1;
		// 게시글 갯수 가지고 올때 필요한것
		int startrow = (page-1)*rowPerpage+1;
		int endrow = (startrow-1)+10;
		if(maxpage<endpage) endpage = maxpage;
		 
		//startrow,endrow
		
		List<Customer> list = customerMapper.findAll(startrow,endrow);
		Map<String,Object> map = new HashMap<>();
		map.put("countAll",countAll);
		map.put("maxpage",maxpage);
		map.put("startpage",startpage);
		map.put("endpage",endpage);
		map.put("page",page);
		map.put("list",list);
		
		return map;
	}

}
