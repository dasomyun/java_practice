package ch10.exception;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : 예외처리(에러가 발생 할 수 있는 부분을 미리 처리해 주는 것) - ArithmeticException
 * 			형식 : try ~ catch (에러 처리 클래스) ~ finally
 */

//함수안에 예외처리 대략 2~3개 

import java.util.Scanner;

public class ExceptionEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x를 입력하세요 : ");
		int x = sc.nextInt();
		
		System.out.print("y를 입력하세요 : ");
		int y = sc.nextInt();
		
	try {	
		int div = x/y;
		System.out.println("정수형 결과 나눗셈 : " + div);
	} catch(ArithmeticException obj) {		//obj는 에러구문을 담고있다 // obj를 찍는경우 - 어디에서 에러났는지 모를 때 //클라이언트에게는 obj를 보여주지말고 alert창을 띄워줘야함
		System.out.println("0으로 나눌 수 없습니다");
	}
		
		
		sc.close();
	}

}
