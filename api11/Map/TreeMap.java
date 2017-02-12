package api11.Map;

import java.util.Map;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 10.
 * @내용 : TreeMap : 검색 기능을 강화시킨 컬렉션 , 정렬이 쉬움
 * 			1. 이진트리 구조 
 * 			1-1) 부모노드와 자식노드로 구성
 * 			1-2) 왼쪽 자식 노드는 부모보다 작은 값
 * 			1-3) 오른쪽 자식 노드는 부모 보다 큰 값  
 */
import java.util.TreeMap;

public class TreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		
		scores.put(85, "홍길동");
		scores.put(75, "이동수");
		scores.put(95, "이영자");
		scores.put(80, "조인성");
		scores.put(89, "홍길동");
		
		Map.Entry<Integer , String> first = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + first.getKey() + first.getValue());	// 노드의 마지막 왼쪽
		
		Map.Entry<Integer , String> last = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + last.getKey() + last.getValue()); 		// 노드의 마지막 오른쪽
		
		Map.Entry<Integer,String> entry = null;
		entry = scores.lowerEntry(85);
		System.out.println("85점 아래 점수 : " + entry.getKey() + "\t" + entry.getValue());
		
		entry = scores.higherEntry(85);
		System.out.println("85점 위 점수 : " + entry.getKey() + "\t" + entry.getValue());
		
		
		// 85점 포함 
		entry = scores.floorEntry(85);
		System.out.println("85점이거나 아래 점수 : " + entry.getKey() + "\t" + entry.getValue());
		
		entry = scores.cilingEntry(85);
		System.out.println("85점 이거나 위 점수 : " + entry.getKey() + "\t" + entry.getValue());
		
		// 오름차순 : 왼쪽노드 - 부모노드 - 오른쪽노드
		// 내림차순 : 오른쪽노드 - 부모노드 - 왼쪽노드
		
		while(!scores.isEmpty()) {
			//entry = scores.pollFirstEntry();	// 오름차순
			entry = scores.pollLastEntry(); 	// 내림차순
			System.out.println(entry.getValue() + " " + entry.getKey() + " " + scores.size());
		}
		
		
		
		
		
	}

}
