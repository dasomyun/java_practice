package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� - �Լ� ������ ( Overriding )
 */

class Airplane {
	public void	fly() {
		System.out.println("�Ϲ� ���� �մϴ�.");
	}
	
	public void takeOff() {
		System.out.println("�̷� �մϴ�");
	}
	
	public void land() {
		System.out.println("���� �մϴ�");
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
			System.out.println("������ �����մϴ�");
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
