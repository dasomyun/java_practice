package ch10.exception;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : 에러처리 - Throwable , Exception
 */

public class ExceptionEx07 {
	public static void main(String[] args) {
		
		try {
			
			int su = Integer.parseInt(args[0]);
			int value = Integer.parseInt(args[1]);
			
			int div = su/value;
			System.out.println("div : " + div);
			
		} catch (Throwable obj) {	// obj를 찍으면 무슨 에러인지 나옵니다
			System.out.println("수 입력을 정확히 확인하세요 ");
		}
		
//		} catch (Exception obj) {	 	// 이것도 가능
//			System.out.println("수 입력을 정확히 확인하세요 ");
//		}
		
		System.out.println("END");
		
	}

}
