package com.site.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.site.dto.Member;
//<Member,String> : 리턴해줄 객체, 객체 기본 타입이 어떻게 되냐
//select - find(), insert-save(), delete-delete()기본 메소드 정의
//@Repository // 생략가능: 라이브러리를 다운받았기 때문에
public interface MemberRepository extends JpaRepository<Member, String>{
	
	
	// 로그인 확인(id,pw) - select 할때 데이터가 찾아지면 Member 객체 리턴
	// select 할때 데이터가 없으면 Optional
	// select * from member where id = #{id} and pw=#{pw} 와 아래 문구는 같다. sql 쿼리문을 날려줌
	Optional<Member> findByIdAndPw(String id, String pw);

	
	
	//임의로 메소드 이름을 변경할 시
	// 규칙에 어긋난것은 Query 를 직접 넣어서 처리할 수 있다.
	@Query(value = "select * from member where id=? and pw=?",nativeQuery = true)
	Optional<Member> findLogin(String id, String pw);
	
	
	
	
	
}
