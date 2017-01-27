package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 상속 (생성자)
 */

class Man {		// Man man = new Man(); name, empName()
	protected String name;
	
	public void empName() {
		System.out.println("이름 : " + name);
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
		System.out.println("회사이름 : " + company);
		System.out.println("직급 : " + position);
	}
	
}

public class Exam79 {
	public static void main(String[] args) {
		BusinessMan businessMan = new BusinessMan ("홍길동" , "SIST" , "SI");
		//순서 : BusninessMan의 생성자 - 상속받은 man 클래스의 디폴트 생성자 생성 - businessMan 생성자 실행 
		businessMan.info();

	}

}
