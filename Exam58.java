package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 23.
 * @���� : Ŭ���� ����
 */

class Su {	//������
	//���� ������ 
	public int x;	//instance, member, variable, field
	public int y;
	
	
}

public class Exam58 {

	public static void main(String[] args) {
		Su a = new Su();	//su��� Ŭ������ a��� ��ü�� �����ƴ�.
		a.x=10;
		a.y=20;
		System.out.println("a ��ü : " + a.x + "\t" + a.y);
		
		Su b = new Su();
		b.x = 100;
		b.y = 200;
		System.out.println("b ��ü : " + b.x + "\t" + b.y);
		
		
	}

}
