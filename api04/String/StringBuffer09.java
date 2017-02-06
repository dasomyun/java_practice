package api04.String;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 6.
 * @내용 : api - StringBuffer  , StringBuilder 
 * 			insert(), setCharAt(), replace(), deleteCharAt(), delete(), reverse()
 */

public class StringBuffer09 {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer(" ** JAVA");
		System.out.println("Str : " + str);
		
		str.insert(3, "GOOD");
		System.out.println("문자 삽입 : " + str); 	//원본 데이터 영향줌
		
		str.setCharAt(1,'#');	
		System.out.println("문자 치환 : " + str);  //원본 데이터 영향줌
		
		str.replace(3, 7, "LOVE");
		System.out.println("문자열 치환 : " + str);  //원본 데이터 영향줌
		
		str.deleteCharAt(1);
		System.out.println("문자열 삭제 : " + str);
		
		str.delete(7, 11); 	//7번지부터 11번지 전 즉 7번지 ~ 10번지
		System.out.println("문자열 삭제 : " + str);
		
		str.reverse();
		System.out.println("문자열 역순 출력 : " + str);
		
		
	}

}
