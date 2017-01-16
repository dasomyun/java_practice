package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : for 문 
 */
//while문은 record 처리할때, db할때 많이 사용된다.
//for문은 수치반복, while문은 record반복에 사용 
public class Exam17 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("\n");
		
		for(int i = 1; i <= 5; i++ ) {
			System.out.println("안녕하세요");
		}
		
		System.out.println("\n");
		
		for(int j=5;j>=1;j--){
			System.out.println("배고파~");
		}
		
		System.out.println("\n");
		
		for(int k =1; k<=10; k++){
			System.out.print( k + "\t");
		}
		
		System.out.println("\n");
		
		for(int r = 10; r>=1; r-- ){
			System.out.print(r + "\t");
		}
	}

}
