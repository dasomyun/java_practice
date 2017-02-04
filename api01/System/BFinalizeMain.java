package api01.System;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : System 클래스 - gc()
 * 			GC(garbage collector)는 구동 시점이 일정하지 않다. 메모리가 부족하거나 CPU가 한가할 때에 JVM에 의해 자동 실행된다.
 */

public class BFinalizeMain {

	public static void main(String[] args) {
		
		BFinalize emp;
		
		emp = new BFinalize(1);
		emp = null;	// 살아있는데 참조값이 없을 뿐이다 
		
		emp = new BFinalize(2);
		emp = new BFinalize(3);
		
		System.out.println("최종적으로 참조하는 것은 : " + emp.eno);
		System.gc(); 	// 쓰레기 수집기 실행 요청 -> 소멸자 실행
	}

}
