package ch05.quiz02;

/**
 * @Data : 2016. 7. 12.
 * @Author : ÁÂ¹ÎÇý
 * @Description :  Å¬·¡½º2- ½Ç½À¹®Á¦ 24) »ý¼ºÀÚ
 */

class Test{
	private int x;
	private char y;
	
	public Test(int x){
		this.x=x;
	}
	
	public Test(char y){
		this.y=y;
	}
}

public class Quiz24 {
	public static void main(String[] args){
		Test t=new Test(10);
		Test e=new Test('A');
	}
}
