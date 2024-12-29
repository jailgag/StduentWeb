package com.kh.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student/insert")
public class StudentInsertServlet extends HttpServlet {
	//일용자 이용자 입력하면 
	//이미존재하는 이름입니다!!뜸!!
	//다른이름 입력하면 존재하지 않습니다 뜸!!!여긴이상없음!!!
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Student> sList = new ArrayList<Student>();
	sList.add(new Student("일용자",99,88));
	sList.add(new Student("이용자",88,77));
    String name= request.getParameter("name");
	String message ="";
	boolean duplicate = false;  //<--이코드 역할은???
	for(Student std: sList) {
		if(std.getName().equals(name)) {
		message ="이미 존재하는 이름입니다";
		//이미존재
		//페이지 생성 + 변수에 넣은 값을 출력!!!! jsp로 가능!!
		request.setAttribute("message", message);
		RequestDispatcher view;
		view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
		view.forward(request, response);
		return;
		}
	}
	message ="존재하지 않습니다";
	request.setAttribute("message", message);
	RequestDispatcher view; //이부분은 복붙!!
	view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
	view.forward(request, response); //
}
}

	//2!!
//삼용자 입력하면 null이라고 나옴..이유는?? 
//맨밑코드에 request.setAttribute("message", message); 입력누락!!
//String name= request.getParameter("name");
//String message ="";
//for(Student std: sList) {
//	if(std.getName().equals(name)) {
//		message ="이미 존재하는 이름입니다";
//		//이미존재
//		//페이지 생성 + 변수에 넣은 값을 출력!!!! jsp로 가능!!
//		request.setAttribute("message", message);
//		RequestDispatcher view;
//		view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
//		view.forward(request, response);
//		return;
//	}
//}
//message ="존재하지 않습니다";
//request.setAttribute("message", message);
//RequestDispatcher view; //이부분은 복붙!!
//view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
//view.forward(request, response); //
//}
//}


//		1.페이지 출력 jsp로 출력!!근데 색깔안바뀜..원인은??? 웹페이지regi..로설정!!!
//		String name="일용자";
//		for(Student std: sList) {
//			if(std.getName().equals(name)) {
//				RequestDispatcher view;
//				view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
//				view.forward(request, response);
//				return;