package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : ��ø Ŭ���� - Ŭ���� ���ο� �� �ٸ� Ŭ���� ���� ( static ) 
 */

class Sub{
	private int su=10;
	private static int volum=20;//static�� static�� ������ ����
	private final int TEMP=50;//----------���ġȯ �ȵ�-----------
	private static final int IMSI=70;//-------------------------final ���
	
	public void aa(){}
	public void bb(){}
	public static final void cc(){}
	public final void dd(){}
	
	class C{ //��øŬ������ �ڽ��� Ŭ���� �ȿ��� static�ʵ�� �޼ҵ带 �������� ���Ѵ�
		//������øŬ������ �ڽ��� Ŭ���� �ȿ��� static ���� ����
		private int a=10;
		//private static int b=20;  
		private final int C=30;
		private static final int D=40;
		
		public void XX(){}
		//public static void YY(){}
		//public final ZZ(){}
		//public static final void KK(){}
		
		
		public void disp(){
			su=77;
			volum=11;
			System.out.println(TEMP);
			System.out.println(IMSI);
			
			aa();
			bb();
			cc();
			dd();
			
		}
	}
}

public class Inner04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		Sub.C c = sub.new C();
		c.disp();

	}
}

//��ø Ŭ������ �ڽ��� Ŭ���� �ȿ� static �ʵ�, �޼ҵ带 �������� ���Ѵ� 