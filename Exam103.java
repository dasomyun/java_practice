package ch08;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : �̱��� ( Singleton Pattern )
 * 		   1) ��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ��� ��� 
 * 		   2) �� �ϳ��� �����ȴ��ؼ� �� ��ü�� �̱����̶�� �Ѵ� 
 * 		   3) �̱����� ������� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ� �Ѵ� 
 * 		   4) �����ڸ� �ܺο��� ȣ���� �� ������ �Ϸ��� ������ �տ� private ���������ڸ� �ٿ��ش�
 */

class BBB {
	//���� �ʵ带 �ϳ� �����ϰ� �ڽ��� ��ü�� �����ؼ� �ʱ�ȭ�Ѵ�

	private static BBB b = new BBB (); //�̱���
	
	private BBB(){ }	// ����Ʈ ������ 3)
	
	public static BBB getInstance() {
		return b;
	}
	
	public void disp() {
		System.out.println("�̱���....");
	}
}

public class Exam103 {
	public static void main(String[] args) {
		
		BBB x = BBB.getInstance();
		x.disp();
		
		BBB y = BBB.getInstance();
		y.disp();
		
		BBB z = BBB.getInstance();
		z.disp();
		
		
		//�ּҰ� �� ��Ʈ��, �迭�� ���ҽ� ==�� ���ϸ� �ּҰ��� ���ϴ� ���̴�. �̞j�� ���ϸ� �ȵȴ�.
//		if(a==b){
//			System.out.println("����");
//		} else {
//			System.out.println("�ٸ���");
//		}
//		System.out.println("\n\n");
//		
//		if(a==c) {
//			System.out.println("����");
//		} else {
//			System.out.println("�ٸ���");
//		}
		
	}

}
