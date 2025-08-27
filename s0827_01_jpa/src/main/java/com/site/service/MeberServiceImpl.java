package com.site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dto.Member;
import com.site.repository.MemberRepository;

@Service
public class MeberServiceImpl implements MemberService {
	// id가 존재하는지 확인
	@Autowired MemberRepository memberRepository;
	
	@Override
	public Member findById(String id) {
		Member member = memberRepository.findById(id).orElseGet(
				()-> {return new Member();}
				); 
				// *******중요***********
				// findById가 이미 스프링내에 만들어져 있어서 repository에 생성하지 않아도 에러가 발생하지 않음
				// 기본으로 생성되어있는것 : findAll() - 예외처리가 없음 리턴타입이 List라서 , findById() - 에외처리 필요
				// 뒤에 .get() : 데이터를 검색하지 못했을 시 에러가 발생하고 시스템 다운될 수 있음. 즉 에러처리 없이 진행, 에러가 절대 없다고 생각할때 
				// orElseGet() : 에러 발생시 빈객체를 생성해서 전달 ()-> {return new Member();}
				// orElseThrow(): 예외 처리를 해서 예외코드를 통해 다른페이지로 리턴함 ()-> {return new IllegalArgumentException();}
				
		return member;
	}
	
	// 로그인 확인
	@Override
	public Member findByIdAndPw(String id, String pw) {
		Member member = memberRepository.findByIdAndPw(id,pw).orElseGet(
				()-> {return new Member();}
				);
		
		return member;
	}
	// 임의로 메소드 이름 변경 시 
	@Override
	public Member findLogin(String id, String pw) {
		Member member = memberRepository.findLogin(id,pw).get();
		
		return member;
	}

}
