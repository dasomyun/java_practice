package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example08_Fail extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proRequest(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proRequest(req,resp);
	}

	protected void proRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("Fail~~~~~~~~~~~");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head><title>로그인 실패 페이지</title></head>");
		out.print("<body>");
		out.print("<h3> 아이디 비밀번호를 확인하세요 </h3>");
		out.print("</body>");
		out.print("</html>");
	}

}
