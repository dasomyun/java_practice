package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 23.
 * @���� : Ŭ����
 */

import java.util.Scanner ; 

 class Hakjum {
	public String name ;
	public int kor, eng, mat, tot;
	public float avg;
	
	public void total(){
		tot = kor + eng + mat ;
	}
	
	public void average(){
		avg = (float) tot/3;
	}
	
	public void disp() {
		System.out.println("�̸�\t����\t����\t����\t����\t���\t");
		System.out.println(name + "\t" + kor + "\t" + mat + "\t" + eng + "\t" + tot + "\t" + avg);
	}
	
	public void input() {	//�Լ��ȿ� scanner �� ���� �� close�� �Լ��ȿ� ����ϸ� �ȵȴ�. �ٸ� close ����� ���� 
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸� : ");
		name = sc.next();
		
		System.out.print("���������� �Է��ϼ��� : ");
		kor = sc.nextInt();
		
		System.out.print("���������� �Է��ϼ��� : ");
		eng = sc.nextInt();
		
		System.out.print("���������� �Է��ϼ��� : ");
		mat = sc.nextInt();
		
	}
	
}


public class Exam61 {

	public static void main(String[] args) {	// ������ ������ ��ü����, ȣ�� ���̿��� ���� ������ ª������
		
		Hakjum a = new Hakjum();
		a.input();
		a.total();
		a.average();
		a.disp();
		
		Hakjum b = new Hakjum();
		b.input();
		b.total();
		b.average();
		b.disp();
		
		Hakjum c = new Hakjum();
		c.input();
		c.total();
		c.average();
		c.disp();
		
	}

}
