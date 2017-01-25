package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 상속 - 함수 재정의 ( Overriding )
 */

class Airplane {
	public void	fly() {
		System.out.println("일반 비행 합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙 합니다");
	}
	
	public void land() {
		System.out.println("착륙 합니다");
	}
}

class SuperSonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	private int flyMode = NORMAL;
	
	public void setFlyModel(int flyMode) {
		this.flyMode = flyMode;
	}
	
	public void fly(){
		if(flyMode == SUPERSONIC){
			System.out.println("초음속 비행합니다");
		} else {
			super.fly();
		}
	}
	
}



public class Exam87 {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		
		sa.setFlyModel(SuperSonicAirplane.NORMAL);
		sa.fly();
		
		sa.setFlyModel(SuperSonicAirplane.SUPERSONIC);
		sa.fly();
		
		sa.land();
		
	}

}
