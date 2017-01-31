package ch05;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31
 * @내용 : 8. 영문자 하나를 입력받아서 대소문자로 변환하세요 
 */
import java.io.IOException;

public class Quiz8_1 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("영문자 하나를 입력 : ");
		char c = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		if(c >= 65 && c < 97) {
			System.out.println((c+=32));
		} else if(c>=97){
			System.out.println((c-=32));
		}
		
		//a=97
		//A=65
	}

}
