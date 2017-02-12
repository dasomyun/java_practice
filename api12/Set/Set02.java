package api12.Set;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

import api10.List.Data;

/**
 * @author : ������
 * @date : 2017. 2. 9.
 * @description :  Set �� class ��������
 */
public class Set02 {

	public static void main(String[] args) {
		//��ü�߻�
		//��Ű���� �ٸ��� ������ import
		Data a = new Data(3,2);
		Data b = new Data(2,3);
		Data c = new Data(4,5);
		
		HashSet<Data> set = new HashSet<Data>();		
		set.add(a);//��������� ����. ��°��� ������� �ȵ�
		set.add(b);
		set.add(c);
		
		Iterator<Data> iter =set.iterator();
		while(iter.hasNext()){
			Data data=iter.next();
			data.yonsan();
			data.disp();
			
			//�˻��ȵ� key, index���� ���� 
			set.remove(a);//����
			set.add(new Data(77,55));//�߰�
			System.out.println(set);
			
		}
		
	}

}
