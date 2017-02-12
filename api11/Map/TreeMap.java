package api11.Map;

import java.util.Map;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 10.
 * @���� : TreeMap : �˻� ����� ��ȭ��Ų �÷��� , ������ ����
 * 			1. ����Ʈ�� ���� 
 * 			1-1) �θ���� �ڽĳ��� ����
 * 			1-2) ���� �ڽ� ���� �θ𺸴� ���� ��
 * 			1-3) ������ �ڽ� ���� �θ� ���� ū ��  
 */
import java.util.TreeMap;

public class TreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		
		scores.put(85, "ȫ�浿");
		scores.put(75, "�̵���");
		scores.put(95, "�̿���");
		scores.put(80, "���μ�");
		scores.put(89, "ȫ�浿");
		
		Map.Entry<Integer , String> first = scores.firstEntry();
		System.out.println("���� ���� ���� : " + first.getKey() + first.getValue());	// ����� ������ ����
		
		Map.Entry<Integer , String> last = scores.lastEntry();
		System.out.println("���� ���� ���� : " + last.getKey() + last.getValue()); 		// ����� ������ ������
		
		Map.Entry<Integer,String> entry = null;
		entry = scores.lowerEntry(85);
		System.out.println("85�� �Ʒ� ���� : " + entry.getKey() + "\t" + entry.getValue());
		
		entry = scores.higherEntry(85);
		System.out.println("85�� �� ���� : " + entry.getKey() + "\t" + entry.getValue());
		
		
		// 85�� ���� 
		entry = scores.floorEntry(85);
		System.out.println("85���̰ų� �Ʒ� ���� : " + entry.getKey() + "\t" + entry.getValue());
		
		entry = scores.cilingEntry(85);
		System.out.println("85�� �̰ų� �� ���� : " + entry.getKey() + "\t" + entry.getValue());
		
		// �������� : ���ʳ�� - �θ��� - �����ʳ��
		// �������� : �����ʳ�� - �θ��� - ���ʳ��
		
		while(!scores.isEmpty()) {
			//entry = scores.pollFirstEntry();	// ��������
			entry = scores.pollLastEntry(); 	// ��������
			System.out.println(entry.getValue() + " " + entry.getKey() + " " + scores.size());
		}
		
		
		
		
		
	}

}
