package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 23.
 * @���� : Ŭ����
 */

class Pay {
	
	public String name;		//�̸�
	public int bonbong;		//����
	public int tax;			//����
	public int silsu;		//����-����
	
	public void input (String n , int b) {
		name = n;
		bonbong = b;
	}
	
	public void yonsan(){
		tax  = (int)(bonbong*0.045+0.5);
		silsu = bonbong - tax;
	}
	
	public void output() {
		System.out.println("name : " + name + "\tbonbong : " + bonbong + "\tsilsu : " + silsu );
	}
}


public class Exam62 {

	public static void main(String[] args) {
		
		Pay p = new Pay();
		p.input("ȫ�浿", 1500000);
		p.yonsan();
		p.output();
		
		Pay a = new Pay();
		a.input("���μ�", 2000000);
		a.yonsan();
		a.output();

	}

}
