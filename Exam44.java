package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call By Value를 이용한 사칙연산 
 */
import java.util.Scanner;
public class Exam44 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요 : ");
		int value = sc.nextInt();
		
		System.out.println("두번째 수를 입력하세요 : ");
		int su = sc.nextInt();
		
		hap(value, su);
		cha(value, su);
		mul(value, su);
		div(value, su);
		
		sc.close();
	}
	
	public static void hap(int value, int su) {
		System.out.println("합 : " + (value+su));
	}
	
	public static void cha(int value, int su) {
		System.out.println("차 : " + (value-su));
	}
	
	public static void mul(int value, int su) {
		System.out.println("곱 : " + (value*su));
	}
	
	public static void div(int value, int su){
		System.out.println("나누기: " + ((float)value/su));
	}

}
