package Thread11.Notify;

public class Producer extends Thread{
	AutoMachine autoMachine;
	
	public Producer(AutoMachine autoMachine){
		this.autoMachine = autoMachine;
	}

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			autoMachine.setDrink("음료수 번호 : " + i);
			System.out.println("음료수 번호 : " + i + "채워 넣음");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
}
