package thread09.Notify;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 15.
 * @���� : ����ȭ ( Synchronized ) , Notify
 */

public class Ex {

	public static void main(String[] args) {
		
		WorkObject workObject = new WorkObject();
		
		A a = new A(workObject);
		a.setName("a ��ü : ");
		
//		A b = new A(workObject);
//		b.setName("b ��ü : ");
		
		B c = new B(workObject);
		c.setName("c ��ü : ");
		
//		B d = new B(workObject);
//		d.setName("d ��ü : ");
		
		a.start();
//		b.start();
		c.start();
//		d.start();
		
	}

}
