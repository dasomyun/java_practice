package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : �͸� ���� Ŭ���� ( Ŭ���� �ȿ����� ���� )
 */
import java.util.Date;
import java.util.Scanner;

public class Anonymous extends Date {
	private int x = 10;
	private Scanner sc = new Scanner(System.in);
	
	public AnonymousPerson field = new AnonymousPerson() {

		@Override
		public void wake() {
			System.out.println("�ʵ� ������ �Ͼ��");
		}
		
		
	};
	
	public void method() {
		//��ü ���� AnonymousPerson a = new AnonymousPerson();
		AnonymousPerson local = new AnonymousPerson() {
		
			public void wake() {
				System.out.println(x);
				System.out.println("���� 4�ÿ� �Ͼ���ϴ�");
			}
		};
		
		local.wake();
	}

	public void sub() {
		Date d = new Date () {
			
			@Override
			public long getTime() {
				return super.getTime();
			} 
		
			
			
			
			
		
		
		};
	}

}


