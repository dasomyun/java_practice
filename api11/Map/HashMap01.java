package api11.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author : ������
 * @date : 2017. 2. 8.
 * @description : �ڡڡڡڡ�Map --> HashMap  Ű������ ����, �ߺ����� �ȵ�(������ �ƴ϶� �������) , ������� ������ �ȵ�
 * 				 key�� ����String  
 * 				�߰� ���� ��ü �����ѵ�, ���  key������ �߰��ϸ� �ڷ� 
 */
public class HashMap01 {

	public static void main(String[] args) {

		HashMap< String , String> map = new HashMap<String, String>();
		
		map.put("spring", "��");
		map.put("summer", "����");
		//map.put("summer", "������");//������ �ƴϰ�, ��Ģ ����Ǿ� ���������
		map.put("fall", "����");
		map.put("winter", "�ܿ�");
		
		String spring = map.get("spring");
		//String summer = map.get("summer");
		System.out.println("key������ ���: "+ spring /*+summer*/);
		
		
		//Ű���� �Ѳ����� ó���Ͽ� ������ ����
		Set<String> set=map.keySet();
		Iterator<String> iter=set.iterator();
		
		while(iter.hasNext()){
			//System.out.println(iter.next());
			String value=map.get(iter.next());
			System.out.println(value);
		}
		
		System.out.println();
		
		HashMap<Integer, Double> hashMap = new HashMap<Integer, Double> ();
		
		hashMap.put(10, 68.5);//value �ߺ��� ����
		hashMap.put(20,  88.5);
		hashMap.put(30, 77.9);
		
		Set<Integer> iset = hashMap.keySet();
		Iterator itera = iset.iterator();
		
		while(itera.hasNext()){
			Double su = hashMap.get(itera.next());
			System.out.println(su);
		}
		
		System.out.println();
		
		//����
		hashMap.remove(10);
		//�߰�
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
