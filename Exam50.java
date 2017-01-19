package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call By Value ( 배열 )
 */
// 내소스 밖으로 내보내는 데이터 형태 String
// 내소스 안으로 들어오는 데이터 형태 : String
public class Exam50 {

	public static void main(String[] args) {
		String[] str = new String[] {"kim", "park", "lee"};
		sub(str);
		
		String[] array=fun();
		System.out.println(array.length);
	}
	
	public static String[] fun() {
		String[] array = new String[] {"안녕하세요", "반가워요"};
		return array;
	}
	
	public static void sub(String[] str){
		System.out.println(str.length);
	}

}
