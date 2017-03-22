package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example06 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proRequest(req, resp);

	}
	
	protected void proRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");

		int isu1 = Integer.parseInt(req.getParameter("su1"));
		int isu2 = Integer.parseInt(req.getParameter("su2"));
		String buho = req.getParameter("buho");
		int iResult = 0;
		
		if(buho.equals("+")) {
			iResult = isu1 + isu2; 
		} else if (buho.equals("-")) {
			iResult = isu1 - isu2;
		} else if (buho.equals("*")) {
			iResult = isu1 * isu2;
		} else if (buho.equals("/")) {
			iResult = isu1 / isu2;
		}
	
		DecimalFormat df = null;
		String strResult = null;
		
		if(buho.equals("/")) {
			df = new DecimalFormat(".00");
			strResult = df.format(iResult);
		} else if(buho.equals("+") || buho.equals("-") || buho.equals("*")) {
			df = new DecimalFormat("0");
			strResult = df.format(iResult);
		} else {
			strResult = "부호를 잘못입력하셨습니다.";
		}
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title></title></head>");
		out.print("<body>");
		out.print("<h3> 결과값 : " + isu1 + buho + isu2 + " = " + strResult + "</h3>");
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
	}
	
}


/* 지현이쏘쓰	
	protected void proRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		req.setCharacterEncoding("utf-8");
		String su_one = req.getParameter("su_one");
		String op = req.getParameter("op");
		String su_two = req.getParameter("su_two");
		
		
		int su1 = Integer.parseInt(su_one);
		int su2 = Integer.parseInt(su_two);
		String sum = "";
		
		if(op.equals("+"))
			sum =  String.valueOf(su1 + su2);
		else if(op.equals("-"))
			sum =  String.valueOf(su1 - su2);
		else if(op.equals("*"))
			sum =  String.valueOf(su1 * su2);
		else if(op.equals("/"))
		{
			if(su2 != 0) {
				DecimalFormat df = new DecimalFormat(".00");
				sum = df.format(String.valueOf((float)su1/su2));
			}else{
				System.out.println("0 들어왔단다");
			}
		}else{
			sum="부호를 잘못입력하셨습니다.";
		}		
	`}		

		resp.setContentType("text/html; charset=utf-8");
		//String result = String.valueOf(sum);
		PrintWriter output = resp.getWriter();
		
		output.print("<label>[결과]</label></br>");
		output.print("<h3>" +su_one+op+su_two+ "=" + sum + "</h3>");
		
		output.close();
	}
*/
