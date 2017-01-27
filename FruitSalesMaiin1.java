package practice;

/* 내용 : 난 정말 java를 공부한 적이 없다구요 p186
 * 사과장수 시뮬레이션
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
		System.out.println("남은 사과 : " + numOfApple);//18
		System.out.println("판매 수익 : " + myMoney);//2000
	}
}

class FruitBuyer {
	int myMoney = 5000;
	int numOfApple = 0;
	
	public void buyApple(FruitSeller seller, int money) { //seller , 2000
		//이렇게 FruitSeller전체 클래스를 매개변수로 두면 그 클래스를 가져다 사용할 수 있는 뜻인가보다. 
		numOfApple += seller.saleApple(money);//2
		myMoney -= money;//5000-2000=3000
	}
	
	public void showBuyResult() {
		System.out.println("현재 잔액 : " + myMoney);//3000
		System.out.println("사과 개수 : " + numOfApple);//2
	}
	
}

public class FruitSalesMaiin1 {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();	//seller 라는 FruitSeller의 객체 생성
		FruitBuyer buyer = new FruitBuyer();	//buyer 이라는 FruitBuyer의 객체 생성
		buyer.buyApple(seller, 2000);	//seller 객체와 2000 매개변수에 전달
		
		System.out.println("과일 판매자의 현재 상황 : ");
		seller.showSalesResult();
		
		System.out.println("과일 구매자의 현재 상황 : ");
		buyer.showBuyResult();
		
		
	}

}
