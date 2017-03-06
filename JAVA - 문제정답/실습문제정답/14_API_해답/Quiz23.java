package api09.Quiz;

/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 23) 
 */

import java.text.DecimalFormat;

public class Quiz23 {
	public static void main(String[] args) {
		int y=123456789;
		DecimalFormat d=new DecimalFormat("#,###");	
		System.out.println("출력 값:" + d.format(y)); 
	}
}
