package ch07_interfaceA;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : interface 
 */

interface XX {	//�ݵ�� ���� Ŭ������ �־�� �� 
	public int su = 20;		//static final �̶�� ���� �ʾƵ� ���������� �ٲ� // ���������� ���� ����� ���� ( ġȯ�� �ȵǱ� ���� )
	public void disp();		//abstract disp(); ��� ���� �ʾƵ� ���������� �ٲ�
}

interface Test extends XX {}	//su, disp()

class Exam { }

// interface Imsi implements Exam{}		ERROR! interface�� Ŭ������ ��ӹ��� ����

class YY implements XX {	// ���� Ŭ����
	public void disp() {
		System.out.println("HI");
	}
	
	public void output() {
		System.out.println("SU : " + su);
		//su = 77 ;  	ERROR! FINAL ������ ġȯ�� �ȵ�
	}
	
}



public class Exam93 {

	public static void main(String[] args) {
		YY y = new YY();
		y.disp();
		y.output();
		System.out.println(YY.su + "\n");	//su�� static�̱� ������ Ŭ������.������
		
		XX x = new YY();
		x.disp();
		
	}

}
