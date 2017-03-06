package ch04.quiz;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 20
 *                     문제 20) output() 함수를 호출해서 매개 값을 출력합니다. output() 함수의 매개값으로 
 *                                int, boolean,double, String값을 줄 수 있습니다.
 */

public class Quiz20 {
	public static void main(String[] args) {
		output(10);
		output(true);
		output(5.7);
		output("홍길동");
	}

	public static void output(int x){
		System.out.println(x);
	}
	
	public static void output(boolean x){
		System.out.println(x);
	}
	
	public static void output(double x){
		System.out.println(x);
	}
	
	public static void output(String x){
		System.out.println(x);
	}
}
