package io02.Byte;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : 파일 입출력 - 보조스트림 읽어오기 
 * 						BufferdOutputStream / BufferedInputStream
 */

public class Byte07 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream("C:\\Temp\\byte\\d.txt");
			bis = new BufferedInputStream(fis, 1024); 	// 파일 입출력 1024, 네트워크 512
			
			byte[] data = new byte[50];		// 한번에 받을 수 있는 바이트의 최대치 : 65536
			int count = bis.read(data);
			System.out.println(new String(data , 0 , count)); 	// new String(data)
			
		} catch (FileNotFoundException e) {
			System.out.println("해당파일이 존재하지 않습니다");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("입출력시 에러 입니다");
			e.printStackTrace();
			
		} finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch(Exception e) {
				System.out.println("Close 에러 발생");
				e.printStackTrace();
			}
		}
		
 		
	}

}
