package api01.System;

import java.util.Date;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : API - currentTimeMillis , nanoTime
 */

public class CTime {
	
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		long ntime = System.nanoTime();
		
		System.out.println("현재 시간을 초단위 : " + time);
		System.out.println("현재 시간을 나노 초단위 : " + ntime);
		
		Date da = new Date(time);
		System.out.println("초 단위를 날짜로 : " + da);

		int date = da.getDate();
		
		System.out.println("날짜 : " + date);
	}

}
