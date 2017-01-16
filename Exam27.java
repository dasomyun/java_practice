package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : continue문, break문
 */
public class Exam27 {

	public static void main(String[] args) {
	
		int x = 0; 
		while(x<10) {
			x++;
			if(x==5){
				break;	//1234
				//continue;	//1234678910
			}
			System.out.println(x);
		}
		System.out.println("\n");

		
		int y = 0;
		do {
			y++;
			if(y==5) {
				break; //continue;
			}
			System.out.println(y);
		} while(y<10);
	}

}
