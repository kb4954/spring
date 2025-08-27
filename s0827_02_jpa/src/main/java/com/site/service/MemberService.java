package com.site.service;

import org.springframework.stereotype.Service;

import com.site.dto.Member;

@Service
public interface MemberService {


	Member findByIdAndPw(String id, String pw);

	Member findById(String id);

}
