package api10.List;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 8.
 * @���� : Collection --> List --> ArrayList
 * 			ArrayList�� Ư¡ : ������ �����ϰ� ����, �ߺ��� ��� 
 */
// �迭�� �ٸ��� : �߰�, ����, ��ü�� ����

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
		
		int size = list.size(); // �迭�� length()
		System.out.println("����� �� ��ü �� : " + size);
		
		String str = list.get(2);
		System.out.println("2���� �ε����� ��ü ��� : " + str);
		
		for(int i=0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.print(s + "\t");
		}
		
		System.out.println();
		
		System.out.println(list + "\n\n"); // toString�� ���� �����ϴ� ���������� list.toString() ���ǵǾ� ����
		
		//�߰� ( �� ������ ������ �߰�, Ư�� ������ �߰� )
		list.add("���");
		System.out.println("�߰� : " + list);
		
		list.add(1 , "�ٳ���");
		System.out.println("�߰� : " + list);
		
		// ��ü
		list.set(3,  "�ȳ��ϼ���");
		System.out.println("�߰� : " + list);
		
		// ����
		list.remove(0);
		System.out.println("���� : " + list +"\n");
		
		// ���� ( �������� , �������� )
		Collections.sort(list);
		System.out.println("���� : " + list);
		
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
