package thread07.Synchronized;

public class UserPark extends Thread {
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		super.setName("PARK");
		calculator.setMemory(50);
	}
	

}
