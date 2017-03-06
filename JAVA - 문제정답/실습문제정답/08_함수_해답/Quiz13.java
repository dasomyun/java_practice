package ch04.quiz;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 13
 *                     문제 13) 다음 메인 함수와 출력 값을 보고 프로그램을 완성하시오. (Call By Value)
 */

public class Quiz13 {
	public static void main(String[] args) {
		outChar('A');
		outDec(32767);
		outFloat(98.54f);
	}
	
	public static void outChar(char a){
		System.out.println(a);
	}
	
	public static void outDec(int b){
		System.out.println(b);
	}
	
	public static void outFloat(float c){
		System.out.println(c);
	}
}
