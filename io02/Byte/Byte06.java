package io02.Byte;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : 파일 입출력 - 보조 스트림 : 다른 스트림과 연결되어 여러가지 편리한 기능을 제공하는 스트림이며 성능 향상 보조 스트림이라고도 한다.
 * 						BufferdOutputStream / BufferedInputStream
 * 						입출력 소스로부터 자신의 내부 버퍼 크기만큼 데이터를 읽고 버퍼에 저장해둔다. 
 */

public class Byte06 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream("C:\\Temp\\byte\\d.txt");
			bos = new BufferedOutputStream(fos , 1024); 	// 1024바이트를 모앗다 내보냄 
			
			String str = "자바 공부를 열심히 해야 됩니다";
			
			bos.write(str.getBytes());	// IOExcepiton 필요 
			bos.flush();	// 버퍼를 비워줌
			
			System.out.println("파일 출력 완료");
			
		} catch(FileNotFoundException e) {
			System.out.println("해당된 파일이 존재하지 않습니다");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("파일 입출력시 에러");
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close();	// 거꾸로 닫아주는게 좋음 
				if(fos != null) fos.close();
			} catch (IOException e) {
				System.out.println("Close 에러 발생");
				e.printStackTrace();
			}
		}
			
	}
}
