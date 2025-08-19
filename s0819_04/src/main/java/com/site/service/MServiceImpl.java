package com.site.service;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MServiceImpl extends MService {
	//member정보가 있음
	
	//변수 : 클래스변수, 인스턴스, 지역
	// 매서드 : 클래스베서드, 인스턴스 메서드
	public Member selectOne() {
		// member  정보가 있음
		firstMethod();
		
		Member member = new Member("bbb","2222","유관순","010--2222","여자","게임","수영");
		return member;
	}
	public List<Member> selectAll(){
		List<Member> list = new ArrayList<>();
		list.add(new Member("1111","홍길동","010-1111-1111","남자","게임,골프"));
		list.add(new Member("bbb","2222","유관순","010-2222-2222","여자","게임,수영"));
		list.add(new Member("ccc","3333","김구","010-3333-3333","남자","독서,수영"));
		
		return list;
	}
	@Override
	private void () {
		// TODO Auto-generated method stub

	}
	
		
		
		
}
