package api10.List;

import java.util.Vector;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 8.
 * @���� : Vector 
 * 			arrayList�� ������ : ��Ƽ������ ����
 */

public class Vector01 {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<Integer>();
		//vec.add(new Integer(10)); boxing
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		System.out.println("�ش� ��ü ������ : " + vec.get(2));
		
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
