package ch02;
		
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : switch문
 */
		
public class Exam15 {
	public static void main(String[] args) {
		
		int su = 2 ;
		
		switch(su) {
		
		case 1:		//if(su==1)
			System.out.println("hahaha");
			break;
		case 2:
			System.out.println("hohoho");
			break;
		case 3:
			System.out.println("hi");
			break;	//블럭 밖으로 빠져나감
		default:
			System.out.println("how are you?");
			
		}
		//switch case문은 조건에 만족해도 하위 조건을 모두 실행 (블럭 밖으로 빠져나가지 못함) 그래서 break 사용!
		//if 문에서는 break문을 사용할수 없음
		
		System.out.println("\n");
		
		int value = 5 ;
		
		switch(value + 10){ // 15
		case 10:
			System.out.println("결과는 10 입니다.");
			break;
		case 15:
			System.out.println("결과는 15 입니다.");
			break;
		case 20:
			System.out.println("결과는 20 입니다.");
			break;
		case 25:
			System.out.println("결과는 25 입니다.");
		}
		
		System.out.println("\n");
		
		switch(su%2){		// 10/5 몫:5 나머지 0
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		
	}

}
