package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 23.
 * @내용 : 클래스
 */

import java.util.Scanner ; 

 class Hakjum {
	public String name ;
	public int kor, eng, mat, tot;
	public float avg;
	
	public void total(){
		tot = kor + eng + mat ;
	}
	
	public void average(){
		avg = (float) tot/3;
	}
	
	public void disp() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println(name + "\t" + kor + "\t" + mat + "\t" + eng + "\t" + tot + "\t" + avg);
	}
	
	public void input() {	//함수안에 scanner 를 했을 때 close를 함수안에 사용하면 안된다. 다른 close 방법이 있음 
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("국어점수를 입력하세요 : ");
		kor = sc.nextInt();
		
		System.out.print("영어점수를 입력하세요 : ");
		eng = sc.nextInt();
		
		System.out.print("수학점수를 입력하세요 : ");
		mat = sc.nextInt();
		
	}
	
}


public class Exam61 {

	public static void main(String[] args) {	// 메인의 역할은 객체생성, 호출 뿐이여서 점점 메인은 짧아진다
		
		Hakjum a = new Hakjum();
		a.input();
		a.total();
		a.average();
		a.disp();
		
		Hakjum b = new Hakjum();
		b.input();
		b.total();
		b.average();
		b.disp();
		
		Hakjum c = new Hakjum();
		c.input();
		c.total();
		c.average();
		c.disp();
		
	}

}
