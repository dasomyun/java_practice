package thread03.Join;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 15.
 * @���� : Join : �ٸ� �������� ���Ḧ ��ٸ�
				��� �۾��� �ϴ� �����尡 ��� ��� �۾��� ������ ��, ��� ������� �޾� �ַ� ���
 */

public class Ex {
	public static void main(String[] args) {
		
		Sum sum = new Sum();
		sum.start();
		
		// Sum Thread�� ���� �Ҷ� ���� ���� ������� �Ͻ� �����ض� 
		try {
			sum.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1���� 100������ �� : " + sum.getSum());

	
	}
}
