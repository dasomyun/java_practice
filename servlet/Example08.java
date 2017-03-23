package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* response 객체는 웹브라우저의 요청에 응답한다.
 * response 역할
 * 1. 출력되는 페이지의 contentType 설정, 출력함수 제공
 * 2. 객체 헤더 정보 입력 (파일 업로드시)
 * 3. 쿠키 설정
 * 4. 페이지 이동 
 * 
 *
 *	response 페이지 이동
 * 1. resp.sendRedirect(contextPath + "/Servlet/Example08_Success"); // request, response 값을 넘겨주지 못한다. 그냥 페이지 이동만 가능 
 * 
 * 2. RequestDispatcher rd = request.getRequestDispatcher("/servlet/Example09_Sub");	// request, response 값을 넘겨 줄수 있다. 서블릿에서 서블릿으로 이동시 request, response를 가지고가야한다
 *	  rd.include(request, response);		//호출된곳으로 다시 돌아온다 ( 예제9에서 hi 찍힘	)						
 *    rd.forward(request, response); 		//호출된 곳으로 돌아오지 않는다 ( 예제9에서 hi 안찍힘 )
 *    
 *  1. 웹에서의 scope 종류 (데이터가 얼마나 살아있는지)
 *  page Scope : page에서 데이터를 사용한다.
 *  request Scope : request 객체 전송으로 데이터 공유 (include, forward)
 *  session Scope : 모든 페이지에서 데이터 공유, 웹브라우저가 종료되면 세션이 종료 (daum) (cookie , session (쇼핑몰장바구니) )
 *  application Scope : 모든 페이지에서 데이터 공유, 웹브라우저가 종료되도 데이터 유지 (google), 범위가 가장크다 
 *  
 */


public class Example08 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proRequest(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proRequest(req,resp);
	}
	
	
	// 에러걸렸을 때 처음과 끝을 보지말고 과정을 보기 
	protected void proRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8"); // 한글처리
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		// System.out.println(id + "\t" + pwd); 확인 DAO, DTO
		
		String dbId = "abc123";
		String dbPwd = "abc123";
		
		String contextPath = req.getContextPath();
		
		if(id.equals(dbId) && pwd.equals(dbPwd)) {	// 아이디 비밀번호 일치 검사
			//System.out.println("Success!");
			//resp.sendRedirect("http://localhost:8081/webTesting/Servlet/Example08_Success");	// 페이지 이동
			resp.sendRedirect(contextPath + "/Servlet/Example08_Success");	// ip나 port번호가 바뀔수도 있기 때문에 이렇게 해주는게 좋음
		} else {
			//System.out.println("Fail~~~~~~~");
			//resp.sendRedirect("http://localhost:8081/webTesting/Servlet/Example08_Fail");		// 페이지 이동
			resp.sendRedirect(contextPath + "/Servlet/Example08_Fail");
		}
		
	}
}


