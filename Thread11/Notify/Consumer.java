package Thread11.Notify;

public class Consumer extends Thread {
	
	private AutoMachine autoMachine;
	private String name;
	
	public Consumer (AutoMachine autoMachine, String name) {
		this.autoMachine = autoMachine;
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(autoMachine.getDrink() + ":" + name + "²¨³»¸ÔÀ½");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	
	
}
