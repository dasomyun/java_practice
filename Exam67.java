package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 23.
 * @내용 : 생성자
 */

class Birthday {
	private int year;
	private int month;
	private int day;
	private String name;	//String 은 대문자이고 클래스다
	
	public Birthday(int year, int month, int day, String name){
	
		this.year = year;
		this.month = month;
		this.day = day;
		this.name = name;
	}

	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("년 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		
	}
}


public class Exam67 {

	public static void main(String[] args) {
		Birthday birthday1 = new Birthday (1980,12,25,"홍길동");
		birthday1.disp();
		
		Birthday birthday2 = new Birthday (1994,3,2,"윤다솜");
		birthday2.disp();
	}

}
