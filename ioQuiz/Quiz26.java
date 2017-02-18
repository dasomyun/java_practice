package ioQuiz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 18.
 * @내용 : 26. 다음 아래의 출력화면을 보시고 파일로 출력하세요 (문자 스트림 방식)
 */

public class Quiz26 {

	public static void main(String[] args) {

		Scanner sc = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		
		try {
			fw = new FileWriter("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz26.txt"); 
			bw = new BufferedWriter(fw,1024);
			pw = new PrintWriter(bw);
			
			sc = new Scanner(System.in);
			System.out.println("데이터를 입력해주세요 ");
			
			while(true){
				String data = sc.nextLine();
				if(data.equalsIgnoreCase("Q")) {
					System.out.println("종료되셨습니다");
					break;
				}
				pw.println(data);
			}
			
			
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();
				if(bw != null) bw.close();
				if(fw != null) fw.close();
				if(pw != null) pw.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
