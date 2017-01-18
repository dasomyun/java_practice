package ch03;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 18.
 * @내용 : 배열: 최소값 최대값 구하기, 배열 선언 방법

 */

import java.util.Scanner;

public class Exam34 {
	public static void main(String[] args) {

		int x=0;
		
		int[] array = new int[5];
		System.out.println(array[0]); // 자동으로 초기화 하기 떄문에 0
		
		
		//최대값 최소값
		Scanner sc = new Scanner(System.in);
		
		//입력 15 48 66 77 3 각각이 4바이트 총 20바이트 
		for(int i=0; i<array.length; i++){
			System.out.print("수입력: ");
			array[i]=sc.nextInt();
		}
		
		//연산 (최대값)
		int max = array[0];
		for(int i=0; i<array.length; i++){
			if(max<array[i]){
				max=array[i];
			}
		}
		System.out.println("max: " + max + "\n");
		
		int min = array[0];
		for(int i=0; i<array.length; i++){
			if(min > array[i]){
				min=array[i];
			}
		}
		System.out.println("min: " + min + "\n");
		
		//배열 선언 방법
		char[] a = new char[] {'A','B','C'};
		char b[] = new char[] {'*', '^', '&'};
		char[] c={'x','y','z'};
		
		char[] i;
		//i={'A','B','C'};	//ERROR
		
		char[] j;
		j= new char[] {'x','y'};
		
		//배열의 단점: 한번 선언하면 추가삭제, 삽입, 갯수변경이 안된다.
		//실무에선 배열을 많이 쓰지 않는다.
		
		sc.close();
	}
}