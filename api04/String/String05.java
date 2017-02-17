package api04.String;

import java.io.UnsupportedEncodingException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 6.
 * @���� : api - String Ŭ���� 
 * 					byte[]�� String ��ȯ
 *					String�� byte[] ��ȯ
 */

// ���ڵ� , ���ڵ�
// ���� -> System.in.read();
// ���ڿ� -> new Scanner(), toString() -> �⺻�ڷ��� 
//									   -> byte[]

// ���ڼ� : ISO-8859-1 -> ������ 
//			EUC-KR	   -> �ѱ�
//			UTF-8	   -> ������ ����

import java.util.Scanner;

public class String05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String str = sc.next();
		byte[] array = str.getBytes();			// String --> byte �� ���ڵ� 

		System.out.println("���ڵ� : " );
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("\n");
		String value = new String(array);
		System.out.println("���ڵ� : " + value + "\n");
		
		sc.close();
		
		try {
			String hStr = "�ݰ�����";
			byte[] byArr = hStr.getBytes("EUC-KR");	//���ڵ�
			
			String byStr = new String(byArr , "EUC-KR");	//���ڵ�
			System.out.println("byStr : " + byStr);
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
		
	}

}