package ch04.quiz;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 12
 *                     문제 12) 다음 메인 함수와 출력 값을 보고 프로그램을 완성하시오. (Call By Value)
 */

public class Quiz12 {
	public static void main(String[] args){
		outAtoZ();
		out1to10();
		sum1to10();		
	}

	
	public static void outAtoZ(){
		for(char i='A'; i<='Z';i++){
			System.out.print(i);
		}
		System.out.println();
	}
	
	public static void out1to10(){
		for(int i=1; i<=10;i++){
			System.out.print(i);
		}
		System.out.println();
	}
	
	public static void sum1to10(){
		int sum=0;
		for(char i=1; i<=10;i++){
			sum +=i;
		}
		System.out.println("1부터10까지의 합:" + sum);
	}
}
