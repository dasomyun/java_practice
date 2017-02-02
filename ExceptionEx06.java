package ch10.exception;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : 에러처리 (finally) - NumberFormatException , ArithmeticException , ArrayIndexOutOfBoundsException
 */

public class ExceptionEx06 {
	public static void main(String[] args) {
		
		try {
			
			int su = Integer.parseInt(args[0]);
			int value = Integer.parseInt(args[1]);
			
			int div = su/value;
			System.out.println("div : " + div);
			
			// 디테일
			
		} catch (NumberFormatException dbj) {
			System.out.println("숫자만 입력하세요");
		} catch (ArithmeticException obj){
			System.out.println("0으로 나눌 수 없습니다");
		} catch (ArrayIndexOutOfBoundsException obj) {
			System.out.println("배열수의 수를 잘못 입력하셨습니다");
		} finally {													// network입출력 , db , 파일 입출력시 close 써주는 자리
			System.out.println("모든 예외처리를 끝냈습니다");		// error가 나지 않아도 무.조.건 실행됨
		}
		
		System.out.println("END");
		
	}

}
