<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>입력결과 숫자</title>
	</head>
	<body>
	<h2>입력결과</h2>
	<table>
		<tr>
			<th>번호</th>
			<td>${sno}</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>${name}</td>
		</tr>
		<tr>
			<th>국어</th>
			<td>${kor}</td>
		</tr>
		<tr>
			<th>영어</th>
			<td>${eng}</td>
		</tr>
		<tr>
			<th>수학</th>
			<td>${math}</td>
		</tr>
		<tr>
			<th colspan="2"><a href="/">메인페이지 이동</a></th>
		</tr>
	</table>
	
	</body>
</html>