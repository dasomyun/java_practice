package ch04.quiz;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 16
 *                     문제 16) login() 함수와 logout() 함수를 선언합니다. login()함수를 호출할 때에는 매개값으로
 *                                id와 password를 제공하고, logout()함수는 id만 매개값으로 제공합니다.
 */

public class Quiz16 {
	public static void main(String[] args) {
		boolean result=login("hong", "1234");
		
		if(result){
			System.out.println("로그인 되었습니다.");
			logout("hong");
		}else{;
			System.out.println("id와 password가 올바르지 않습니다");
		}
	}
	
	public static boolean login(String id, String password){
		boolean check=false;
		
		if(id=="hong" && password=="1234"){
			check=true;
		}
		
		return check;
	}

	public static void logout(String id){
		System.out.println("로그아웃 되었습니다.");
	}
}
