package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : ���� ��ø Ŭ���� - �޼ҵ� ������ ���� 
 */


class Banana{
	private int value=10;
	private static int result=20;
	
	public void method(){ // Ŭ������ ������ �ִ� �ɹ����� �ȿ��ٰ� , �ܺο��� ������ �ȵȴ�
		class E{
			private int su=77;
			//private static int imsi=88;
			
			public E(){}
			
			public void disp(){
				value=1;
				result=2;
				su=3;
				System.out.println("hahaha");
			}
		}
		
		//�޼ҵ� �������� ��ü ����
		E e=new E();
		e.disp();
	}
}
public class Inner06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana banana = new Banana();
		banana.method();
	}

}
