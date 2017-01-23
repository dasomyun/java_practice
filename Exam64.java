package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 23.
 * @내용 : 클래스 - this
 */

class Data{
	private int x ;//보통 변수명 : private 함수 : public
	private int y ; 
	
	public void setData(int x, int y) {
		this.x=x;	//this - 이 맴버변수임을 알려주는 것 
		this.y=y;
	}
	
	public void disp(){
		System.out.println( this.x + "," + this.y );
	}
}


public class Exam64 {

	public static void main(String[] args) {
		Data d = new Data();
		d.setData(10,20);
		d.disp();
		
		Data a = new Data();
		a.setData(55, 77);
		a.disp();
		
	}

}
