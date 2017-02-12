package api12.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author : ���ټ�
 * @date : 2017. 2. 9.
 * @description :  HashSet;
 * 					�ߺ��� �ȵ� , 
 */

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		
		set.add("apple");
		set.add("banana");
		set.add("strawberry");
		set.add("apple");//�ߺ��� ������ �ƴ����� �������
		
		//�޸𸮴� ������� ������� �ʴ´�
		System.out.println(set + "\n");//���������� toStirng ���� �������� class�� �ȵ�
		
		//�����
		set.remove("apple");//Object �� �ִ´�
		System.out.println(set + "\n");
		
		//��ü����
		set.clear();
		System.out.println(set.size() + "\n\n");
		
		HashSet<Object> objectSet = new HashSet<Object>();
		
		objectSet.add(10); //autoBoxing  Integer Class�� �ٲ��
		objectSet.add(24.5f);//autoBoxing  Float Class�� �ٲ��
		objectSet.add("apple");
		
		//Set�� Iterator�� ���ؼ� �̰��� ���� ����Ѵ�
		//Iterator �ݺ��� �����͸� ���������� �����Ѵ�  ...(�ڷᱸ�� ����)
		Iterator<Object> iter = objectSet.iterator();//ù��°�� ����
		while(iter.hasNext()){
			System.out.println(iter.next() + "\t");
		}
		System.out.println("\n\n");
		
		//ArrayList�� Iterator ��� ����
		//Collection�� ��ġ�� ù��° ���� �̾� ���� ��
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
