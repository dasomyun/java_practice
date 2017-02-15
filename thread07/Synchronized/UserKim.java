package thread07.Synchronized;

public class UserKim extends Thread {
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		super.setName("KIM");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}

}
