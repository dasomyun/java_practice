package ch05;
//Ŭ���� 3�� Ư¡, ����ȭ �ߺ���, ��Ӽ� 
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 23.
 * @���� : Ŭ����
 */

class Saram {		//Saram Ŭ���� 0���� this == s
	public String name;
	public String address;
	public String phoneNumber;
	private String juminBunho;		//.������ ����Ҽ� X
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
		s.name="ȫ�浿";
		s.address="����� ������ ����1��";
		s.phoneNumber = "010-1234-5678";
		s.age = 32;
		//s.juminBunho="!234-1234"; 	ERROR
		s.setJumin("123456-1234567");
		s.disp();
		
	}

}
