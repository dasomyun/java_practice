package api01.System;

import java.util.Date;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : API - currentTimeMillis , nanoTime
 */

public class CTime {
	
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		long ntime = System.nanoTime();
		
		System.out.println("���� �ð��� �ʴ��� : " + time);
		System.out.println("���� �ð��� ���� �ʴ��� : " + ntime);
		
		Date da = new Date(time);
		System.out.println("�� ������ ��¥�� : " + da);

		int date = da.getDate();
		
		System.out.println("��¥ : " + date);
	}

}
