package api04.String;

import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 6.
 * @내용 : api - String 클래스 
 * 				byte[] ---> String 변환
 */

public class String04 {
	public static void main(String[] args) {
		
		// 네트워크 통신(쪽지, 채팅), 파일업로드 
		byte[] bytes = {72, 101, 108, 111, 32, 74, 97, 118, 97};
		String str = new String(bytes);
		System.out.println(str);	//toString()은 호출된다. String 이 내부적으로 불러와서 찍힌다 (?)
		System.out.println(str.toString());
		
		String var = new String(bytes , 6 , 4);		//6번지부터 4개 -  74, 97, 118, 97
		System.out.println(var + "\n");
		
		// 1byte char ch = (char) System.in.read();
		//2byte (기본자료형) Scanner sc = new Scanner(System.in) 
		
		try {
			System.out.println("첫번째 문자입력 : ");
			int ch = System.in.read();//A	 //아스키 코드 반환
			System.in.read();
			System.in.read();
			System.out.println("ch : " + (char) ch + "\t" + ch);
			
			byte[] by = new byte[100];
			System.out.println("두번쨰 문자 배열 입력 : " );
			int count = System.in.read(by);		//100 byte	//
			System.out.println("count : " + count);		///r/s 뒷부분에 byte 포함
			
			String bystr = new String(by);	//디코딩 작업을 해준다 
			System.out.println("bystr : " + bystr);
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
