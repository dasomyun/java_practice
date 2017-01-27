package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 24.
 * @내용 : 클래스 - Static 
 */

class TestF {
	private String name ;	//이름
	public int don;		//예금액
	public static float iyul;		//이율 ( 고정금리, 변동금리 ) static은 클래스명으로 접근을 해야한다 , 공유해서 써야 할 때 사용 
	
	public TestF() {
		name = " ";
		don = 0;
		iyul = 0.0f;
		
	}
	
	public TestF(String name, int don, float iyul){
		this();
		this.name = name;
		this.don = don;
		TestF.iyul = iyul;
		
	}
	
	public void setIyul(float iyul) {
		TestF.iyul = iyul;
	}
	
	public void disp() {
		System.out.println("name : " + name );
		System.out.println("don : " + don );
		System.out.println("iyul : " + iyul + "\n");
	}
	
}

public class Exam75 {
	public static void main(String[] args) {
		TestF kim = new TestF("kim" , 100000, 1.5f);
		kim.disp();
		
		TestF park = new TestF("park", 200000, 1.7f);
		park.disp();
		
		TestF lee = new TestF("lee" , 100000, 1.5f);
		lee.disp();
		
		System.out.println("------------------------------");
		
		lee.setIyul(3.5f);
		lee.disp();
		kim.disp();
		park.disp();
		
		kim.setIyul(5.5f);
		lee.disp();
		kim.disp();
		park.disp();
		
		lee.don = 777777;
		// lee.iyul = 77.7f	error 
		TestF.iyul = 55.5f;
	}

}
