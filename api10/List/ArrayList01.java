package api10.List;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 8.
 * @내용 : Collection --> List --> ArrayList
 * 			ArrayList의 특징 : 순서를 유지하고 저장, 중복값 허용 
 */
// 배열과 다른점 : 추가, 삭제, 교체가 가능

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		// list.add(new String ("java"));
		list.add("Java");
		list.add("Oracle");
		list.add("JSP");
		list.add("HTML");
		list.add("CSS");
		
		int size = list.size(); // 배열은 length()
		System.out.println("저장된 총 객체 수 : " + size);
		
		String str = list.get(2);
		System.out.println("2번지 인덱스의 객체 얻기 : " + str);
		
		for(int i=0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.print(s + "\t");
		}
		
		System.out.println();
		
		System.out.println(list + "\n\n"); // toString은 생략 가능하다 내부적으로 list.toString() 정의되어 있음
		
		//추가 ( 맨 마지막 번지에 추가, 특정 번지에 추가 )
		list.add("사과");
		System.out.println("추가 : " + list);
		
		list.add(1 , "바나나");
		System.out.println("추가 : " + list);
		
		// 교체
		list.set(3,  "안녕하세요");
		System.out.println("추가 : " + list);
		
		// 삭제
		list.remove(0);
		System.out.println("삭제 : " + list +"\n");
		
		// 정렬 ( 오름차순 , 내림차순 )
		Collections.sort(list);
		System.out.println("정렬 : " + list);
		
		for(int i=(list.size()-1); i>=0; i--)
			System.out.print(list.get(i) + "\t");
		
		
		ArrayList<Integer> iList = new ArrayList<Integer>();
		iList.add(10); 	//unboxing
		iList.add(20);
		
		ArrayList<Double> dList = new ArrayList<Double>();
		dList.add(55.5);  // dList.add(new Double(55.5));
		dList.add(66.6);
		
		
		
		
		
		
		
		
		
	}

}
