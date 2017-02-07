package api06.Wrapper;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 7.
 * @내용 : Boxing , UnBoxing
 * 			Wrapper는 기본타입(자료형) 값을 포장하는 것을 지칭한다. 즉 기본타입을 클래스로 제공한다.
 */

public class ABoxing {

	public static void main(String[] args) {
		
		// 박싱 (Boxing) : 기본 자료형을 객체로 만드는 과정
		int su = 100;
		
		Integer obj1 = new Integer(su);
		Integer obj2 = Integer.valueOf(su);
		System.out.println(obj1.toString() + "\t" + obj1);
		System.out.println(obj2.toString() + "\t" + obj2);
		
		// 언박싱 (UnBoxing) : 객체를 기본자료형으로 만드는 과정 
		Integer obj3 = new Integer(500);
		int value = obj3.intValue();
		System.out.println("value : " + value);
		
	}

}
