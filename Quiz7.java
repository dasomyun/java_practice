package ch05;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 29
 * @내용 : 7. 세 정수를 입력 받아 10이하의 수만을 더하여 출력하는 프로그램을 작성하세요 (if문)
 */
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("세 정수를 입력하세요 (1번째) : ");
		int i = sc.nextInt();
		System.out.println("세 정수를 입력하세요 (2번째) : ");
		int j = sc.nextInt();
		System.out.println("세 정수를 입력하세요 (3번째) : ");
		int z = sc.nextInt();
		
		if(i<11) 
			sum += i;
		if (j<11) 
			sum += j;
		if (z<11)
			sum += z;
		
		System.out.println("sum : " + sum);
		sc.close();
	}

}
