<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

</head>
<body>
<h1>Board Detail Page</h1>
<!-- serarch 구역 -->



		<table border="1">
	<tr>
		<th>BNO</th>
		<td>${bvo.bno }</td>
	</tr>
	<tr>
		<th>TITLE</th>
		<td>${bvo.title }</td>
	</tr>
	<tr>
		<th>WRITER</th>
		<td>${bvo.writer }</td>
	</tr>
	<tr>
		<th>REG_DATE</th>
		<td>${bvo.regdate }</td>
	</tr>
	<tr>
		<th>MOD_DATE</th>
		<td>${bvo.moddate }</td>
	</tr>
	<tr>
		<th>CONTENT</th>
		<td>${bvo.content }</td>
	</tr>
</table>

<a href="/brd/modify?bno=${bvo.bno }"><button type="button">수정</button></a>
<a href="/brd/remove?bno=${bvo.bno }"><button type="button">삭제</button></a>
<a href="/brd/pageList?bno=${bvo.bno }"><button type="button">리스트로 되돌아가기</button></a>
</body>
</html>