package ch10.exception;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : 에러처리 - ArrayIndexOutOfBoundsException
 */

public class ExceptionEx03 {	// kim park lee를 넣어도 lee를 안받으면 그만이다. 에러X 	// kim만 넣으면 에러O
	
	public static void main(String[] args) {	
		
		try {
			String s = args[0];
			String t = args[1];
			
			System.out.println("첫번째 배열 값 : " + s);
			System.out.println("두번째 배열 값 : " + t);
		} catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("배열 수가 틀립니다.");
		}
	}
}

// 에러 나면 catch 구문으로 감 