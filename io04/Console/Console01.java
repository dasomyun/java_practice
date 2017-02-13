package io04.Console;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : Console 입력 ( InputStream , BufferedInputStream )
 */

public class Console01 {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		
		try {
			InputStream is = System.in;
			bis = new BufferedInputStream(is); 	// System.in.read();
			
			System.out.print("문자입력 : ");
			char x = (char) is.read();		
			bis.read();		// 엔터값 처리 
			bis.read();		// 엔터값 처리 
			System.out.println("x : " + x + "\n\n");
				
			byte[] data = new byte[10]; // korea\r\n 		// byte도 String 형태를 받을 수 있음 
			System.out.print("두번째 문자 입력 : ");
			int count = bis.read(data);  // 7byte
			System.out.println(new String(data,0, count-2) + "\n"); 	// 0, count-2 : 엔터값 처리  // 0~5
			
			byte[] su = new byte[10]; // 22\r\n
			System.out.print("세번째 문자 즉 숫자 입력 : " );
			int cnt = bis.read(su);
			String value = new String(su , 0 , cnt-2);
			int r = Integer.parseInt(value);
			System.out.println(++r);

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
			} catch(Exception e) {
				System.out.println("close 에러 발생");
				e.printStackTrace();
			}
		}
		
	}

}
