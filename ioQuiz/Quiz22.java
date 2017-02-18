package ioQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 18.
 * @내용 : 22. 다음 quiz22.txt 파일으 ㄹ만든 후 맨 앞에 행 번호를 붙여서 출력하는 프로그램을 작성하세요 (문자 스트림 방식) 
 */
public class Quiz22 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			// 출력
			fw = new FileWriter("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz22.txt");
			bw = new BufferedWriter(fw,1024);
			pw = new PrintWriter(bw);
			
			String[] str = new String[] {"cat" , "고양이" , "dog" , "개" , "rabbit", "토끼" };
			for(int i=0; i<str.length; i++){
				pw.println(str[i]);
			}
			
			pw.flush();
			System.out.println("출력완료 \n");
			
			
			//입력
			fr = new FileReader("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz22.txt");
			br = new BufferedReader(fr, 1024);
			
			for(int i=1; i<7; i++){
				String str2= br.readLine();
				if(str2 == null) break;
					System.out.println( i + "\t" + str2);
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(pw != null) pw.close();
				if(fr != null) fr.close();
				if(br != null) br.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
