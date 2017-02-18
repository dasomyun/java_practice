package ioQuiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 18.
 * @내용 : 24. 다음 quiz22.txt 파일을 읽어온 후 , 키보드로 입력 받아 동일한 문자열이 있는 경우 출력하는 프로그램을 작성하세요 (문자 스트림 방식)
 */

public class Quiz24 {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		Scanner sc = null;
		
		try {
			fr = new FileReader("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz22.txt");
			br = new BufferedReader(fr,1024);
			
			sc = new Scanner(System.in);
			System.out.print("문자를 입력 : ");
			String search = sc.next();
			
			while(true) {
				String str3 = br.readLine();
				if(str3 == null) break;
				if(search.equals(str3)){
					System.out.println("동일한 문자열이 존재합니다 ["+ search +"]");	
				} 
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
				if(sc != null) sc.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
