package ch04.quiz;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 22
 *                     문제 22) 1부터 999까지의 100개의 임의의 수로 이루어진 배열이 주어졌을 때, 다음 기능의 함수들을 
 *                                  각각 구현한다. 배열을 생성할 때, (Call By Value, Call By Value ~ Return)
 *									①	배열의 수들을 한 줄에 10개씩 출력하는 함수, 이때 각 수들은 줄이 맞춰져야 함
 * 									②	홀수들만 출력하는 함수, 출력되는 방식은 a와 동일함
 * 									③	인덱스가 홀수인 수들을 출력하는 함수, 출력되는 방식은 ①과 동일함
 * 									④	짝수의 개수를 반환하는 함수
 * 									⑤	배열의 수들의 합을 반환하는 함수
 * 									⑥	가장 작은 수의 위치(인덱스)를 반환하는 함수
 * 									⑦	가장 큰 수의 위치를 반환하는 함수
 * 									⑧	모든 양수의 수를 새로운 배열에 복사하는 함수, 이때 새로운 배열의 크기는 100으로 함
 */


public class Quiz21 {
	public static void main(String[] args) {
		int[] array=new int[100];		// 100개 배열 생성
		for(int i=0;i<100;i++){			// 임의의 값으로 설정
			array[i]=i+20;
		}
		
		funA(array);						// 배열의 수들을 한 줄에 10개씩 출력하는 함수
		funB(array);						// 홀수들만 출력하는 함수
		funC(array);						// 인덱스가 홀수인 수들을 출력하는 함수
		
		int eventCnt=funD(array);		// 짝수의 개수를 반환하는 함수
		int arraySum=funE(array);		// 배열의 수들의 합을 반환하는 함수
		int arrayMin=funF(array);		// 가장 작은 수의 위치(인덱스)를 반환하는 함수
		int arrayMax=funG(array);		//  가장 큰 수의 위치를 반환하는 함수
		
		System.out.println("짝수의 개수:" + eventCnt);
		System.out.println("배열의 수들의 합:" + arraySum);
		System.out.println("가장 작은 수의 위치 :" + arrayMin);
		System.out.println("가장 큰 수의 위치 :" + arrayMax);
		
		funH(array);						// 모든 양수의 수를 새로운 배열에 복사하는 함수
	}
	public static void funA(int[] array){
		System.out.println("한 줄에 10개씩 출력---------------------");
		
		for(int i=0;i<100;i++){
			System.out.print(array[i] + "\t");
			
			if((i+1)%10==0) System.out.println();
		}
		
		System.out.println();
	}
	
	public static void funB(int[] array){
		int count=0;

		System.out.println("홀수들만 출력하는 함수-------------------");
		
		for(int i=0;i<100;i++){
			if(array[i]%2 !=0){
				System.out.print(array[i] + "\t");
				
				if(++count%10==0) System.out.println();
			}
		}
		
		System.out.println();
	}
	
	public static void funC(int[] array){
		int count=0;
		
		System.out.println("인덱스가 홀수인 수들을 출력하는 함수--------------");	
		for(int i=0;i<100;i++){
			if(i%2 !=0){
				System.out.print(array[i] + "\t");
				
				if(++count%10==0) System.out.println();
			}
		}
		
		System.out.println();
	}
	
	public static int funD(int[] array){
		int count=0;
		
		for(int i=0;i<100;i++){
			if(array[i] %2 ==0) count++;
		}
		
		return count;
	}
	
	public static int funE(int[] array){
		int sum=0;
		
		for(int i=0;i<100;i++){
			sum +=array[i];
		}
		
		return sum;
	}
	
	public static int funF(int[] array){
		int temp=0;
		
		for(int i=0;i<100;i++){
			if(array[temp] > array[i]) temp=i;
		}	
		
		return temp;
	}
	
	public static int funG(int[] array){
		int temp=0;
		
		for(int i=0;i<100;i++){
			if(array[temp] < array[i]) temp=i;
		}		
		
		return temp;
	}
	
	public static void funH(int[] array){
		int[] evenArray=new int[100];
		
		for(int i=0;i<100;i++){
			if(array[i] > 0) evenArray[i]=array[i];
		}
		
		System.out.println("양수의 수:" + evenArray.length);
	}
}











