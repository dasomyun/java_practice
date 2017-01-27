package practice;

/* ���� : �� ���� java�� ������ ���� ���ٱ��� p186
 * ������ �ùķ��̼�
 */

class FruitSeller {
	int numOfApple = 20;
	int myMoney = 0;
	final int APPLE_PRICE = 1000;
	
	public int saleApple (int money) {
		int num = money/APPLE_PRICE; //num=2000/1000=2
		numOfApple -= num;//20-2=18
		myMoney += money;//0+2000 = 2000
		return num;	//2
	}
	
	public void showSalesResult () {
		System.out.println("���� ��� : " + numOfApple);//18
		System.out.println("�Ǹ� ���� : " + myMoney);//2000
	}
}

class FruitBuyer {
	int myMoney = 5000;
	int numOfApple = 0;
	
	public void buyApple(FruitSeller seller, int money) { //seller , 2000
		//�̷��� FruitSeller��ü Ŭ������ �Ű������� �θ� �� Ŭ������ ������ ����� �� �ִ� ���ΰ�����. 
		numOfApple += seller.saleApple(money);//2
		myMoney -= money;//5000-2000=3000
	}
	
	public void showBuyResult() {
		System.out.println("���� �ܾ� : " + myMoney);//3000
		System.out.println("��� ���� : " + numOfApple);//2
	}
	
}

public class FruitSalesMaiin1 {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();	//seller ��� FruitSeller�� ��ü ����
		FruitBuyer buyer = new FruitBuyer();	//buyer �̶�� FruitBuyer�� ��ü ����
		buyer.buyApple(seller, 2000);	//seller ��ü�� 2000 �Ű������� ����
		
		System.out.println("���� �Ǹ����� ���� ��Ȳ : ");
		seller.showSalesResult();
		
		System.out.println("���� �������� ���� ��Ȳ : ");
		buyer.showBuyResult();
		
		
	}

}
