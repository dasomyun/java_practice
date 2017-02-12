package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.crypto.Data;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 10.
 * @내용 : 파일 입출력 - String 출력 
 */

public class Byte03 {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("C:/Temp/byte/a.txt");
			FileOutputStream fos = new FileOutputStream(file); 
			
			
			String str = "안녕하세요";
			byte[] data = str.getBytes(); // 분할해서 내보냄
			fos.write(data);
			
			for(int i=0; i<data.length; i++) {
				fos.write((data[i]));
			}
			
			fos.flush();
			fos.close();
			
			System.out.println("파일 출력이 완료 됐습니다");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다");
			e.printStackTrace();
		} catch (IOException e ) {
			System.out.println("파일 입출력시 에러가 발생하였습니다");
			e.printStackTrace();
		}
		
	}

}
