package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : 이중 for문
 */

public class Exam20 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			for(int j=1;j<=5; j++){
				System.out.println( i + "\t" + j );
			}
			System.out.println();
		}
		
	
		for(char i='A'; i<='Z'; i++) {		//ASCII 코드 값인 A=65, Z=90 으로 계산
			for(char j=i; j<='Z'; j++) {
				System.out.print(j);	
			}
			System.out.println();
		}

	}

}
