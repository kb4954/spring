package com.site.service;

import org.springframework.stereotype.Service;

import com.site.dto.Member;

@Service

public interface MemberService {
	//id가 존재하는지 확인
	Member findById(String id);
	// 로그인 확인 (id,pw)
	Member findByIdAndPw(String id, String pw);
	
	// 임의로 메소드 이름 변경시
	Member findLogin(String id, String pw);

	
	
}
