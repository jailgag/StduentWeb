package com.kh.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 학생 리스트 조회
 * url:  /student/list
 */
//드디어첫 스타트!!ㅎㅎ
@WebServlet("/student/list")
public class StudentListServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> sList = new ArrayList<Student>(); //자동으로 임포트됨??
		sList.add(new Student("일용자",99,88));
		sList.add(new Student("이용자",88,77));
		sList.add(new Student("삼용자",77,66));
		sList.add(new Student("사용자",66,55));
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>학생 리스트 조회</h1>");
		for(int i = 0; i < sList.size(); i++) {
			String name = sList.get(i).getName();
			int fScore = sList.get(i).getFirstScore();
			int sScore = sList.get(i).getSecondScore();
			out.println("<ul><li>학생 이름 : "+name+"</li>"); //
			out.println("<li>1차점수 : "+fScore+" 점 </li>"); //       
			out.println("<li>2차점수 : "+sScore+" 점</li></ul>"); // 
		}
//		//3.for문으로 만들면 전체 학생리스트 일용자~사용자까지 나옴!!!
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
//		for(int i = 0; i < sList.size(); i++) {
//			String name = sList.get(i).getName();
//			int fScore = sList.get(i).getFirstScore();
//			int sScore = sList.get(i).getSecondScore();
//			out.println("<h1>학생 리스트 조회</h1>");
//			out.println("<ul><li>학생 이름 : "+name+"</li>"); //
//			out.println("<li>1차점수 : "+fScore+" 점 </li>"); //       
//			out.println("<li>2차점수 : "+sScore+" 점</li></ul>"); // 
//			
//		}
		
		
//		2.점수까지 출력 !위는 for문으로 만들기!!!
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
//		String name = sList.get(0).getName();
//		int fScore = sList.get(0).getFirstScore();
//		int sScore = sList.get(0).getSecondScore();
//		out.println("<h1>학생 리스트 조회</h1>");
//		out.println("<ul><li>학생 이름 : "+name+"</li>"); //
//		out.println("<li>1차점수 : "+fScore+" 점 </li>"); //       
//		out.println("<li>2차점수 : "+sScore+" 점</li></ul>"); // 

		

//**1번페이지 출력하면 힉생이름: 만나오고 위 코드 작성하면 일용자 99점!~~!!!		
//		out.println("<h1>학생 리스트 조회</h1>");
//		out.println("<ul><li>학생 이름 : </li>"); //
//		out.println("<li>1차점수 :  </li>"); //       
//		out.println("<li>2차점수 :  </li></ul>"); // 
		
		
		
		
//		for(Student std: sList) {
//			System.out.println(std.toString()); //콘솔창실행!!!
//		}
	}
}
