package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 20.
 * @내용 : 함수 중복 - Overload(Overloading)
 */

public class Exam53 {

	public static void main(String[] args) {
		output("홍길동");
		output(10);
		output(24.5f);
		output('A');
		output(10, 40);
		output(77);
	}
	
	//같은 기능을 하는 함수의 이름을 동일하게 해줌 - overloading
	
	public static void output(String name) {
		System.out.println(name);
	}
	
	public static void output(float su) {
		System.out.println(su);
	}
	
	public static void output(char ch) {
		System.out.println(ch);
	}
	
	public static void output(int su) {
		System.out.println(su);
	}
	
	public static void output(int a, int b){
		System.out.println(a + "\t" + b);
	}
	
	
	

}
