package Thread11.Notify;

public class Producer extends Thread{
	AutoMachine autoMachine;
	
	public Producer(AutoMachine autoMachine){
		this.autoMachine = autoMachine;
	}

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			autoMachine.setDrink("����� ��ȣ : " + i);
			System.out.println("����� ��ȣ : " + i + "ä�� ����");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
}
