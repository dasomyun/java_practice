package api01.System;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : System 클래스 : System에 관련된 클래스이다.
 */

public class ASystem {

	public static void main(String[] args) {
		PrintStream ps = System.out;
		ps.println("API 시작입니다.");
		ps.println(10);
		ps.println(24.5f);
		System.out.println("간편하게 사용\n\n");
		
		System.out.print("문자 입력 : ");
		InputStream is = System.in;
		
		try {
			int su = is.read();
			char ch = (char) su;
			is.read();	//Enter \n \r의 조합 
			is.read();
			
			System.out.println(ch);
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		Scanner sc = new Scanner(is);
		while(true) {
			System.out.print("수 입력 : ");
			int su = sc.nextInt();
			
			if(su==5){
				System.out.println("프로그램 종료");
				sc.close();
				//break;
				//return;   해당함수(main함수) 밖으로 빠져나감
				System.exit(0); 		//시스템이 종료됨
			}
			
			System.out.println("su : " + su);
		}
		
		// System.out.println("END----------");
		
	}

}