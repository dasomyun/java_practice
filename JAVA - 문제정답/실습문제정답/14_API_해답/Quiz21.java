package api09.Quiz;

/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 21) 
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz21 {
	public static void main(String[] args) {
		Date now=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(sdf.format(now));
	}
}
