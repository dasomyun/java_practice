package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 23.
 * @내용 : 클래스
 */

class Pay {
	
	public String name;		//이름
	public int bonbong;		//월급
	public int tax;			//세금
	public int silsu;		//월급-세금
	
	public void input (String n , int b) {
		name = n;
		bonbong = b;
	}
	
	public void yonsan(){
		tax  = (int)(bonbong*0.045+0.5);
		silsu = bonbong - tax;
	}
	
	public void output() {
		System.out.println("name : " + name + "\tbonbong : " + bonbong + "\tsilsu : " + silsu );
	}
}


public class Exam62 {

	public static void main(String[] args) {
		
		Pay p = new Pay();
		p.input("홍길동", 1500000);
		p.yonsan();
		p.output();
		
		Pay a = new Pay();
		a.input("조인성", 2000000);
		a.yonsan();
		a.output();

	}

}
