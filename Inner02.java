package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : ��ø Ŭ���� - Ŭ���� ���ο� �� �ٸ� Ŭ���� ����
 */

class Out {
	private String str = "�ȳ��ϼ���" ;
	
	public void method() {
		System.out.println("str : " + str);
	}
	
	class In {
		private String str = "HI";
		
		public void method() {
			System.out.println("�ݰ�����");
		}
		
		//�ؿ������� �˾Ƶα� . �������� ���� �� . �ȵ���̵忡�� ���� �� 
		public void disp() {
			System.out.println(this.str);
			this.method();
			
			System.out.println("\n" + Out.this.str);
			Out.this.method();
		}
	}
}

public class Inner02 {

	public static void main(String[] args) {
		Out out = new Out();
		Out.In in = out.new In();
		in.disp();
	}

}
