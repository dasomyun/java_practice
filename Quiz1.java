package practice;
/* ���� : �� ���� java�� ������ ���� ���ٱ��� p202
 * ���� 1. �غ��� ���� ������ ������ �� �ִ� Triangle Ŭ������ ��������. �׸��� ������ ���ÿ� �ʱ�ȭ�� ������ �����ڵ� ��������.
 * ������ �غ��� ���� ������ �����ų �� �ִ� �޼ҵ�� �ﰢ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ嵵 �Բ� ��������.
 */

class Triangle {
	public int m;
	public int h;
	public float result;
	
	public Triangle (int m , int h){
		this.m = m;
		this.h = h;
		result = 0.0f;
	}
	
	public void setM (int m) {
		this.m = m;
	}
	
	public void setH (int h) {
		this.h = h;
	}
	
	public float Result (){
		result = m*h/2;
		return result;
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(5,2);
		System.out.println("���� : " + triangle.Result());

		triangle.setM(10);
		triangle.setH(20);
		System.out.println("���� : " + triangle.Result());
		
	}

}
