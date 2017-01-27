package practice;
/* ���� : �� ���� java�� ������ ���� ���ٱ��� p191
 * ������ �ùķ��̼� 2�� �����ڸ� ����Ͽ� �ٲٱ�
 */

class FruitSeller3 {
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;
	
	public FruitSeller3 (int money , int appleNum, int price) {
		myMoney = money;//0 // 0
		numOfApple = appleNum;//30 //20
		APPLE_PRICE = price;
	}
	
	public int salesApple1(int money){//4500 //2000
		int num = money/APPLE_PRICE;// 4500/1500 = 3 //2000/1000=2
		numOfApple -= num;//30-3=27 //20-2=18
		myMoney += money;//4500 //2000
		return num;//3 //2
	}

	public void showSalesResult() {
		System.out.println("���� ��� : " + numOfApple);//27 //18
		System.out.println("�Ǹ� ���� : " + myMoney); //4500 //2000
	}
	
}

class FruitBuyer3 {
	int myMoney ;
	int numOfApple = 0;
	
	public FruitBuyer3 (int myMoney) {
		this.myMoney = myMoney;
		numOfApple = 0;
	}
	
	public void buyApple3(FruitSeller3 seller , int money){//seller1, 4500 //seller2,2000
		numOfApple += seller.salesApple1(money);//3 //5
		myMoney -= money;//10000-4500=5500 5500-2000//3500
	}
	
	public void showBuyResult () {
		System.out.println("���� �ܾ� : " + myMoney);//3500
		System.out.println("��� ���� : " + numOfApple);//5
	}
}


public class FruitSalesMain3 {

	public static void main(String[] args) {
		FruitSeller3 seller1 = new FruitSeller3(0,30,1500); 
		FruitSeller3 seller2 = new FruitSeller3(0, 20, 1000);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000); //buyer�̶�� �̸��� FruitBuyer��ü ����
		buyer.buyApple3(seller1,  4500);
		buyer.buyApple3(seller2, 2000);
		
		System.out.println("���� �Ǹ���1�� ���� ��Ȳ");
		seller1.showSalesResult();
		
		System.out.println("���� �Ǹ���2�� ���� ��Ȳ");
		seller2.showSalesResult();
		
		System.out.println("���� �������� ���� ��Ȳ");
		buyer.showBuyResult();
	}

}
