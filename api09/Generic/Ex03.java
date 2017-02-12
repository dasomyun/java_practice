package api09.Generic;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 8.
 * @내용 : 제네릭 Generic
 */

class Product<T, E> {
	private T kind;
	private E model;
	
	public T getKind() {
		return kind;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public E getModel() {
		return model;
	}
	
	public void setModel(E model) {
		this.model = model;
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Product <Integer, String> p = new Product<Integer , String>(); 
		
		p.setKind(10);
		p.setModel("TV");
		
		int i = p.getKind();
		String s = p.getModel();
		
		System.out.println("i : " + i);
		System.out.println("s : " + s);
		
	}

}


/*
	p.setKind(new Integer(10));	// Auto Boxing
	p.setModel(new String("TV"));	// String 이렇게 사용 가능 
	
	Integer i = p.getKind(); // Auto UnBoxing
	String s = p.getModel();
	
	System.out.println("i : " + i.intValue());
	System.out.println("s : " + s.toString()); // toString() 생략가능 
*/
