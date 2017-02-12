package api09.Generic;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 8.
 * @내용 : 제네릭 (Generic) : 자바 5부터 추가된 기능. 컬렛견, 스트림 등에서 널리 사용된다.
 */

// 이런식으로 돌아간다 만 알아도 됨 


class Fruit<T> {	// T = Melon    T는 클래스만 받을 수 있음  , <T> : 타입 파라미터
	private T t;	// Melon = t;
	
	public void setData(T t) {
		this.t = t;
	}
	
	public T getData() {
		return t;
	}
	
} 

class Melon { }
class Orange { } 

public class Ex02 {

	public static void main(String[] args) {
		
		Fruit<Melon> f = new Fruit<Melon>();
		f.setData(new Melon());
		
		Fruit<Orange> g= new Fruit<Orange>();
		g.setData(new Orange());
	
	}

}
