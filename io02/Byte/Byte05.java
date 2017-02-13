package io02.Byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : 파일 입출력 - 이미지 읽기 쓰기 ( 01, 02번 예제랑 비교해서 보기 ) 
 * 						FileInputStream , FileOutputStream
 */

public class Byte05 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 읽기
			fis = new FileInputStream ("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
			
			// 쓰기 
			fos = new FileOutputStream ("C:\\Temp\\byte\\image.jpg"); 	// 사진이라 콘솔창에 찍을 수 없어서 폴더로 보냄 
		
			
			// 이미지를 byte로 가져옴
			byte[] data = new byte[100];  // 한번에 100 바이트씩 읽어와서 100바이트 출력 -> 속도가 빠르다		
			
			while(true) {
				int count = fis.read(data);  // 읽기
				if(count == -1) break; 
				
				fos.write(data);  // 쓰기
			}
			
			/*
			while(true) {
				int count = fis.read();	// 한번에 4바이트의 끝에 있는 1바이트 읽어와서 1바이트 출력
				if(count==-1) break;
				
				fos.write(count);
			}
			*/
			
			fos.flush();
			
			System.out.println("파일 출력 완료!");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력시 에러입니다");
			e.printStackTrace();
		} finally {
			
			try {
				if(fos != null) fos.close(); 	// 22라인에서 에러 걸렸을 때를 대비하여 if문 작성 
				if(fis != null) fis.close();
			} catch(IOException e) {
				System.out.println("파일 close 에러");
				e.printStackTrace();
			}	
		}
	
		
	}
}
