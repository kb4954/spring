package com.site.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private String id; //작성자
	private int bhit;
	//답글달기
	private int bgroup; // 답글달기 그룹핑
	private int bstep; // 답글달기 출력순서
 	private int bindent; // 답글달기 들여쓰기

	private String bfile;
	private Timestamp bdate;
}
