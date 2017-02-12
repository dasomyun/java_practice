package api12.Set;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

import api10.List.Data;

/**
 * @author : 곽선아
 * @date : 2017. 2. 9.
 * @description :  Set 내 class 가져오기
 */
public class Set02 {

	public static void main(String[] args) {
		//객체발생
		//패키지가 다르기 때문에 import
		Data a = new Data(3,2);
		Data b = new Data(2,3);
		Data c = new Data(4,5);
		
		HashSet<Data> set = new HashSet<Data>();		
		set.add(a);//저장공간에 랜덤. 출력값이 순서대로 안됨
		set.add(b);
		set.add(c);
		
		Iterator<Data> iter =set.iterator();
		while(iter.hasNext()){
			Data data=iter.next();
			data.yonsan();
			data.disp();
			
			//검색안됨 key, index값이 없다 
			set.remove(a);//제거
			set.add(new Data(77,55));//추가
			System.out.println(set);
			
		}
		
	}

}
