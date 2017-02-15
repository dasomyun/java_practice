package thread07.Synchronized;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 15.
 * @내용 : 동기화 ( Synchronized ) 
 */

public class EX {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(); 	// 공유된 객체 
		
		UserKim kim = new UserKim();
		kim.setCalculator(calculator);
		kim.start();
		
		UserPark park = new UserPark();
		park.setCalculator(calculator);
		park.start();
		
	}

}
