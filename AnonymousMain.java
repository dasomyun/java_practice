package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : �͸� ���� Ŭ���� ���� 
 */
//��ü ���� ����� ���ÿ� �������̵� ó�� ( �ѹ� ��������� ��� )

public class AnonymousMain {

	public static void main(String[] args) {
		AnonymousPerson anon = new AnonymousPerson();
		anon.wake();
		
		//�͸� ���� Ŭ����  //���⼭ ������ �ʵ�� �� final
		AnonymousPerson person = new AnonymousPerson() {
			public void wake() {
				System.out.println("�� ���� ���� ���Ͼ���ϴ�");
			}
		
		};
		person.wake();
		System.out.print("=======================\n");
		
		Anonymous anonymous = new Anonymous();
		anonymous.method();
		anonymous.field.wake();
		
	}

}
