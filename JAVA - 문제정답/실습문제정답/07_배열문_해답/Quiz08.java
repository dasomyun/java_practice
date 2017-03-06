package ch03.quiz;

/**
 * @Data : 2016. 7. 3.
 * @Author : 강사
 * @Description :  배열 실습문제 8번
 */

public class Quiz08 {
	public static void main(String[] args) {
		double sum=0.0;
		double array[]={1.0, 2.3, 3.4, 5.5};
		
		// for문
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		System.out.println("forSum:"+ sum + "\n");
		
		// while문
		int cnt=0;
		double wsum=0;
		while(array.length > cnt){
			wsum+=array[cnt];
			cnt++;
		}
		System.out.println("wsum:" + wsum + "\n");
		
		// do ~ while문
		int count=0;
		double dsum=0;
		do{
			dsum+=array[count];
			count++;
		}while(array.length > count);
		System.out.println("wsum:" + dsum + "\n");
	}
}
