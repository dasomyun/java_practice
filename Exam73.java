package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 24.
 * @내용 : 클래스 배열
 */

class TestD{
	private int x, y , z;
	
	public TestD(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public TestD() {	//디폴트 생성자 초기화 
		x = 0;
		y = 0;
	}
	
	public void disp(){
		System.out.println( x + "\t" + y + "\t" + z );
	}
	
	public void hap() {
		z = x + y;
	}
}

public class Exam73 {

	public static void main(String[] args) {
		TestD[] array = new TestD[3];
		array[0] = new TestD(10, 20);
		array[1] = new TestD(55, 66);
		array[2] = new TestD(100, 200);

		for(int i=0; i<array.length; i++) {
			array[i].hap();
			array[i].disp();
		}
		
		System.out.println();
		
		TestD x = new TestD(1 , 2);
		TestD y = new TestD(3 , 4);
		TestD z = new TestD(5 , 6);
		
		TestD[] arr = new TestD[] { x, y, z };
		
		for(int i=0; i<arr.length; i++) {
			arr[i].hap();
			arr[i].disp();
		}
		
	}

}
