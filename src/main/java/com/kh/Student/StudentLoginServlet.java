package com.kh.Student;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * url: /student/login
 */
// 이거 페이지로 출력해서 로그인 입력하니 null값나옴...
//내가잘못입력했나....
@WebServlet("/student/login")
public class StudentLoginServlet extends HttpServlet {
	//doGet, doPost 메소드로 get요청과 post요청을 하나의 서블릿에서 처리가능하다
	// ->StudentLoginViewServlet.java가 필요없음....????
	
	//doGet은 StudentLoginViewServlet역할??
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//브라우저 주소표시쥴에 http://localhost:8888/student/login입력
		//엔터를 쳐서 서버에 요청하는것은 get방식요청(기본값??))
		//여기서 로그인창이랑은 뜨는데 일용자입력 패스워드 입력할때 ****로안보이고
		//그대로 비밀번호 노출되는것을 확인함!!!
		RequestDispatcher view;
		view = request.getRequestDispatcher("/WEB-INF/views/student/login.jsp");
		view.forward(request, response);
	}
	
	
	// doPost는 student LoginServlet역할???
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form태그를 사용하고 method에 post를 적어서 요청을 하면 post방식요청임
		//현재post 방식은 form태그로만 가능!!!
		
		String studentId, studentPw;
		studentId = request.getParameter("studentId");
		studentPw = request.getParameter("studentPw");
		String message ="";
		if("admin".equals(studentId)&& "admin".equals(studentPw)) {
			message ="관리자님 환영합니다";
		}else {
			message="일반사용자님 환영합니다";
		}
		request.setAttribute("messge", message);
		RequestDispatcher view;
		view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");//목적지!!
		view.forward(request, response);
	}

	
	
	
	
	
//  1번방법!!!!다시 테스트 해야함!!!!
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String studentId, studentPw; 
//		studentId= request.getParameter("studentId");
//		studentPw= request.getParameter("studentPw");
//		String message="";
//		if("admin".equals(studentId)&& "admin".equals(studentPw)) {
//			message="관리자님 환영합니다";
//		}else {
//			message="일반사용자님 환영합니다";
//		}
//		request.setAttribute("message", message);
//		RequestDispatcher view;
//		view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp"); //목적지!!!
//		view.forward(request, response);
//		
//		
//		
//		
	}
//}  갈호 조심!!!!!
