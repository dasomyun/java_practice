package io04.Console;

import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : console 입출력 
 */

public class Console02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력");
		String str = sc.next(); 	// apple
		
		char ch = str.charAt(2);
		System.out.println("ch : " + ch);
		
		sc.close();
		
		BufferedOutputStream bos = new BufferedOutputStream(System.out);  // System.out : 콘솔  
		PrintStream ps = new PrintStream(bos);		// 보조스트림(버퍼)를 사용할 필요는 없다.
		ps.println("하하하하");
		
	}

}
