package api02.Object;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 3.
 * @내용 : api - String ( equal )
 */

public class AEqualsMain {
	public static void main(String[] args) {
		// 같은 주소값 공유
		String str1 = "apple";	
		String str2 = "apple";
		
		//서로 다른 주소값 생성
		String str3 = new String("banana");
		String str4 = new String("banana");
		
		//string은 데이터값이 아닌 주소값을 비교 (0x100 , 0x200을 비교) 
		if(str1 == str2) 
			System.out.println("T");
		else 
			System.out.println("F");
		
		if(str3 == str4) 
			System.out.println("T");
		else 
			System.out.println("F");
	
		// 주소값이 가르키고 있는 곳의 값을 비교 
		if(str1.equals(str2)) 
			System.out.println("T");
		else
			System.out.println("F");
		
		if(str3.equals(str4)) 
			System.out.println("T");
		else
			System.out.println("F");
		
		System.out.println("----------------");
		
		AMember kim = new AMember("abc123");
		AMember park = new AMember("abc123");
		
		if(kim == park) 	//주소값 비교 
			System.out.println("T");
		else 
			System.out.println("F");
		
		if(kim.equals(park))
			System.out.println("T");
		else
			System.out.println("F");

		//kim.equals(park);	
		//this : kim, obj : park
		
		if(kim.equals(park)) 	
			System.out.println("T");
		else 
			System.out.println("F");
		
		if(kim.equals(park))
			System.out.println("T");
		else
			System.out.println("F");

		//AMmeber 클래스에 오버라이딩을 작성하니 결과값이 T로 변함 
	}
}
