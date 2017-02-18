package ioQuiz;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 18.
 * @내용 : 25. 다음 quiz25.txt 파일을 만든 후, 각각 행의 합을 구하세요 (문자 스트림 방식)
 */

public class Quiz25 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz25.txt");
			br = new BufferedReader(fr, 1025);
			char[] c = new char[10]; 
			int sum1 = 0;
			
			for(int i=0; i<10; i++) {
				int count = br.read();
				if(count == 32) continue;	
				c[i] = (char)count;
			//	sum1 = Integer.parseInt(c[i]);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try{
				if(fr != null) fr.close();
				if(br != null) br.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
