package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : ���� ��ø Ŭ���� - static Ű���带 ���� Ŭ������ �����Ѵ� 
 */

class Apple{
	private int su=10;
	private static int value=20;
	
	static class D{// Ŭ���� �տ� static�� �ٿ��ָ� ����Ŭ�������� static�� ������ �� �ִ�
		private int x=77;
		private static int y=88;
		
		public void disp(){
		//	su=10;//static ������ ������ ����.  outer Ŭ���� static �ɹ��ʵ�, �Լ��� ����Ѵ�
			value=30;
			System.out.println(x +"\t" + y);
			
		}
	}
}

public class Inner05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple.D d = new Apple.D();
		d.disp();
		
	}

}