package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example04 extends HttpServlet{
	// 서블릿을 최초 요청할 때 서블릿 객체를 생성하고, 이후 요청이 오면 앞서 생성한 서블릿 객체를 그대로 사용한다.

	// 생략가능 : init(), service(), distroy()
	public void proRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
		request.setCharacterEncoding("utf-8");	// encoding
		String msg = request.getParameter("msg");	
		// System.out.println(msg); // 나중에 DB로 넘겨줌 (DTO, DAO)
		
		response.setContentType("text/html;charset=utf-8"); // 응답을 전송하기 위해 응답의 컨텐츠 타입을 지정
		PrintWriter out = response.getWriter(); // 응답을 전송하기 위해 문자열 데이터를 출력할 수 있는 PrintWriter 사용 
		
		out.print("<html>");
		out.print("<head><title></title></head>");
		out.print("<body>");
		out.print("<h3>" + msg + "</h3>");
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}
	
	// doGet, doPost로 바뀌는 경우가 많아서 가동성을 위해 함수로 뺌
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		proRequest(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		proRequest(request, response);
	}
	
}
