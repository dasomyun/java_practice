package thread02.Deamon;

public class AutoSave extends Thread {
	
	public void save() {
		System.out.println("�۾������� �����մϴ�");
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}		
			this.save();
		}
	}
	
	
	
}
