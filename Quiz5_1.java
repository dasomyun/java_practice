package ch05;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 29
 * @���� : 5. �����Կ� Ű�� �Է¹޾� �� ����� ���̾�Ʈ�� �ʿ������� �����ϴ� ���α׷��� �ۼ��ϼ��� 
 *  	  (��, ������ >(Ű-100)*9�̸� ���̾�Ʈ�� �ʿ��� ������ �Ѵ� (if��)
 */
import java.util.Scanner ;
public class Quiz5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "Ű�� �Է��ϼ��� : ");
		float tall = sc.nextFloat();
		
		System.out.print("�����Ը� �Է��ϼ��� : ");
		float weight = sc.nextFloat();
		
		if(weight>(tall-100) *0.9)
			System.out.println("���̾�Ʈ�� �ʿ��մϴ�");
		else 
			System.out.println("���̾�Ʈ�� �ʿ� �����ϴ�");
		
		sc.close();
	}

}
