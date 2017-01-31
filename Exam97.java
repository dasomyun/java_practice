package ch08;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : 객체를 필드로 사용 
 */

class Apple{
	private int su, value;
	
	public void setData(int su, int value){
		this.su = su;
		this.value = value;
	}
	
	public int getData(){
		return su+value;
	}
}

class Banana {
	private int imsi;
	private Apple apple;
	
	public Banana() { }
	public Banana(int imsi, Apple apple){
		this.imsi = imsi;
		this.apple = apple;
	}
	
	public void disp(){
		System.out.println(imsi);
		System.out.println(apple.getData());
	}
	
}


public class Exam97 {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.setData(10, 20);
		
		Banana banana = new Banana(55, apple);
		banana.disp();
		
		
	}

}
