package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 16.
 * @���� : switch ��
 */

public class Exam16 {

	public static void main(String[] args) {
		char a = 'B';
		
		switch(a) {
		case 'W':		//if(a=='W' || a =='w')
		case 'w':
			System.out.println("White");
			break;
		case 'B':
		case 'b':
			System.out.println("Blue");
			break;
		case 'Y':
		case 'y':
			System.out.println("Yellow");
			break;
		case 'R':
		case 'r':
			System.out.println("Red");
			break;
		}
		
		System.out.println("\n");
		
		String name = "���ټ�";
		String grade = "BB";
		String memberLevel = "" ; // int a = 0; double b=0.0; �� ������ char c=''�� �ȵ� char c=0���� �ʱ�ȭ
		
		switch(grade) {
		case "AA":
		case "aa":
			memberLevel="��ȸ��";
			break;
		case "BB":
		case "bb":
			memberLevel="��ȸ��";
			break;
		case "CC":
		case "cc":
			memberLevel="�մ�";
			break;
		}
		
	System.out.println(name + " ȸ������ " + memberLevel + " �Դϴ�.");
	
	// double value = 15.5;
	// switch(value){ } �Ǽ����� ���ǽ��� �� �� ����.
	
	// int su = 10 ;
	// switch(su > 10){ } error
	
	}

}
