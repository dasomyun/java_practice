package network13.Quiz;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class QuizServer05 {
	public static void main(String[] ar){
		InputStream is=null;
		BufferedInputStream bis=null;
		Socket soc=null;
		ServerSocket ss=null;
		
		try{
			ss=new ServerSocket(8080);				
			System.out.println("서버 준비 중입니다.");
			soc=ss.accept();							
			is=soc.getInputStream();
			bis=new BufferedInputStream(is, 512);
			
			while(true){
				int cnt=bis.read();
				if(cnt==-1) break;
				System.out.print((char) cnt + "\t");
			}
		
		}catch(IOException e){
			System.out.println("네트워크 입출력시 에러가 발생하였습니다");
			e.printStackTrace();
		}finally{
			try{
				if(bis !=null) bis.close();
				if(is !=null) is.close();
				if(soc !=null) soc.close();
				if(ss !=null) ss.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}



