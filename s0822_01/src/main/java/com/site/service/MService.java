package com.site.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.site.dto.Member;

@Service
public interface MService {

	Member findByIdAndPw(String id, String pw);


	List<Member> findAll();

	Member findAndId(String id);

}