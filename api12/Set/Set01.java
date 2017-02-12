package api12.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author : 윤다솜
 * @date : 2017. 2. 9.
 * @description :  HashSet;
 * 					중복값 안됨 , 
 */

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		
		set.add("apple");
		set.add("banana");
		set.add("strawberry");
		set.add("apple");//중복값 에러는 아니지만 덮어써짐
		
		//메모리는 순서대로 저장되지 않는다
		System.out.println(set + "\n");//내부적으로 toStirng 지원 내가만든 class는 안됨
		
		//지우기
		set.remove("apple");//Object 를 넣는다
		System.out.println(set + "\n");
		
		//전체비우기
		set.clear();
		System.out.println(set.size() + "\n\n");
		
		HashSet<Object> objectSet = new HashSet<Object>();
		
		objectSet.add(10); //autoBoxing  Integer Class로 바뀐다
		objectSet.add(24.5f);//autoBoxing  Float Class로 바뀐다
		objectSet.add("apple");
		
		//Set은 Iterator가 편해서 이것을 많이 사용한다
		//Iterator 반복자 데이터를 순차적으로 접근한다  ...(자료구조 공부)
		Iterator<Object> iter = objectSet.iterator();//첫번째로 접근
		while(iter.hasNext()){
			System.out.println(iter.next() + "\t");
		}
		System.out.println("\n\n");
		
		//ArrayList도 Iterator 사용 가능
		//Collection에 위치해 첫번째 부터 뽑아 오는 것
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("melon");
		
		Iterator<String> i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
