package api04.String;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 6.
 * @���� : api - String Ŭ����
 * 				replace() , substring() , trim(), 
 * 				���ڿ��� �⺻�ڷ������� ��ȯ��� ( Scanner, parseInt() ) , �⺻�ڷ����� ���ڿ��� ��ȯ���( toString(), valueOf() )
 */
// ��� , �ڹٴ�, ��� ���� �ذ��ؾ� �� ���� ������ ��ġ���� �ذ����ֱ� 

import java.util.Scanner;

public class String03 {
	public static void main(String[] args) {
		String str1 = "�ڹٴ� ��ü���� ��� �Դϴ�";
		String str2 = str1.replace("�ڹ�" , "JAVA");
		System.out.println("str2 : " + str2);
		System.out.println("str1: " + str1);
		
		String str3 = "How are you?";
		System.out.println("���ڿ� ���� : " + str3.substring(2));
		System.out.println("���ڿ� ���� : " + str3.substring(2,9));	// 2�������� ����~ 9���� ������ ��� (�� 2~8)
		System.out.println(str3 + "\n\n");
		
		String str4 = "     �ڹ�   ���α׷�    ";
		System.out.println("str4 : " + str4);
		System.out.println("�յ� �������� : " + str4.trim());
		
		System.out.println("\n\n");
		
		System.out.println("���ڿ��� �⺻�ڷ������� ��ȯ");
		Scanner sc = new Scanner("10");		// Ű���� �Է� 
		int su = sc.nextInt();
		
		int value = Integer.parseInt("20");		//�ǹ������� �̰� ���� 
		System.out.println("su : " + ++su);
		System.out.println("value : " + ++value);
		
		sc.close();
		
		System.out.println("�⺻�ڷ����� ���ڿ��� ��ȯ");
		
		int a = 10;
		Integer ia = new Integer(a);
		String istr = ia.toString();
		System.out.println("istr : " + istr);
		
		float b= 24.5f;
		Float fb = new Float(b);
		String fstr = fb.toString();
		System.out.println("fstr : " + fstr);
		
		String ival = String.valueOf(10);	//�ǹ������� �̰� ����
		String fval = String.valueOf(24.5f);
		String tval = String.valueOf(true);
		System.out.println(ival + "\t" + fval + "\t" + tval);
		
	}
}
