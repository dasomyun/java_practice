package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example03 extends HttpServlet {
	
	public void init() {}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doGet(request, response);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{ 
		// System.out.println("OK");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// BufferedOutputStream --> OutputStream --> soc.getOutStream
		
		out.print("<html>");
		out.print("<head><title></title></head>");
		out.print("<body>");
		out.print("<h3>서블릿 시작입니다.</h3>");
		out.print("<body>");
		out.print("</html>");
		out.close();
	}
	
	public void destroy() {}
	
}
