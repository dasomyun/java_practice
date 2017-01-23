package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 23.
 * @내용 : 생성자 , Scanner
 */
import java.util.Scanner;

class Birth {
	private int year;
	private int month;
	private int day;
	private String name;
	private Scanner sc;
	
	public Birth() {
		sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("년도 : ");
		year = sc.nextInt();
		
		System.out.print("월 : ");
		month = sc.nextInt();
		
		System.out.print("일 : ");
		day = sc.nextInt();
		
	}
	
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("년 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		
	}
	
	public void setName(String name){
		this.name = name;
	}
}

public class Exam68 {

	public static void main(String[] args) {
		Birth b = new Birth();
		b.disp();
		b.setName("선생님");
		b.disp();
		
		Birth i = new Birth();
		i.disp();
		
		
	}

}
