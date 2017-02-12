package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 10.
 * @내용 : byte 방식 - 바이트 기반 스트림과 문자 기반 스트림 
 * 			바이트 기반 : (파일 업로드에 많이 쓰임) 그림, 멀티미디어, 문자 등 모든 종류의 데이터를 보낼 수 있다.
			문자 방식 : (채팅시 많이 쓰임) 
			*파일 내보내기 , 입력*
 */

public class Byte01 {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Temp\\byte\\a.txt");  // 내보낼 곳  // a.txt 자동 생성  
			FileOutputStream fos = new FileOutputStream(file);
			
			byte[] data = new byte[] {'a' , 'p' , 'p' , 'l' , 'e'};
			for(int i=0; i<data.length; i++) {
				// System.out.println(data[i]);
				// 파일 내보내기
				fos.write(data[i]);
			}
			
			fos.flush();	// 버퍼에 잔류하는 데이터를 강제로 내보낸다.
			fos.close();	// 자원 반납하고 출력 스트림을 닫아야 데이터 손실이 없다 반드시 닫아야 함 !
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력시 에러 발생");
			e.printStackTrace();
		}
		

		
		
		
	}
}
