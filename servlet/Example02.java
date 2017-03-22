package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example02 extends HttpServlet{
	
	// servlet lifeCylce : 파일이 생성되서 소멸하는 과정 
	public void init() {}	// request, response 파라미터는 웹 브라우저에서 보내준다. 
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);	// service()는 doGet()이나 doPost()를 찾는다. 그리고 doGet()이나 doPost()를 호출하는 순간 시작된다.
	}
	
	// 웹 브라우저 request, response : 주소창을 타고 넘어온다. 256byte 제한 (보임)
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Get Method 입니다");
	}
	
	// 웹 브라우저 request, response : 웹 브라우저 헤더 포함하여 전송 (안보임 - 비밀 요하는 것들, 중요한 것들 이걸로 보내기)
	public void doPost(HttpServletRequest request, HttpServletResponse response) {}
	
	public void destroy() {}

}
