package practice;
/* 내용 : 난 정말 java를 공부한 적이 없다구요 p191
 * 사과장수 시뮬레이션 ( 생성자 )
 */

class FruitSeller1 {
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;
	
	public int salesApple1(int money){//4500 //2000
		int num = money/APPLE_PRICE;// 4500/1500 = 3 //2000/1000=2
		numOfApple -= num;//30-3=27 //20-2=18
		myMoney += money;//4500 //2000
		return num;//3 //2
	}

	public void showSalesResult() {
		System.out.println("남은 사과 : " + numOfApple);//27 //18
		System.out.println("판매 수익 : " + myMoney); //4500 //2000
	}
	
	public void initMembers(int money , int appleNum, int price){ //seller1 : 0,30,1500 seller2 : 0,20,1000
		myMoney = money;//0 // 0
		numOfApple = appleNum;//30 //20
		APPLE_PRICE = price;//1500 //1000
	}
	
}

class FruitBuyer1 {
	int myMoney = 10000;
	int numOfApple = 0;
	
	public void buyApple1(FruitSeller1 seller , int money){//seller1, 4500 //seller2,2000
		numOfApple += seller.salesApple1(money);//3 //5
		myMoney -= money;//10000-4500=5500 5500-2000//3500
	}
	
	public void showBuyResult () {
		System.out.println("현재 잔액 : " + myMoney);//3500
		System.out.println("사과 개수 : " + numOfApple);//5
	}
}


public class FruitSellerMain2 {

	public static void main(String[] args) {
		FruitSeller1 seller1 = new FruitSeller1(); //seller1이라는 이름의 FruitSeller객체 생성
		seller1.initMembers(0,30,1500); 
		//인스턴스 생성, 초기화를 두줄에 걸쳐 해줘야 한다. - 그래서 생성자 사용! 
		
		FruitSeller1 seller2 = new FruitSeller1();//seller2이라는 이름의 FruitSeller객체 생성
		seller2.initMembers(0, 20, 1000);
		
		FruitBuyer1 buyer = new FruitBuyer1(); //buyer이라는 이름의 FruitBuyer객체 생성
		buyer.buyApple1(seller1,  4500);
		buyer.buyApple1(seller2, 2000);
		
		System.out.println("과일 판매자1의 현재 상황");
		seller1.showSalesResult();
		
		System.out.println("과일 판매자2의 현재 상황");
		seller2.showSalesResult();
		
		System.out.println("과일 구매자의 현재 상황");
		buyer.showBuyResult();
	}

}
