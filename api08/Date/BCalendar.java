package api08.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 7.
 * @���� : java.util ��Ű���� Calendar Ŭ���� 
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
		
		System.out.print(year + "�⵵ ");
		System.out.print(month + "��");
		System.out.print(date + "�� ");
		System.out.print(hour + "�ð� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "�� ");
		System.out.print( ampm + "�⵵ ");
		System.out.print(ampm==0 ? "����" : "����");	
		
		Date d = today.getTime();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(d));
	
	}

}
