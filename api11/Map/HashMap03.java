package api11.Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import api10.List.Data;

/**
 * @author : 곽선아
 * @date : 2017. 2. 9.
 * @description : 지각해서 ......다시해야해요
 */
public class HashMap03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		  map.put("one", 10);
		  map.put("two", 20);
	      map.put("three", 30);
		  map.put("four", 40);
		
		Data data = map.get("one");
		data.yonsan();
		data.disp();
		System.out.println("\n\n");
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()){
			Data obj = map.get(iter.next());
			obj.yonsan();
			obj.disp();	
		}
		
		map.remove("one");
		map.put("four",new Data(70,80));
		map.put("two", new Data(1,2));
		System.out.println("\n" + map);
		
		
	}

}
