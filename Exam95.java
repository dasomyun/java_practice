package ch08;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : Ŭ���� - �Լ��� ���� ��ü 
 */

//�����Ҷ� ���ؼ� �������� Ŭ�������Ͽ� ctrl+c ctrl+v

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
	
	public void setTotal(SungjukA sungjuk){	//100����
		tot = sungjuk.getKor() + sungjuk.getEng() + sungjuk.getMat();
	}
}

public class Exam95 {

	public static void main(String[] args) {
		
		SungjukA sung = new SungjukA("ȫ�浿" , 90 , 90 , 90);
		SungjukTotalA total = new SungjukTotalA();
		
		total.setTotal(sung);	//100����
		total.disp();
		
	}

}
