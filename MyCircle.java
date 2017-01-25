package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 
 */
import java.util.Scanner; 

public class MyCircle extends MyPoint {
	// sc, x, y , input(), output() 상속받음
	
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
