package ch07_interfaceA;

public class RemoteMain {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.trunOn();
		rc.setVolum(20);
		rc.trunOff();
		System.out.println("\n\n");
		
		rc = new Audio();
		rc.trunOn();
		rc.setVolum(-2);
		rc.trunOff();
	}

}
