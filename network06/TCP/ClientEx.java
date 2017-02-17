package network06.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 17.
 * @내용 : Q를 누르기 전까지 계속 주고받는거
 */

public class ClientEx {

	public static void main(String[] args) {
		
		Socket soc = null;
		
		// 출력
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		
		// 입력
		BufferedReader br = null;
		Scanner sc = null;
		
		try {
			// 출력
			soc = new Socket("211.63.89.103" , 1234);
			bw = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()),512);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);
			
			// 입력
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()),512);
			
			String outputMsg = null, inputMsg = null;
			
			while(true) {
				
				outputMsg = sc.nextLine();
				
				if(outputMsg.equalsIgnoreCase("Q")) {
					pw.println(outputMsg);
					pw.flush();
					break;
				}
				
				pw.println("클라이언트 >> " + outputMsg);
				pw.flush();
				
				inputMsg = br.readLine();
				System.out.println(inputMsg);
				
			}
			
			
		} catch (Exception e) {
			System.out.println("ClientEx error!");
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(sc != null) sc.close();
				if(pw != null) pw.close();
				if(soc != null) soc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
