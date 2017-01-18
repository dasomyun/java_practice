package ch03;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 18.
 * @내용 : 배열
 */
import java.util.Scanner;

public class Exam32 {

	public static void main(String[] args) {

		//킵드로 데이터를 입력받는다, 
		int[] array = new int[5]; // 20byte
		Scanner sc = new Scanner(System.in);
				
		//입력
		for(int i = 0; i<array.length ;i++){
			System.out.println("수 입력 :");
			array[i]=sc.nextInt();
		}
		
		//연산
		int hap = 0;
		for(int i=0; i<array.length; i++){
			hap+=array[i];
		}
		
		//출력
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]+"\t");
		}
		System.out.println("hap: " + hap);
		
		
		sc.close();
		
	}

}
