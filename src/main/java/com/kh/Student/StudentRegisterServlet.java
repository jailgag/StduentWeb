package com.kh.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// 밑에 보니깐 페이지에서 복붙했는데 주소 쿼리스팅부분이후name부분에 %E...으로 나옴!!! 
//http://localhost:8888/student/register?name=%EC%9D%BC%EC%9A%A9%EC%9E%90&firstScore=88&secondScore=77
//localhost:8888/student/register?name=일용자firstScore=88&secondScore=77
//일용자 바꿔주면 이미존재하는 이름입니다!! 삼용자 입력하면
//학생정보 추가 성공되었습니다 출력!!!
//학원꺼는 출력안된이유가 경로 설정에/ <---슬래시를 빼먹은듯....
@WebServlet("/student/register")
public class StudentRegisterServlet extends HttpServlet{
	//12/2722:44분종료!!다시복습!!
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Student> sList = new ArrayList<Student>(); //
	String name = request.getParameter("name");//
	int firstScore, secondScore;
	firstScore = Integer.parseInt(request.getParameter("firstScore")); //원인및 해결방안은??
	secondScore = Integer.parseInt(request.getParameter("secondScore")); //바꾸는거 연습!!!
	sList.add(new Student("일용자",99,88));
	sList.add(new Student("이용자",88,77));
	name ="일용자";
	RequestDispatcher view; //페이지 이동했을때 썻었던것!!
	response.setContentType("text/html;charset=utf-8"); //한글안깨짐코드!!
	PrintWriter out = response.getWriter(); //임포트하고 위에 한글안깨짐코드써주기!!커플!!!
	for(Student std: sList) {
		if(std.getName().equals(name)) {
			out.println("<h1>이미존재 하는 이름입니다</h1>");  
			return; //메소도를 종료해서 밑에 코드가 안돌아가도록함!!!
		}
	}
	sList.add(new Student(name, firstScore, secondScore));//그게 어니라면!!
	out.println("<h1>학생정보 추가 성공되었습니다.</h1>");
	

	
//	2.
//	RequestDispatcher view; //페이지 이동했을때 썻었던것!!
//	for(Student std: sList) {
//		if(std.getName().equals(name)) {
//			view = request.getRequestDispatcher("/WEB-INF/views/common/duplicate.html"); //목적지!!!!
//			view.forward(request, response);
//			return; //메소도를 종료해서 밑에 코드가 안돌아가도록함!!!
//		}
//	}
//	
//	
//	sList.add(new Student(name, firstScore, secondScore));//그게 어니라면!!
//	view = request.getRequestDispatcher("/WEB-INF/views/common/success.html"); //성공목적지!!
//	view.forward(request, response);

//==============================================================	
	
//  1.여기까지 콘솔로 출력하는방법코드??!!! 잊어버림...복습할때 봐봅시다!
//	for(Student std: sList) {
//		if(std.getName().equals(name)) {
//			System.out.println("이미 존재하는 이름입니다");
//			return; //메소도를 종료해서 밑에 코드가 안돌아가도록함!!!
//		}
//	}
////		System.out.println(std);  //필요없으니지우고!!!
//	System.out.println("=================================");
//	sList.add(new Student(name, firstScore, secondScore));
//	System.out.println("가입이 완료되었습니다");
//	for(Student std: sList)
//		System.out.println(std);  //차이를 확인!!!2개일때와 3개일때콘솔창출력!!항상수정한후에 저장하고 서버올리고 실행할것!!!
//	
//	sList.add(new Student("일용자",99,88));   *이전에 이미존재합니다입력전 출력 코드있음!!
//	sList.add(new Student("이용자",88,77));	복습할때 되돌아보기!!!!
//	for(Student std: sList) //콘솔로 출력하기!!
//	System.out.println(std);
//	System.out.println("이미 존재하는 이름입니다");
//	System.out.println("=====================");
//	
//	sList.add(new Student(name, firstScore, secondScore));
//	System.out.println("가입이 완료되었습니다");
//	for(Student std: sList)
//		System.out.println(std);  //차이를 확인!!!2개일때와 3개일때콘솔창출력!!항상수정한후에 저장하고 서버올리고 실행할것!!!
//	
	}
}
