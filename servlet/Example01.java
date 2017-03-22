package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example01 extends HttpServlet {	// Servlet 파일
	
	/*
	 * Servlet : HttpServlet를 상속받은 java class파일
	 * 서버-파일단위로 생각하기
	 * example01은 계속 살아있어야함 (서버끌때 그때 내려옴)
	 * **** 흐름을 항상 확인하기 ****
	 * 서블릿 만들기 
	 * 오버라이딩 - init() , service(HttpServletRequest request, HttpServletResponse response), destroy()
	 * 
	 */

	// 최초의 접속만 init() 메소드 실행, 그 뒤로는 service()만 실행(서버 끌때까지)
	
	public void init() {
		System.out.println("서블릿 파일 초기화");		// 최초 한번만 실행된다.
	}	
	
	public void service(HttpServletRequest request, HttpServletResponse response) { 	
		System.out.println("서블릿 내용부분");		// 요청시, Thread가 자동으로 생성되어 병행적으로 메소드를 호출한다.
	}
	
	public void destroy() {
		System.out.println("서블릿 파일 소멸 부분");	// 서버를 종료했을 때 메모리에서 파일이 소멸된다.
	}	
	
}
