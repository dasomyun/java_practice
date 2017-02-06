package api04.String;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 6.
 * @내용 : api - String 클래스
 * 				equals() , toLowerCase() , toUpperCase() , equalsIgnoreCase()
 */

public class String02 {
	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		System.out.println("주소값 비교 : " + (a==b));	// T 
		System.out.println("데이터 비교 : " + a.equals(b));
		
		String x = new String("hi");
		String y = new String("hi");
		System.out.println("주소값 비교: " + (x==y));	// F
		System.out.println("데이터 비교: " + x.equals(y));
		System.out.println("\n\n");
		
		String s = new String("banana");
		String t = new String("BANANA");
		System.out.println("대소문자 구분 : " + s.equals(t));
		System.out.println("대소문자 구분안함 : " + s.equalsIgnoreCase(t));
		
		String original = "java Programing";
		String lower = original.toLowerCase();
		String upper = original.toUpperCase();
		System.out.println("소문자 : " + lower);
		System.out.println("대문자 : " + upper);
		System.out.println("원본 데이터 : " + original);
		
		
		
	}

}
