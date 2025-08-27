package com.site.dto;

import java.sql.Timestamp;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity // jpa table 생성 
public class Member {
	
	@Id // 기본키 설정 - primary key
	 32n
	private String id;
	
	@Column(nullable=false, length = 100)
	private String pw;
	
	@Column(nullable = false,length = 100)
	private String name;
	
	@Column(length = 50)
	private String phone;
	
	@ColumnDefault("'남자'")
	private String gender;
	
	@Column(length = 100)
	private String hobby;
	
	@CreationTimestamp // 시간을 자동입력 - sysdate
	private Timestamp mdate;
	
}
