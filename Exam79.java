package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� (������)
 */

class Man {		// Man man = new Man(); name, empName()
	protected String name;
	
	public void empName() {
		System.out.println("�̸� : " + name);
	}
	
	
}

class BusinessMan extends Man {		//name , empName() , company , position , info()
	private String company;
	private String position;
	
	public BusinessMan (String name, String company, String position){
		
		super.name = name;
		this.company = company;
		this.position = position;
		
	}
	
	public void info() {
		super.empName();  	// empName(); this.empName();
		System.out.println("ȸ���̸� : " + company);
		System.out.println("���� : " + position);
	}
	
}

public class Exam79 {
	public static void main(String[] args) {
		BusinessMan businessMan = new BusinessMan ("ȫ�浿" , "SIST" , "SI");
		//���� : BusninessMan�� ������ - ��ӹ��� man Ŭ������ ����Ʈ ������ ���� - businessMan ������ ���� 
		businessMan.info();

	}

}
