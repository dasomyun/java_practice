package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : 
 */
import java.util.Scanner;

public class MyRect extends MyPoint {
	// sc, x, y , input(), output() ��ӹ���

	private int w, h;
	public void input() {
		sc = new Scanner(System.in);
		
		System.out.print("x : ");
		x = sc.nextInt();

		System.out.print("y : ");
		y = sc.nextInt();

		System.out.print("w : ");
		w = sc.nextInt();
		
		System.out.print("h : ");
		h = sc.nextInt();
	}
	
	public void output() {
		System.out.println( x + "\t" + y + "\t" + w + "\t" + h );
	}
	
}
