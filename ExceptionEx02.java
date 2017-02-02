package ch10.exception;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : ����ó�� - NumberFormatException
 */
import java.util.Scanner;

public class ExceptionEx02 {
	public static void main(String[] args) {
		String su = "100";
		String value = "200";
		
		System.out.println(su + value);  // 100200
		Scanner sc = new Scanner(su);
		int isu = sc.nextInt();
		
		Scanner sca = new Scanner(value);
		int ivalue = sca.nextInt();
		
		System.out.println(isu + ivalue);
		
		sc.close();
		sca.close();
		
		//-------------------------------
		
		int is = Integer.parseInt(su);
		int iv = Integer.parseInt(value);
		System.out.println(is+iv);
		
		//-------------------------------
		System.out.println("--------------------\n");
		String x = "77";
		String y = "a88";
		
		try {
			int ix = Integer.parseInt(x);	// 77
			int iy = Integer.parseInt(y);
		
			int result = ix + iy ;
		
			System.out.println("��� : " + result );
		} catch (NumberFormatException obj){
			System.out.println( "���� ����� ���ڿ� ����" );
		}
		
	}

}
