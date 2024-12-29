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

@WebServlet("/student/loginView")
public class StudentLoginViewServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher view;
		view=request.getRequestDispatcher("/WEB-INF/views/student/login.jsp");
		view.forward(request, response);
	}
}
