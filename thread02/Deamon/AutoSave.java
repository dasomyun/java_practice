package thread02.Deamon;

public class AutoSave extends Thread {
	
	public void save() {
		System.out.println("작업내용을 저장합니다");
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
