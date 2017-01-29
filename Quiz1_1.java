package ch05;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 29
 * @내용 : 1. 숫자 하나를 입력받아서 그 수가 1이면 여성, 2이면 남성 이라는 글자를 출력하는 프로그램을 작성하세요 (switch ~ case문)
 */
import java.util.Scanner;

public class Quiz1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : (1.여성 , 2.남성) ");
		int i = sc.nextInt();
		
		switch (i) {
		case 1 : 
			System.out.println("여성");
			break;
		case 2 :
			System.out.println("남성");
			break;
		}
		
		sc.close();
	}

}
