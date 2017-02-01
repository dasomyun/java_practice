package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 익명 구현 클래스 ( 클래스 안에서의 구현 )
 */
import java.util.Date;
import java.util.Scanner;

public class Anonymous extends Date {
	private int x = 10;
	private Scanner sc = new Scanner(System.in);
	
	public AnonymousPerson field = new AnonymousPerson() {

		@Override
		public void wake() {
			System.out.println("필드 재정의 일어난다");
		}
		
		
	};
	
	public void method() {
		//객체 선언 AnonymousPerson a = new AnonymousPerson();
		AnonymousPerson local = new AnonymousPerson() {
		
			public void wake() {
				System.out.println(x);
				System.out.println("오후 4시에 일어났습니다");
			}
		};
		
		local.wake();
	}

	public void sub() {
		Date d = new Date () {
			
			@Override
			public long getTime() {
				return super.getTime();
			} 
		
			
			
			
			
		
		
		};
	}

}


