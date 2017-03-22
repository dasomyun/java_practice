package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 내 프로그램 안으로 들어오는거 : request, 내 프로그램 밖으로 나가는거 response

public class Example05 extends HttpServlet {
	//init(), service(), destroy()
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		proRequest(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		proRequest(request, response);
	}
	
	protected void proRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");	// 내 프로그램에서 encoding 요청
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String addr = request.getParameter("addr");
		
		//System.out.println(name + "\t" + phone + "\t" + addr); 	// html(form)에서 서버(Example05)로 잘 넘어오는지 확인
		response.setContentType("text/html;charset=utf-8"); // 응답을 전송하기 위해 응답의 컨텐츠 타입을 지정
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>서버에서 온 결과</title></head>");
		out.print("<body>");
		out.print("<h4> 서버에서 온 결과 </h4>");
		out.print("<h3> 이름 : " + name + "</h3>");
		out.print("<h3> 전화번호 : " + phone + "</h3>");
		out.print("<h3> 주소 : " + addr + "</h3>");
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}
	
}
