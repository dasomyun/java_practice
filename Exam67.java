package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 23.
 * @���� : ������
 */

class Birthday {
	private int year;
	private int month;
	private int day;
	private String name;	//String �� �빮���̰� Ŭ������
	
	public Birthday(int year, int month, int day, String name){
	
		this.year = year;
		this.month = month;
		this.day = day;
		this.name = name;
	}

	public void disp() {
		System.out.println("�̸� : " + name);
		System.out.println("�� : " + year);
		System.out.println("�� : " + month);
		System.out.println("�� : " + day);
		
	}
}


public class Exam67 {

	public static void main(String[] args) {
		Birthday birthday1 = new Birthday (1980,12,25,"ȫ�浿");
		birthday1.disp();
		
		Birthday birthday2 = new Birthday (1994,3,2,"���ټ�");
		birthday2.disp();
	}

}
