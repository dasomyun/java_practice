package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Example10_CookieSet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example10_CookieSet() {
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
		String[] fruit = request.getParameterValues("fruit");
		//System.out.println(fruit.length);
		
		// 쿠키생성
		if(fruit.length != 0) {
			for(int i=0; i<fruit.length; i++) {
				Cookie cookie = new Cookie("fruit"+i , fruit[i]);
				
				// 초*분*시*일 (60*60*2), (60*60*24*365)
				cookie.setMaxAge(60*30); 		// 쿠키를 언제까지 살려둘건지 설정
				response.addCookie(cookie);  	// 시간설정, fruit가 들어감
				// Crome 설정에서 볼수 있음
			}
		}

		System.out.println("쿠키저장");
	}

}
