package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example09_Sub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example09_Sub() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proRequest(request, response);
	}

	protected void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String message = request.getParameter("message");
		//System.out.println(message);
		String name = (String)request.getAttribute("name"); 	// Object 이기 때문에 downcasting set한 속성을 get해줌
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>"); 
		out.print("<head><title></title></head>");
		out.print("<body>");
		out.print("<h3>" + message + "</h3>");
		out.print("<h3>" + name + "</h3>");
		out.print("</body>");
		out.print("</html>");
		
		// out.close();  include 방식때문에 쓰면 안된다 닫혀버리니까 더이상 출력이 안나옴
	}

}
