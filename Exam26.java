package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : continue 문, break 문
 */

public class Exam26 {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				if(j==3) {
					//break;
					continue;
				}
				System.out.println(i + "\t" + j);
			}
		}
		
	

			AA : for(int i=0; i<3; i++){
				for(int j=0; i<5; j++){
					if(j==3) {
						//break AA;  //AA 블럭 밖으로 빠져나감
						continue AA; // i++로 감 
					}
					System.out.println(i + "\t" + j);
				}
			}
			
		
		
		
		
		
		
	}

}
