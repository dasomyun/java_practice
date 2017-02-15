package thread08.Synchronized;

public class Toilet { 	// 공유 클래스 ( 공유클래스는 스레드가 될 수 없다 )
	
	public void openDoor(String name) {		// name = 스레드명
		
		System.out.println(name + " 화장실 입장....");
		synchronized(this) {		// 동기화 : 한번에 하나의 스레드만 실행할 수 있다 
			for(int i=0; i<10000; i++) {
				if(i==100)	System.out.println(name + " : 끄으응~~");
			}
				System.out.println(name + ": 아~~~ 시원해\n");
			}
		}

}
