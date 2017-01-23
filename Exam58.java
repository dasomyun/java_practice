package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 23.
 * @내용 : 클래스 기초
 */

class Su {	//힙영역
	//접근 제한자 
	public int x;	//instance, member, variable, field
	public int y;
	
	
}

public class Exam58 {

	public static void main(String[] args) {
		Su a = new Su();	//su라는 클래스의 a라는 객체가 생성됐다.
		a.x=10;
		a.y=20;
		System.out.println("a 객체 : " + a.x + "\t" + a.y);
		
		Su b = new Su();
		b.x = 100;
		b.y = 200;
		System.out.println("b 객체 : " + b.x + "\t" + b.y);
		
		
	}

}
