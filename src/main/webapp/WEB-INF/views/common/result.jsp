<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이름 중복 안내</title>
<style>
	h1 {
		color: red;
	}
</style>
<%
	//1. 꺽쇠 퍼센트는 스크립틀릿이라고 해서 jsp 에서 자바코드를 작성하게 해줌
	// 원래 jsp는 실행될때 servlet으로 변환되어 실행된다 사실상 서블릿임!!!
	//*****그래서 HTML 기반의 파일이지만 자바코드를 쓸수 있는 특징을 가짐
	//2.서블릿의 경우에는 어떨까??
	//서블릿의 경우엔 PrintWriter를 통해서 웹페이지 태그를 출력할수 있었음
	//******jsp와 비교했을때 자바기반의 파일이지만 HTML 코드를 쓸수 있는 
	//특징을 가짐
	//3.jsp사용이유는
	//-쟈바코드와 HTML 코드를 분리할수 있음
	//  --> 지금의 result.jsp는 자바 + HTML코드가 같이 있는것이지만 지금 하려는
	// 것이 자바코드와 HTML 코드를 분리하려는 것임!!
	//- servlet과 같은 객채를 공유 할수 있어서 백엔드 단에서 넘어온 데이터를
	// 출력할수 있다!!
	// 3. MVC Model 1, 2 설명!!!
	// - 지금처럼 jsp에 자바코드와 html 코드가 함꼐 있는 방식으로 코딩하는것을
	// model 1 방식이라할수 있다.
	//- 쓰면 안되는건 아니지만 옛날 방식이며 공동 작업시 유지보수가 힘들다는 단점이
	//있어 안쓰는 방식!!!
	//- 혼자서 개발할땐 편리한 부분이 있음, 코드가 한눈에 보이기 때문에 헷갈일 일이 줄어듬
	//-백엔드 프로그래밍(서버 프로그래밍) 부분은 servlet에서 하고 
	//-servlet에서 처리한 데이터를 jsp에서 출력하도록 콘트롤러, 모델 뷰로 나누는
	//방식을 model 2방식이라함!!!!!
	//그래서 지금 그방식대로 코드를 수정해볼것임!!!!! 우선 스크립틀릿??은 삭제후
	//EL 을 사용하여 데이터를 받아온다
	// 아주쉽다!!!????
	
	
	String message = (String)request.getAttribute("message");
%>
</head>
<body>
<!-- 꺽쇠 퍼센트는 아쿼르 기호?? 옆에 변수명대신 getAttribute할때 전달했던
키 값을 달러 안에 적어주면됨 -->
	<h1><%=message %> </h1>
</body>
</html>