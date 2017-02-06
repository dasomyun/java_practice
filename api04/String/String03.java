package api04.String;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 6.
 * @내용 : api - String 클래스
 * 				replace() , substring() , trim(), 
 * 				문자열을 기본자료형으로 변환방법 ( Scanner, parseInt() ) , 기본자료형을 문자열로 변환방법( toString(), valueOf() )
 */
// 뷰단 , 자바단, 디비 에서 해결해야 할 것은 각각의 위치에서 해결해주기 

import java.util.Scanner;

public class String03 {
	public static void main(String[] args) {
		String str1 = "자바는 객체지향 언어 입니다";
		String str2 = str1.replace("자바" , "JAVA");
		System.out.println("str2 : " + str2);
		System.out.println("str1: " + str1);
		
		String str3 = "How are you?";
		System.out.println("문자열 추출 : " + str3.substring(2));
		System.out.println("문자열 추출 : " + str3.substring(2,9));	// 2번지부터 시작~ 9번지 전까지 출력 (즉 2~8)
		System.out.println(str3 + "\n\n");
		
		String str4 = "     자바   프로그램    ";
		System.out.println("str4 : " + str4);
		System.out.println("앞뒤 공백제거 : " + str4.trim());
		
		System.out.println("\n\n");
		
		System.out.println("문자열을 기본자료형으로 변환");
		Scanner sc = new Scanner("10");		// 키보드 입력 
		int su = sc.nextInt();
		
		int value = Integer.parseInt("20");		//실무에서는 이거 쓰기 
		System.out.println("su : " + ++su);
		System.out.println("value : " + ++value);
		
		sc.close();
		
		System.out.println("기본자료형을 문자열로 변환");
		
		int a = 10;
		Integer ia = new Integer(a);
		String istr = ia.toString();
		System.out.println("istr : " + istr);
		
		float b= 24.5f;
		Float fb = new Float(b);
		String fstr = fb.toString();
		System.out.println("fstr : " + fstr);
		
		String ival = String.valueOf(10);	//실무에서는 이거 쓰기
		String fval = String.valueOf(24.5f);
		String tval = String.valueOf(true);
		System.out.println(ival + "\t" + fval + "\t" + tval);
		
	}
}
