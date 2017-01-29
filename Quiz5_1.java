package ch05;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 29
 * @내용 : 5. 몸무게와 키를 입력받아 그 사람이 다이어트가 필요한지를 결정하는 프로그램을 작성하세요 
 *  	  (단, 몸무게 >(키-100)*9이면 다이어트가 필요한 것으로 한다 (if문)
 */
import java.util.Scanner ;
public class Quiz5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "키를 입력하세요 : ");
		float tall = sc.nextFloat();
		
		System.out.print("몸무게를 입력하세요 : ");
		float weight = sc.nextFloat();
		
		if(weight>(tall-100) *0.9)
			System.out.println("다이어트가 필요합니다");
		else 
			System.out.println("다이어트가 필요 없습니다");
		
		sc.close();
	}

}
