package thread08.Synchronized;

public class Toilet { 	// ���� Ŭ���� ( ����Ŭ������ �����尡 �� �� ���� )
	
	public void openDoor(String name) {		// name = �������
		
		System.out.println(name + " ȭ��� ����....");
		synchronized(this) {		// ����ȭ : �ѹ��� �ϳ��� �����常 ������ �� �ִ� 
			for(int i=0; i<10000; i++) {
				if(i==100)	System.out.println(name + " : ������~~");
			}
				System.out.println(name + ": ��~~~ �ÿ���\n");
			}
		}

}
