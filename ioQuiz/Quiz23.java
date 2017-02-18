package ioQuiz;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 18.
 * @내용 : 23. 다음 quiz23.txt 파일을 만든 후 모두 대문자로 바꿔서 출력하는 프로그램을 작성하세요 (이진 스트림 방식)
 */

public class Quiz23 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz23.txt");
			bis = new BufferedInputStream(fis,1024);
			
			byte[] data = new byte[65536];
			while(true){
				int count = bis.read(data);
				if(count == -1) break;	
				String str = new String(data,0,count);
				System.out.println(str.toUpperCase());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(bis != null) bis.close();				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
