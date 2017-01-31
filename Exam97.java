package ch08;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : ��ü�� �ʵ�� ��� 
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
