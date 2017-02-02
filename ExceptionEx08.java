package ch10.exception;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : �����߻� - �� ���α׷� ���� �� ��������, �����Ͽ��� ������ �ƴ� ��� ������ ������ش� , throw
 */
import java.util.Scanner;

public class ExceptionEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//su = 10 �̸� ���Ƿ� �����߻�
		
		try {
			System.out.print("���� �Է��ϼ��� (10�� �Է��Ͻø� �ȵ˴ϴ�) : ");
			int su = sc.nextInt();
			
			if(su==10) {
				// �����߻� throw
				NumberFormatException nfe = new NumberFormatException("/ by 10");
				throw nfe;
			}
			
			System.out.println("su : " + su );
		} catch (NumberFormatException obj){
			System.out.println("10�� �����ø� �ȵ˴ϴ�");
		} catch (Throwable obj) {							//�ֻ��� Ŭ������ ����ó���� �� �ڿ� �ۼ� 
			System.out.println("���ڸ� ����� �Է��ϼ���");
		} finally {
			sc.close();
		}
		
	}

}
