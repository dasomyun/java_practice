package api04.String;

import java.io.UnsupportedEncodingException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 6.
 * @내용 : api - String 클래스 
 * 					byte[]를 String 변환
 *					String을 byte[] 변환
 */

// 인코딩 , 디코딩
// 문자 -> System.in.read();
// 문자열 -> new Scanner(), toString() -> 기본자료형 
//									   -> byte[]

// 문자셋 : ISO-8859-1 -> 영문자 
//			EUC-KR	   -> 한글
//			UTF-8	   -> 전세계 문자

import java.util.Scanner;

public class String05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = sc.next();
		byte[] array = str.getBytes();			// String --> byte 즉 인코딩 

		System.out.println("인코딩 : " );
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("\n");
		String value = new String(array);
		System.out.println("디코딩 : " + value + "\n");
		
		sc.close();
		
		try {
			String hStr = "반가워요";
			byte[] byArr = hStr.getBytes("EUC-KR");	//인코딩
			
			String byStr = new String(byArr , "EUC-KR");	//디코딩
			System.out.println("byStr : " + byStr);
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
		
	}

}
