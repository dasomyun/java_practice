package api04.String;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 6.
 * @내용 : api - String 클래스 
 * 				charAt() , indexOf() , length()
 */

public class String01 {
	public static void main(String[] args) {
		String a = new String("apple");
		String b = "banana";
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		String subject = "자바프로그래밍";
		char ch = subject.charAt(5); // 0 1 2 3 4 5 
		System.out.println("문자 추출 : " + ch);
		
		int index = subject.indexOf("프로그래밍");
		System.out.println("시작되는 문자열의 위치 출력 : " + index);	// 자바프로그래밍에서 프로그래밍이라는 단어가 시작되는 위치 출력 
		System.out.println("시작되는 문자열의 위치 출력 : " + subject.indexOf("하하하"));	//포함되는 문자열이 없으면 -1 반환
		
		int leng = subject.length();
		System.out.println("문자열 길이 : " + leng);
		
		System.out.println("주민번호 성별 체크");
		String juminBunho = "123456-1234567"; //남자 1, 3, 5 여자 2, 4, 6
		
//		if(juminBunho.charAt(7) == '1' || juminBunho.charAt(7) == '3' || juminBunho.charAt(7) == '5') 
//			System.out.println("남자");
//			else 
//			System.out.println("여자");
		
		if( juminBunho.length() == 14){
			char sex = juminBunho.charAt(7);
			
			switch(sex) {
			case '1': case '3': case '5':
				System.out.println("남자");
				break;
				
			case '2': case'4': case'6':
				System.out.println("여자");
				break;
				
			default : 
				System.out.println("잘못 입력하셨습니다");
			}
		} else { 
			System.out.println("주민번호 자리가 틀립니다");
		}
			
		System.out.println("\n");
		//위치값 뽑아오기
		if(juminBunho.length() == 14) {
			int location = juminBunho.indexOf("-");
			System.out.println("location : " + location);
		//loaction (-) 제거
		//juminBunho --> int로 바꾼다.
			
		}
			
		}
	}


