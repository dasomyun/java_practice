package api10.List;

import java.util.Vector;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 8.
 * @내용 : Vector 
 * 			arrayList와 차이점 : 멀티스레드 지원
 */

public class Vector01 {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<Integer>();
		//vec.add(new Integer(10)); boxing
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		System.out.println("해당 객체 얻어오기 : " + vec.get(2));
		
		for(int i=0; i<vec.size(); i++) {
			int su = vec.get(i);
			System.out.print(su + "\t");
		}
		
		vec.add(55);
		vec.add(2, 77);
		vec.set(1, 99);
		vec.remove(4);
		
		System.out.println("\n" + vec);

	}

}
