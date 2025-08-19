package com.site.service;

import java.lang.reflect.Member;

import org.springframework.stereotype.Service;

@Service
public class MServiceImpl2 extends MService {
	//member정보가 있음
	
	//변수 : 클래스변수, 인스턴스, 지역
	// 매서드 : 클래스베서드, 인스턴스 메서드
	public Member selectOne() {
		Member member = new Member("aaa","1111","홍길동","010-1111-1111","남자","게임","골프");
		return member;
		}
	}
