package com.kh.Student;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 관리 페이지 보여줄 url
 * url : /student/manage
 */
// 밑에 student/manage입력하면 페이지에 삭제 뜨고 거기에 이름입력하면
//삭제되었습니다/ 없는이름입력하면 검색한이름이 존재하지않습니다 뜸!!!
@WebServlet("/student/manage")
public class ManageViewServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view;
		view = request.getRequestDispatcher("/WEB-INF/views/student/manage.jsp"); //목적지 
		view.forward(request, response);
		
	}
	
}
