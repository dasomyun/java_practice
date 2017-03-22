package servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example07 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proReq(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proReq(req,resp);
	}

	/* HttpServletRequest 기본 객체 역할
	 * 한글 Encoding 기능
	 * 파라미터 읽기 기능
	 * 서버와 관련된 정보 읽기 기능
	 * 웹 브라우저와 관련된 정보 읽기 (X)
	 * 헤더 읽기 기능
	 * 쿠키 읽기 기능
	 */
	
	protected void proReq(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 한글 Encoding (기능 한글 설정)
		req.setCharacterEncoding("utf-8");	//(많이씀)
		
		// 파라미터 읽기
		int su = Integer.parseInt(req.getParameter("su"));
		int value = Integer.parseInt(req.getParameter("value"));
		// System.out.println(su + " , " + value); 확인
		
		// 서버와 관련된 정보 읽기 기능
		String serverName = req.getServerName(); 	// localhost
		int port = req.getServerPort();				// 8081
		
		String contextPath = req.getContextPath();	// /WebTesting (많이씀) : root 경로 (conponent는 WEB-INF안에 있음)
		String servletPath = req.getServletPath(); 	// /servlet/Example07 (많이씀) : 현재 서블릿의 풀 패키지명
		String method = req.getMethod();			// GET, POST
		
		String URI = req.getRequestURI();			// /webTesting/servlet/Example07 URL : Uniform Resource Locators (많이씀)
		StringBuffer URL = req.getRequestURL();		// http://localhost:8081/webTesting/servlet/Example07 (많이씀)
		
		System.out.println("서버이름 : " + serverName);
		System.out.println("서버포트 : " + port);
		System.out.println("컨텍스트 경로 : " + contextPath);
		System.out.println("서블릿 경로 : " + servletPath);
		System.out.println("요청방식 : " + method);
		System.out.println("URI : " + URI);
		System.out.println("URL : " + URL);
		System.out.println("----------------------------------------------------");
		// 헤더 읽기
		Enumeration<String> header = req.getHeaderNames();
		while(header.hasMoreElements()) {
			String key = header.nextElement();
			String val = req.getHeader(key);
			System.out.println(key + " : " + val);
		}
	}
	
}
























