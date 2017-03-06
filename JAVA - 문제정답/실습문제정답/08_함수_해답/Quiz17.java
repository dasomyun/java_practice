package ch04.quiz;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 17
 *                     문제 17) 다음을 보시고 프로그램을 완성하세요.
 */

public class Quiz17 {
	public static void main(String[] args) {
		String[]  str=new String[] {"kim","park","lee"};
		sub(str);
	}

	public static void sub(String[] str){
		for(int i=0;i<str.length;i++){
			System.out.print(str[i] + "\t");
		}
	}
}
