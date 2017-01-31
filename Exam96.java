package ch08;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : 지역함수, 지역변수로 객체 사용 
 */

class Sungjuk {
	private String name;
	private int kor, eng, mat;
	
	public Sungjuk() { }
	
	public Sungjuk(String name, int kor, int eng, int mat) {
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

class SungjukTotal {
	private int tot;
	
	public void total() {
		Sungjuk sungjuk = new Sungjuk("홍길동" , 100 , 100 , 100);
		tot = sungjuk.getKor() + sungjuk.getEng() + sungjuk.getMat();
	}
	public void disp() {
		System.out.println("tot : " + tot);
	}
}

public class Exam96 {

	public static void main(String[] args) {
		SungjukTotal total = new SungjukTotal();
		total.total();
		total.disp();
		
	}

}
