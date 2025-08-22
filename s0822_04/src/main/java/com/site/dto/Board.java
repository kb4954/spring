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
	private String id;
	private String btitle;
	private String bcontent;
	private int bhit;
	//답글달기
	private int bgroup;
	private int bstep;
	private int bindent;
	
	private String bfile;
	private Timestamp bdate;
	
}
