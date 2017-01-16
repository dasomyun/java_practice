package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : break 문, continue 문 
 */

public class Exam25 {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			if(i==5){
				break;	//if문 단독으로는 break문을 사용할 수 없고, if문을 제외한 가장 가까운 블럭 밖으로 빠져나간다.
			}
			System.out.println(i);
		}
		System.out.println("\n");
		
		for(int i=1; i<=10; i++){
			if(i==5) {
				continue;
			}
			System.out.println(i);	//다음 순서를 진행
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
