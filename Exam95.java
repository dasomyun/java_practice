package ch08;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : 클래스 - 함수의 지역 객체 
 */

//복붙할땐 블럭해서 하지말고 클래스파일에 ctrl+c ctrl+v

class SungjukA {
	private String name;
	private int kor, eng, mat;
	
	public SungjukA() { }
	
	public SungjukA(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

}

class SungjukTotalA {
	private int tot;
	
	public void disp() {
		System.out.println("tot : " + tot);
	}
	
	public void setTotal(SungjukA sungjuk){	//100번지
		tot = sungjuk.getKor() + sungjuk.getEng() + sungjuk.getMat();
	}
}

public class Exam95 {

	public static void main(String[] args) {
		
		SungjukA sung = new SungjukA("홍길동" , 90 , 90 , 90);
		SungjukTotalA total = new SungjukTotalA();
		
		total.setTotal(sung);	//100번지
		total.disp();
		
	}

}
