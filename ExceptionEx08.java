package ch10.exception;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : 에러발생 - 내 프로그램 로직 상 에러지만, 컴파일에선 에러가 아닌 경우 에러를 만들어준다 , throw
 */
import java.util.Scanner;

public class ExceptionEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//su = 10 이면 임의로 에러발생
		
		try {
			System.out.print("수를 입력하세요 (10을 입력하시면 안됩니다) : ");
			int su = sc.nextInt();
			
			if(su==10) {
				// 에러발생 throw
				NumberFormatException nfe = new NumberFormatException("/ by 10");
				throw nfe;
			}
			
			System.out.println("su : " + su );
		} catch (NumberFormatException obj){
			System.out.println("10을 넣으시면 안됩니다");
		} catch (Throwable obj) {							//최상위 클래스의 에러처리는 맨 뒤에 작성 
			System.out.println("숫자를 제대로 입력하세요");
		} finally {
			sc.close();
		}
		
	}

}
