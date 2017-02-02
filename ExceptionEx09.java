package ch10.exception;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : 예외전가 : throws exception 클래스 
 */
// 에러 처리를 메인에서나 클래스에서 무조건 해줘야 한다 (안하면 컴파일러에게 전가되서 컴파일러가 에러찍음)
import java.io.InputStream;
import java.io.IOException;

class AA {
	public void sub() throws Exception {
		RuntimeException re = new RuntimeException("sub 함수 호출");
		throw re;
	}
	
	public void fun() {
		System.out.println("Fun 함수 입니다");
	}
	
}

public class ExceptionEx09 {

	public static void main(String[] args) {	//throws Exception : 컴파일러에게 전가 
		AA a = new AA ();
		try {
			a.sub();	
			a.fun();
		} catch (Exception e) {
			System.out.println("함수 에러");
		}
		
		System.out.println("\n\n");

		System.out.println("문자 입력 :");
		// InputStream is = System.in;
		try {
		//	int x = is.read();	// 에러를 가지고 있음 
		//	char ch = (char)x;
		//	System.out.println(x +"\t" + ch);
			
			char ch = (char) System.in.read();
			System.out.println(ch);
			
		} catch (IOException e) {
			System.out.println("문자 입력 ");
		}
	}

}


/*
class AA {
	public void sub() {
		try{
			RuntimeException re = new RuntimeException("sub 함수 호출");
			throw re;
		} catch (RuntimeException obj) {
			System.out.println("함수 호출 하면 안돼!");
		}
	}
	
	public void fun() {
		System.out.println("Fun 함수 입니다");
	}
	
}

public class ExceptionEx09 {

	public static void main(String[] args) {
		AA a = new AA ();
		a.sub();
		a.fun();
	}

}
*/
