package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : 
 */
import java.util.Scanner; 

public class MyCircle extends MyPoint {
	// sc, x, y , input(), output() ��ӹ���
	
	private int r;
	
	public void input() {
		sc = new Scanner(System.in);
		
		System.out.println("x : ");
		x = sc.nextInt();

		System.out.println("y : ");
		y = sc.nextInt();
		
		System.out.println("r : ");
		r = sc.nextInt();
	}
	
	public void output() {
		System.out.println( x + "\t" + y + "\t" + r );	
	}
	
}
