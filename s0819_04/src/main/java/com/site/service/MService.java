package com.site.service;

import java.lang.reflect.Member;
import java.util.List;

public interface MService {
	// 회원정보 1개 
	Member selectOne();
	// 회원정보 여러개 
	List<Member> selectAll();
	
}
