package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 23.
 * @���� : Ŭ����
 */

class Sung {
	public String name ;
	public int kor, eng, mat, tot;
	public float avg ;

	public void disp(){
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
	}
	
	public void total() {
		tot = kor+eng+mat;
	}
	
	public void average() {
		avg = (float)tot/3;
	}
}

public class Exam60 {

	public static void main(String[] args) {
		
		Sung a = new Sung();
		a.name = "���ټ�";
		a.kor = 70;
		a.eng = 70;
		a.mat = 80;
		a.total();
		a.average();
		a.disp();
		
		Sung b = new Sung();
		b.name = "���μ�";
		b.kor = 80;
		b.eng = 80;
		b.mat = 80;
		b.total();
		b.average();
		b.disp();
	
	
	}

}
