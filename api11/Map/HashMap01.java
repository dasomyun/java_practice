package api11.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author : 곽선아
 * @date : 2017. 2. 8.
 * @description : ★★★★★Map --> HashMap  키값으로 저장, 중복저장 안됨(오류는 아니라 덮어써짐) , 순서대로 저장이 안됨
 * 				 key는 보통String  
 * 				추가 삭제 교체 가능한데, 모두  key값으로 추가하면 뒤로 
 */
public class HashMap01 {

	public static void main(String[] args) {

		HashMap< String , String> map = new HashMap<String, String>();
		
		map.put("spring", "봄");
		map.put("summer", "여름");
		//map.put("summer", "선생님");//에러는 아니고, 규칙 위배되어 덮어써진다
		map.put("fall", "가을");
		map.put("winter", "겨울");
		
		String spring = map.get("spring");
		//String summer = map.get("summer");
		System.out.println("key값으로 출력: "+ spring /*+summer*/);
		
		
		//키값을 한꺼번에 처리하여 벨류값 추출
		Set<String> set=map.keySet();
		Iterator<String> iter=set.iterator();
		
		while(iter.hasNext()){
			//System.out.println(iter.next());
			String value=map.get(iter.next());
			System.out.println(value);
		}
		
		System.out.println();
		
		HashMap<Integer, Double> hashMap = new HashMap<Integer, Double> ();
		
		hashMap.put(10, 68.5);//value 중복값 가능
		hashMap.put(20,  88.5);
		hashMap.put(30, 77.9);
		
		Set<Integer> iset = hashMap.keySet();
		Iterator itera = iset.iterator();
		
		while(itera.hasNext()){
			Double su = hashMap.get(itera.next());
			System.out.println(su);
		}
		
		System.out.println();
		
		//삭제
		hashMap.remove(10);
		//추가
		hashMap.put(55,88.8);
		
		itera=hashMap.keySet().iterator();
		while(itera.hasNext()){
			Double su = hashMap.get(itera.next());
			System.out.println(su);
		}
		
		System.out.println();
		
		System.out.println(hashMap.toString());
		
	}

}
