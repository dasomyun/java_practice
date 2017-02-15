package thread08.Synchronized;

public class Family extends Thread {
	
	public Toilet toilet ; 
	
	public Family (Toilet toilet) {
		this.toilet = toilet;
	}

	@Override
	public void run() {
		toilet.openDoor(Thread.currentThread().getName());
	}
	
}
