package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example08_Success extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proRequest(req, resp);
	}
	
	protected void proRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("Success!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head><title>로그인 성공 페이지</title></head>");
		out.print("<body>");
		out.print("로그인 성공~~원하는 메뉴를 사용하세요.");
		out.print("</body>");
		out.print("</html>");
		
	}
	
}
