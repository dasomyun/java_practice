package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call By Value ~ Return을 이용한 사칙연산 
 */
import java.util.Scanner;
public class Exam48 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요 : ");
		int value = sc.nextInt();
		
		System.out.println("두번째 수를 입력하세요 : ");
		int su = sc.nextInt();
		
		int h = hap(value, su);
		int c = cha(value, su);
		int m = mul(value, su);
		float d = div(value, su);
		
		System.out.println("합 : " + h + "\n차 : " + c + "\n곱 : " + m + "\n나누기 : " + d);
		sc.close();
	}
	
	public static int hap(int value, int su) {
		return value+su;
	}
	
	public static int cha(int value, int su) {
		return value-su;
	}
	
	public static int mul(int value, int su) {
		return value*su;
	}
	
	public static float div(int value, int su){
		return (float)value/su;
	}

}
