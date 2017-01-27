package practice;
/* 내용 : 난 정말 java를 공부한 적이 없다구요 p202
 */

class Child1 {
	public int marble1;
	public int m;

	public Child1(int marble1) {
		this.marble1 = marble1; 
	}
	
	public void Get (Child2 c2 , int m){
		this.marble1 += m;
		c2.marble2 -= m;
	}
	
	public void Lose (Child2 c2, int m){
		this.marble1 -= m;
		c2.marble2 += m; 
	}
		
	public void disp() {
		System.out.println("어린이1의 보유 자산 : " + marble1);
	}
}

class Child2 {
	public int marble2;
	public int m;

	public Child2(int marble2) {
		this.marble2 = marble2; 
		this.m = 0;
	}
	
	public void Get (Child1 c1 , int m){
		this.marble2 += m;
		c1.marble1 -= m; 
		
	}
	
	public void Lose (Child1 c1 , int m){
		this.marble2 -= m;
		c1.marble1 += m;
	}
	
	public void disp() {
		System.out.println("어린이1의 보유 자산 : " + marble2);
	}
}



public class Quiz2 {

	public static void main(String[] args) {
		Child1 c1 = new Child1(15);
		Child2 c2 = new Child2(9);
		System.out.println("현재 보유하고있는 구슬의 수 \n 어린이1 : " + c1.marble1 + "\t어린이2 : " + c2.marble2);
		
		c1.Get(c2 , 2);
		System.out.println("1차 게임에서 어린이 1은 어린이2의 구슬 2개를 획득한다\n어린이1의 구슬의 수 : " + c1.marble1 + "\t어린이2의 구슬의 수 : " + c2.marble2 );
		c2.Get(c1, 7);
		System.out.println("1차 게임에서 어린이 1은 어린이2의 구슬 7개를 획득한다\n어린이1의 구슬의 수 : " + c1.marble1 + "\t어린이2의 구슬의 수 : " + c2.marble2 );
		
		
	}

}
