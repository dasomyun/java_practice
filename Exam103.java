package ch08;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 싱글톤 ( Singleton Pattern )
 * 		   1) 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우 사용 
 * 		   2) 단 하나만 생성된다해서 이 객체를 싱글톤이라고 한다 
 * 		   3) 싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 한다 
 * 		   4) 생성자를 외부에서 호출할 수 없도록 하려면 생성자 앞에 private 접근제한자를 붙여준다
 */

class BBB {
	//정적 필드를 하나 선언하고 자신의 객체를 생성해서 초기화한다

	private static BBB b = new BBB (); //싱글톤
	
	private BBB(){ }	// 디폴트 생성자 3)
	
	public static BBB getInstance() {
		return b;
	}
	
	public void disp() {
		System.out.println("싱글톤....");
	}
}

public class Exam103 {
	public static void main(String[] args) {
		
		BBB x = BBB.getInstance();
		x.disp();
		
		BBB y = BBB.getInstance();
		y.disp();
		
		BBB z = BBB.getInstance();
		z.disp();
		
		
		//주소값 비교 스트링, 배열을 비교할시 ==로 비교하면 주소값을 비교하는 것이다. 이엏게 비교하면 안된다.
//		if(a==b){
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
//		System.out.println("\n\n");
//		
//		if(a==c) {
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
		
	}

}
