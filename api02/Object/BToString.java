package api02.Object;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 3.
 * @내용 : api - String ( ToString )
 */

// 내 소스 안으로 들어올 때 String으로 바꾸는 법 : parseInt
// 내 소스 밖으로 보낼 때 String으로 바꾸는 법 : toString ( 자료형 class로 바꿔야 함 ! )


public class BToString {
	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		String str = a.toString();
		System.out.println("정수형을 문자열로:" + str);
		
		Float b = new Float(22.5f); //api class
		String bStr = b.toString();
		System.out.println("실수형을 문자열로:" + bStr);
		
		//------------------------------------------------
		
		BSmartPhone phone = new BSmartPhone("구글", "안드로이드");
		String sPhone = phone.toString();
		System.out.println(sPhone);
	}

}
