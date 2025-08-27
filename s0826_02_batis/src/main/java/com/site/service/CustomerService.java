package com.site.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.site.dto.Customer;

@Service
public interface CustomerService {
	
	
	// 공지사항 모두 가져오기


	Map<String, Object> findAll(int page);

}
