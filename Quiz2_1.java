package ch05;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 29
 * @내용 : 2. 어떤 수를 입력해서 그 수가 10보다 크고 20보다 작으면 출력하는 프로그램을 작성하세요 (if문)
 */
import java.util.Scanner;

public class Quiz2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10보다 크고 20보다 작은 수를 입력하세요 (그 외의 수는 출력되지 않습니다 ) : ");
		int i = sc.nextInt();
		
		if(i > 10 && i < 20)
			System.out.println(i);
		
		sc.close();
	}

}
