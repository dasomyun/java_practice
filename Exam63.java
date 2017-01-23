package ch05;
//클래스 3대 특징, 은닉화 중복성, 상속성 
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 23.
 * @내용 : 클래스
 */

class Saram {		//Saram 클래스 0번지 this == s
	public String name;
	public String address;
	public String phoneNumber;
	private String juminBunho;		//.연산자 사용할수 X
	public int age;

	public void setJumin(String j) {
		juminBunho = j ;
	}

	public void disp() {
		System.out.println("name : " + name + "\tadderss : " + address + "\tphoneNumber : " + phoneNumber + "\tjuminBunho : " + juminBunho +"\tage : " + age );
	}
}



public class Exam63 {

	public static void main(String[] args) {
		Saram s = new Saram();
		s.name="홍길동";
		s.address="서울시 강남구 역삼1동";
		s.phoneNumber = "010-1234-5678";
		s.age = 32;
		//s.juminBunho="!234-1234"; 	ERROR
		s.setJumin("123456-1234567");
		s.disp();
		
	}

}
