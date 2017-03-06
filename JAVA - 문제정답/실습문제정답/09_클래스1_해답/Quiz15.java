package ch05.quiz01;

/**
 * @Data : 2016. 7. 12.
 * @Author : ÁÂ¹ÎÇý
 * @Description :  Å¬·¡½º1 - ½Ç½À¹®Á¦ 15)
 */

class Printer{
	public void println(int x){
		System.out.println(x);
	}
	
	public void println(boolean x){
		System.out.println(x);
	}
	
	public void println(double x){
		System.out.println(x);
	}
	
	public void println(String x){
		System.out.println(x);
	}
}

public class Quiz15 {
	public static void main(String[] args) {
		Printer printer=new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("È«±æµ¿");
	}
}
