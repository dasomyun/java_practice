package io03.Char;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : 채팅 - 키보드에서 파일로 넘기기 ( PrintWriter ) *중요*
 */

public class String01 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null; 	// 프린터 보조 스트림 (PrintStream, PrintWriter) , 웹에서 많이 씀 
		Scanner sc = null;
		
		try {
			fw = new FileWriter("C:\\Temp\\byte\\c.txt");
			bw = new BufferedWriter(fw,1024);
			pw = new PrintWriter(bw);
			
			System.out.println("문자열을 입력하세요");
			sc = new Scanner(System.in);
			
			while(true) {
				
				String msg = sc.nextLine();	 // String이 아닌 한 줄씩 읽어들여야 하기 때문 
				
				if(msg.equalsIgnoreCase("q")) break;
				
				// bw.write(msg + "\r\n");		// 줄바뀜이 안되기 때문에 (붙어나오기 때문에) 엔터값처리 
				pw.println(msg);
				pw.flush();		
			}
			
			System.out.println("출력되었습니다");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) pw.close();
				if(sc != null) sc.close();
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch(Exception e) {
				System.out.println("close error");
				e.printStackTrace();
			}
		}
		
	}

}
