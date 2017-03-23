package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example09 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example09() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String message = request.getParameter("message");
		//System.out.println(message);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title></title></head>");
		out.print("<body>");
		
		RequestDispatcher rd = request.getRequestDispatcher("/servlet/Example09_Sub");
		rd.include(request, response);
		out.print("<h3>hi</h3>");
		
		request.setAttribute("name","윤다솜");	// name이 윤다솜인 속성 세팅
		rd.include(request, response);
		out.print("<h3>APPLE</h3>");
		
		rd.include(request, response);
		out.print("<h3>BANANA</h3>");
		
		out.print("</body>");
		out.print("</html>");

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String message = request.getParameter("message");
		//System.out.println(message);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title></title></head>");
		out.print("<body>");
		
		// response.sendRedirect는 페이지 이동만 가능, 데이터값 전달이 안된다.
		// include : 페이지 이동이 되고 데이터 값 전달이 되고, 다시 제어권을 갖는다. ( 함수랑 똑같다 ) , out.close() 사용하면 안된다 (스트림이 닫혀서 더이상 출력이 안나온다)
		// forward : 페이지 이동이 되고 데이터 값 전달이 되지만 다시 제어권을 갖지 못한다. ( 제어권을 넘겨준다 ) , 이걸 더 많이 사용 
		RequestDispatcher rd = request.getRequestDispatcher("/servlet/Example09_Sub");
		
		request.setAttribute("name","윤다솜");
		
		rd.forward(request, response);
		out.print("<h3>hi</h3>");
		
		rd.forward(request, response);
		out.print("<h3>APPLE</h3>");
		
		rd.forward(request, response);
		out.print("<h3>BANANA</h3>");
		
		out.print("</body>");
		out.print("</html>");

		out.close();
	}

}
