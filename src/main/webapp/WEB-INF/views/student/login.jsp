<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생로그인</title>
</head>
<body>
	<h1>학생 로그인</h1>
	<form action="/student/login" method="post"> <!-- post방식!! -->
	ID	<input type="text" method="studnetId"> <br>
	PW	<input type="passward" methode="studentId"> <br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>