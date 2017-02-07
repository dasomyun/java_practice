package api06.Wrapper;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 7.
 * @내용 : boxing , unBoxing의 equals()
 */

public class CEquals {

	public static void main(String[] args) {
		
		Integer o = 300;
		Integer b = 300;
		System.out.println(o==b);
		System.out.println(o.intValue() == b.intValue());
		System.out.println(o.equals(b) + "\n");
		
		Integer x = 10;
		Integer y = 10;	// y = x
		System.out.println(x == y);	// -128~+127 미만인 경우 주소 공유로 데이터값 가짐 
		System.out.println(x.intValue() == y.intValue());
		System.out.println(x.equals(y) + "\n");
		
		
	}

}
