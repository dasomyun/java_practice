package ch05;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 29
 * @내용 :6. 키보드로부터 입력한 문자가 W 또는 w이면 woman , M 또는 m이면 man, 
 * 그 이외이면 ???을 화면상에 표시하는 프로그램을 작성하세요 (if문)
 */
import java.io.IOException ; 

public class Quiz6_1 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("입력 : ");
		char input = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		if(input == 'w' || input == 'W')
			System.out.println("여자");
		else if (input == 'm' || input == 'M')
			System.out.println("남자");
		else 
			System.out.println("?????");
		
	}

}
