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
	private String id;
	
	// 답글달기
	private int bgroup;
	private int bstep;
	private int bindent;
	
	// 게시판에 필요한것
	private int bhit;
	private String bfile;
	private Timestamp bdate;
}
