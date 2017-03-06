package network13.Quiz;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class QuizClient04 {
	public static void main(String[] args) {
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Socket soc=null;
		Scanner sc=null;
		
		try{
			soc=new Socket("localhost", 1234);
			osw=new OutputStreamWriter(soc.getOutputStream());		
			bw=new BufferedWriter(osw, 512);
			pw=new PrintWriter(bw);
			
			sc=new Scanner(System.in);
			String data=null;
			
			while(true){
				System.out.print("전송할 메시지는:");
				data=sc.nextLine();
				pw.println(data);
				pw.flush();
				
				if(data.equalsIgnoreCase("Q")){
					System.out.println("챗팅을 종료입니다.");
					break;                         
				}
			}

		}catch(UnknownHostException e){
			System.out.println("호스트가 존재하지 않습니다." + e);
		}catch(IOException e){
			System.out.println("네트워크 입출력시 에러가 발생하였습니다." + e);
		}finally{
			try{
				if(soc !=null) soc.close();
				if(osw !=null) osw.close();
				if(bw !=null) bw.close();
				if(pw !=null) pw.close();
				if(sc !=null) sc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
