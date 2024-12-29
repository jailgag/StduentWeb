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

/*
 * 학생정보 삭제
 * url : /student/remove
 */

//여기까지 실습하면  일용자 이름입력하면
//학생의 데이터가 삭제 되었습니다 라고 페이지로 뜨고!!
//일용자1 입력하면 검색한 이름이 존재하지 않습니다라고 뜸!!!
//12/29 16:30분에 service부분만 doGet으로 수정!!!
@WebServlet("/student/remove")
public class StudentRemoveServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("일용자",99,88));
		sList.add(new Student("이용자",88,77));
		sList.add(new Student("삼용자",77,66));
		sList.add(new Student("사용자",66,55));
		//이름이 입력된다고 했을때
		//해당이름이 있으면 지우고 없으면 없다고 메세지를 출력하도록
		//코드를 작성하시오!!
		
		//여기부터 코드는 페이지로 출력하는 방법!!jsp이용!!
		String name = request.getParameter("name");
		String message ="";
		boolean isExist = false;   //<---역할은??시험문제헷갈린거나옴..
		RequestDispatcher view;  
		for(Student std : sList) {
			if(std.getName().equals(name)) {
				sList.remove(std);
				isExist= true;  
				break;
			}
		}
		//데이터가 있으면 isExist는 true가 되고 삭제되었다는 내용이 
		//massage 변수에 담김!!!
		if(isExist) {
			message="학생의 데이터가 삭제되었습니다";
		}else {
			//데이터가 없으면 isExist는 false가 되고 검색한 것이 
			//없다는 내용이 message 변수에 담김!!
			message="검색한 이름이 존재하지 않습니다";
		}
		//request 값이 request에 저장됨!!!!
		request.setAttribute("message", message);
		//해당 jsp로 페이지 이동이 되는데 message 내용도 함께
		//전달되는것으로 볼수 있다!!
		view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
		view.forward(request, response); //3개코드 공식기억하기!!

//		System.out.println("검색한 이름이 존재하지 않습니다");

		
//		2.		
		//이름이 입력된다고 했을때
		//해당이름이 있으면 지우고 없으면 없다고 메세지를 출력하도록
		//코드를 작성해보시오!!!....
		//여기까지 작성하고 localhost:8888/student/remove?name1 
		//하면 콘솔창에 검색한 이름이 존재하지 않습니다 라고 뜸!!
		//localhost:8888/student/remove?일용자 하면
		//일용자 학생의 데이터가 삭제 되었습니다 콘솔창출력!!
//		String name = request.getParameter("name");
//		for(Student std : sList) {
//			if(std.getName().equals(name)) {
//				sList.remove(std);
//				System.out.println(std.getName()+"학생의 데이터가 삭제되었습니다");				
//				return;
//			}
//		}
//		System.out.println("검색한 이름이 존재하지 않습니다");


//		sList.remove(0); // <--이기능이 삭제 코드??
//		for(Student std: sList)
//			System.out.println(std);

		
//		1.콘솔창출력!!!
//		for(Student std: sList)
//			System.out.println(std);
//		System.out.println("========================"); //구분하기위함코드!!
//		sList.remove(0); // <--이기능이 삭제 코드??
//		for(Student std: sList)
//			System.out.println(std);
// 				콘솔창 출력!!
//				Student [name=일용자, firstScore=99, secondScore=88]
//				Student [name=이용자, firstScore=88, secondScore=77]
//				Student [name=삼용자, firstScore=77, secondScore=66]
//				Student [name=사용자, firstScore=66, secondScore=55]
//				========================
//				Student [name=이용자, firstScore=88, secondScore=77]
//				Student [name=삼용자, firstScore=77, secondScore=66]
//				Student [name=사용자, firstScore=66, secondScore=55]
		}
	
}
