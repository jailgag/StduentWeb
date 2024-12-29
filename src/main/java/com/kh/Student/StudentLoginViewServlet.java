package com.kh.Student;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * url: /student/loginView
 */
//24/12/29 16:32분 service부분을 doGet으로 수정함!!!
@WebServlet("/student/loginView")
public class StudentLoginViewServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher view;
		view=request.getRequestDispatcher("/WEB-INF/views/student/login.jsp");
		view.forward(request, response);
	}
}
