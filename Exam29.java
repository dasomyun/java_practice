package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 17.
 * @내용 : 1byte 입력방식 (A, a, &)
 */

import java.io.IOException;

public class Exam29 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("문자 입력 : ");
		char x = (char)System.in.read();//ASCII코드 값으로 반환해주니까 CHAR로 형변화 해야한다. 실행시(RUNTIME)에 값이 정해진다 
		System.in.read(); //\r - 엔터 처리( 엔터는 \r+\n 조합)
		System.in.read(); //\n 처리
		System.out.println("x: "+ x);
		
		System.out.print("또 문자 입력 : ");;
		char y = (char) System.in.read();
		System.in.read();//엔터값 처리
		System.in.read();//엔터값 처리
		System.out.println("y : " + y );
		
		System.out.print("또또 문자 입력 : ");
		char z = (char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.println("z: " + z);
	}

}
