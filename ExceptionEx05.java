package ch10.exception;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : 에러처리 - InputMismatchException , ArithmeticException
 * 			
 */
//java.lang.object 패키지는 default로 넣어져 있어서 import 안해도 됨 

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("x를 입력하세요 : ");
			int x = sc.nextInt();	
			
			System.out.print("y를 입력하세요 : ");
			int y = sc.nextInt();
			
			int div = x/y;
			System.out.println("정수형 결과 나눗셈 : " + div);
			
		} catch (ArithmeticException obj) {		
			System.out.println("0으로 나눌 수 없습니다");
		} catch (InputMismatchException obj) {
			System.out.println("정수만 입력 하실 수 있습니다");
		}
				
		sc.close();
	}

}
