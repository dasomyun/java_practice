package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 23.
 * @���� : Ŭ���� - this
 */

class Data{
	private int x ;//���� ������ : private �Լ� : public
	private int y ; 
	
	public void setData(int x, int y) {
		this.x=x;	//this - �� �ɹ��������� �˷��ִ� �� 
		this.y=y;
	}
	
	public void disp(){
		System.out.println( this.x + "," + this.y );
	}
}


public class Exam64 {

	public static void main(String[] args) {
		Data d = new Data();
		d.setData(10,20);
		d.disp();
		
		Data a = new Data();
		a.setData(55, 77);
		a.disp();
		
	}

}
