package api04.String;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 6.
 * @내용 : api - StringBuffer  , StringBuilder
 * 			String 클래스에 비해서 속도가 빠르면, 많은 문제열 처리 적합 
 */

public class StringBuffer08 {

	public static void main(String[] args) {
		
		String s1 = "새천년";
		String s2 = "새천년";
		// 같은 공간 공유
		
		String s3 = "대한민국";
		System.out.println("s1 : " + s1.hashCode() + "\t" + s1);
		System.out.println("s2 : " + s2.hashCode() + "\t" + s2);
		System.out.println("s3 : " + s3.hashCode() + "\t" + s3);
		
		s1 = s1+s3;
		System.out.println("s1 : " + s1.hashCode() + "\t" + s1);

		System.out.println("\n\n");
		
		StringBuffer a = new StringBuffer("우리나라");
		StringBuffer b = new StringBuffer("대한민국");
		System.out.println(a.hashCode() + "\t" + a);
		System.out.println(b.hashCode() + "\t" + b);
		
		a.append(b);
		a.append("좋은나라");
		a.append("월요일은 싫어");
		a.append("금요일은 좋아");
		
		System.out.println(a.hashCode() + "\t" + a);
		
		
		
	}

}
