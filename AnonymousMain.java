package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 익명 구현 클래스 메인 
 */
//객체 생성 선언과 동시에 오버라이딩 처리 ( 한번 쓰고버릴때 사용 )

public class AnonymousMain {

	public static void main(String[] args) {
		AnonymousPerson anon = new AnonymousPerson();
		anon.wake();
		
		//익명 구현 클레스  //여기서 선언한 필드는 다 final
		AnonymousPerson person = new AnonymousPerson() {
			public void wake() {
				System.out.println("재 정의 오늘 못일어났습니다");
			}
		
		};
		person.wake();
		System.out.print("=======================\n");
		
		Anonymous anonymous = new Anonymous();
		anonymous.method();
		anonymous.field.wake();
		
	}

}
