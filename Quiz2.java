package practice;
/* ���� : �� ���� java�� ������ ���� ���ٱ��� p202
 */

class Child1 {
	public int marble1;
	public int m;

	public Child1(int marble1) {
		this.marble1 = marble1; 
	}
	
	public void Get (Child2 c2 , int m){
		this.marble1 += m;
		c2.marble2 -= m;
	}
	
	public void Lose (Child2 c2, int m){
		this.marble1 -= m;
		c2.marble2 += m; 
	}
		
	public void disp() {
		System.out.println("���1�� ���� �ڻ� : " + marble1);
	}
}

class Child2 {
	public int marble2;
	public int m;

	public Child2(int marble2) {
		this.marble2 = marble2; 
		this.m = 0;
	}
	
	public void Get (Child1 c1 , int m){
		this.marble2 += m;
		c1.marble1 -= m; 
		
	}
	
	public void Lose (Child1 c1 , int m){
		this.marble2 -= m;
		c1.marble1 += m;
	}
	
	public void disp() {
		System.out.println("���1�� ���� �ڻ� : " + marble2);
	}
}



public class Quiz2 {

	public static void main(String[] args) {
		Child1 c1 = new Child1(15);
		Child2 c2 = new Child2(9);
		System.out.println("���� �����ϰ��ִ� ������ �� \n ���1 : " + c1.marble1 + "\t���2 : " + c2.marble2);
		
		c1.Get(c2 , 2);
		System.out.println("1�� ���ӿ��� ��� 1�� ���2�� ���� 2���� ȹ���Ѵ�\n���1�� ������ �� : " + c1.marble1 + "\t���2�� ������ �� : " + c2.marble2 );
		c2.Get(c1, 7);
		System.out.println("1�� ���ӿ��� ��� 1�� ���2�� ���� 7���� ȹ���Ѵ�\n���1�� ������ �� : " + c1.marble1 + "\t���2�� ������ �� : " + c2.marble2 );
		
		
	}

}
