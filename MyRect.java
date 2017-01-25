package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 
 */
import java.util.Scanner;

public class MyRect extends MyPoint {
	// sc, x, y , input(), output() 상속받음

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
