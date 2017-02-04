package api03.Class;

public class ACarMain {
	public static void main(String[] args) {
		ACar car = new ACar();
		Class<?> cls = car.getClass();		// 함수 , 필드, 생성자 정보를 가져온다
		
		System.out.println("풀네임 : " + cls.getName());
		System.out.println("클래스명 : " + cls.getSimpleName());
		System.out.println("패키지명 : " + cls.getPackage().getName());
	
		
		// 동적 객체 생성 String 형태로 뽑아올 때 생성 
		
		try{
			// 문자열 클래스로 
			Class<?> clsz = Class.forName("api03.Class.ACar");
			System.out.println("풀네임 : " + clsz.getName());
			System.out.println("클래스명 : " + clsz.getSimpleName());
			System.out.println("패키지명 : " + clsz.getPackage().getName());
			
			//clsz를 객체
			ACar cara = (ACar) clsz.newInstance();
		} catch (Exception e) {
			System.out.println("클래스 존재하지 않음");
		}
		
	}

}
