package practice;
/* 내용 : 난 정말 java를 공부한 적이 없다구요 p347
 * 문 13-1[배열과 메소드]
 * int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최대값, 
 * 그리고 최소값을 구해서 반환하는 메소드를 다음의 형태로 각각 정의하자.
 * public static int minValue(int[] arr) {...}
 * public static int maxValue(int[] arr) {...}
 */

import java.util.Scanner;

public class Quiz4 {

public static int minValue(int[] arr) {	//최소값 반환
	int min=arr[0];
	
	for(int i=0; i<arr.length; i++){
		if(arr[i]<arr[0])
			min=arr[i];
	}
	return min;
}

public static int maxValue(int[] arr) {	//최대값 반환
	int max=arr[0];
	
	for(int i=0; i<arr.length; i++){
		if(arr[i]>arr[0])
			max=arr[i];
	}
	return max;

}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		int min;
		
		int[] arr = new int[5];	//배열 선언
		for(int i=0; i<arr.length; i++){	//입력받음
			System.out.println("배열에 넣을수를 입력하세요 :(5개까지) 현재" + (i+1) + "번째");
			arr[i] = sc.nextInt();
		}
		min = minValue(arr);
		max = maxValue(arr);
		
		System.out.println("최소값 : " +min + "\t최대값 : " + max);
		
		sc.close();
	}

}
