package ch02;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 17.
 * @내용 : 2byte 입력 방식은 String 형태로 받아서 
 * 		   각각의 맞는 자료형으로 변환한다.
 */

public class Exam28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		
		String a = sc.next();
		System.out.println("값: " + a); //문자열!!!로 읽어와서 문자열!!!로 뿌림
										//키보드는 char, string 읽음
		System.out.print("정수형입력 : ");
		int x=sc.nextInt(); 	//연산 할때 정수형으로 받기
		++x;
		System.out.println("x : " + x);// 문자열로 출력
		//입력은 문자열 로 입력받고 정수로 변환함 
		
		
		System.out.print("실수형 입력 : ");
		float y=sc.nextFloat();
		System.out.println("y : " + y );
		
		//어떤 수를 입력을 받아서 10보다 크면 출력하시요
		System.out.print("어떤 수 입력");
		int su = sc.nextInt();
		if( su > 10 ){
			System.out.println(su + " 10보다 큽니다");
		}
			
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
