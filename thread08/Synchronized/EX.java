package thread08.Synchronized;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 15.
 * @���� : ����ȭ ( Synchronized ) : �ѹ��� �ϳ��� �����常 ������ �� �ִ� 
 */

public class EX {

	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		
		Family father = new Family(toilet);
		father.setName("�ƹ���");
		father.start();
		
		Family mother = new Family(toilet);
		mother.setName("��Ӵ�");
		mother.start();
		
		Family sister = new Family(toilet);
		sister.setName("����");
		sister.start();
		
		Family brother = new Family(toilet);
		brother.setName("��");
		brother.start();
		
		Family me = new Family(toilet);
		me.setName("��");
		me.start();
		
	}

}
