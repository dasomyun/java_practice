package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 10.
 * @내용 : 파일 입출력 - 출력
 */

public class Byte02 {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Temp\\byte\\a.txt");
			FileInputStream fis = new FileInputStream(file);    // 입력스트림 
			
			/*while(true) {
				int ch = fis.read(); 	//apple (-1) // apple의 마지막 값이 -1인데 -1 이 들어오면 밖으로 빠진다
				if(ch == -1) break;
				System.out.println(ch + "\t" + (char) ch);
			} */
			
			// 주석과 똑같은 말임 
			int ch;
			while((ch=fis.read()) !=-1) {
				System.out.println(ch + "\t" + (char) ch);
			}
			
			fis.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력시 에러");
			e.printStackTrace();
		}
		
	}

}
