package thread07.Synchronized;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 15.
 * @���� : ����ȭ ( Synchronized ) 
 */

public class EX {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(); 	// ������ ��ü 
		
		UserKim kim = new UserKim();
		kim.setCalculator(calculator);
		kim.start();
		
		UserPark park = new UserPark();
		park.setCalculator(calculator);
		park.start();
		
	}

}
