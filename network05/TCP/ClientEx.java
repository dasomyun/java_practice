package network05.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		//보내기
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;
		
		//받기
		BufferedReader br = null;
		
		
		try{
			socket = new Socket("211.63.89.103", 2323);
			
		//출력
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw = new PrintWriter(bw);
			
			System.out.print("전송할 문자 : " );
			sc = new Scanner(System.in);
			String msg = sc.nextLine();
			pw.println(msg);
			pw.flush();
			
		//입력
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			String reply = br.readLine();
			System.out.println("서버 보내준 답변 : " + reply);
			
			
		} catch(Exception e) {
			System.out.println("ClientEx ERROR!");
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();
				if(pw != null) pw.close();
				if(bw != null) bw.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
