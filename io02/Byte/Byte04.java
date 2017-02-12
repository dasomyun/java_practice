package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 10.
 * @내용 : 파일 입출력 - 입력 String
 */

public class Byte04 {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("C:\\Temp\\byte\\a.txt");
			FileInputStream fis = new FileInputStream(file);
			
			byte[] msg = new byte[65536];
			// System.out.println(new String(msg));
			int count = fis.read(msg);
			System.out.println(new String(msg , 0 , count));	// 이 방법이 있고 ( 이게 더 편함 ) 
															
			byte[] data = new byte[2];							// 이 방법이 있다 ( 속도가 조금 더 빠름 )
			while(true) {							 	
				int cnt = fis.read(data);
				if(cnt == -1) break;
				System.out.println(new String(data));
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일 존재하지 않음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력시 에러 ");
			e.printStackTrace();
		}
		
	}

}
