package io03.Char;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : 채팅 - 예제01 읽어오기  
 */

public class String02 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Temp\\byte\\c.txt");
			br = new BufferedReader(fr, 1024);
			
			while (true) {
				String str = br.readLine();	// 한줄 읽어오기 (엔터키 누르기 전이 한줄)
				if( str == null) break;
				System.out.println(str);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
