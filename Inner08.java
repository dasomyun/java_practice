package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : �͸� ���� Ŭ���� 
 */
//�������̽��� �ڽ��ڽ��� ��ü �����Ұ��� // �͸� ���� Ŭ������ ���� //���� final ���� 

interface Person {
	public void speak();
	public void sleep();
}

public class Inner08 {
	public static void main(String[] args) {
		Person p = new Person() {

			@Override
			public void speak() {
				System.out.println("���� �մϴ�");
			}

			@Override
			public void sleep() {
				System.out.println("�ɾ�ϴ�");
			}
			
		};
		p.speak();
		p.sleep();
	}

}
