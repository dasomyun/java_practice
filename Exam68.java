package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 23.
 * @���� : ������ , Scanner
 */
import java.util.Scanner;

class Birth {
	private int year;
	private int month;
	private int day;
	private String name;
	private Scanner sc;
	
	public Birth() {
		sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = sc.next();
		
		System.out.print("�⵵ : ");
		year = sc.nextInt();
		
		System.out.print("�� : ");
		month = sc.nextInt();
		
		System.out.print("�� : ");
		day = sc.nextInt();
		
	}
	
	public void disp() {
		System.out.println("�̸� : " + name);
		System.out.println("�� : " + year);
		System.out.println("�� : " + month);
		System.out.println("�� : " + day);
		
	}
	
	public void setName(String name){
		this.name = name;
	}
}

public class Exam68 {

	public static void main(String[] args) {
		Birth b = new Birth();
		b.disp();
		b.setName("������");
		b.disp();
		
		Birth i = new Birth();
		i.disp();
		
		
	}

}
