package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 24.
 * @내용 : 중복 - 함수중복
 */

class Testing {
	private int x;
	private int y;
	private int hap;
	private int mul;
	private int cha;
	
	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void younsan () {
		hap = x+y;
	}

	public void younsan(int c){
		mul = x*y*c;
	}
	
	public void younsan(int c, int d){
		cha = x-y-(c+d);
	}
	
	public void disp() {
		System.out.println("hap : " + hap);
		System.out.println("mul : " + mul);
		System.out.println("cha : " + cha);
		
	}

}

public class Exam69 {

	public static void main(String[] args) {
		Testing testing = new Testing();
		testing.setData(10, 20);
		testing.younsan();
		testing.younsan(55);
		testing.younsan(1,2);
		testing.disp();
		
		
	}

}
