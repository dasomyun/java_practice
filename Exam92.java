package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 26.
 * @���� : ��� - final �Լ� 
 */

class ParentsJ{
	protected int value;
	
	public void abc() {
		System.out.println("���ϽĴ� ��Ʈ��");
	}
	
	public static void xyz() {
		
	}
	
	//public abstract void ijk();
	
	public final void aa() {
		System.out.println("���뱹");
	}
	
	public static final void bb() {
		
	}
}

class SunJ extends ParentsJ {
	public void abc() {
		super.aa();
	}
	
	//public void aa(){ }	final �����ǰ� �ȵ� 
}

public class Exam92 {
	public static void main(String[] args) {
		
	}

}
