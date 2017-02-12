package api10.List;

import java.util.Vector;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 8.
 * @내용 : Vector 
 */
public class Vector02 {

	public static void main(String[] args) {
		Vector<Data> vec = new Vector<Data>();
		vec.add(new Data(1,2));
		vec.add(new Data(3,4));
		vec.add(new Data(5,6));
		 
		for(int i=0; i<vec.size(); i++) {
			Data data = vec.get(i);
			data.yonsan();
			data.disp();
		}
		
		vec.add(new Data(77, 88));
		vec.add(1 , new Data(99,100));
		vec.set(3 , new Data(55,66));
		vec.remove(0);
		System.out.println("\n\n" + vec);
	}

}
