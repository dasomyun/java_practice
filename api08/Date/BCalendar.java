package api08.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 7.
 * @내용 : java.util 패키지의 Calendar 클래스 
 */

public class BCalendar {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance(); 
		// System.out.println(today.toString());   x
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DAY_OF_MONTH);
		
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.HOUR);
		int second = today.get(Calendar.SECOND);
		int ampm = today.get(Calendar.AM_PM);
		
		System.out.print(year + "년도 ");
		System.out.print(month + "월");
		System.out.print(date + "일 ");
		System.out.print(hour + "시간 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
		System.out.print( ampm + "년도 ");
		System.out.print(ampm==0 ? "오전" : "오후");	
		
		Date d = today.getTime();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(d));
	
	}

}
