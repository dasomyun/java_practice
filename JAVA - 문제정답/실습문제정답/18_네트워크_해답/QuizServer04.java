package network13.Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer04 {
	public static void main(String[] ar){
		InputStreamReader isr=null;
		BufferedReader br=null;
		Socket soc=null;
		ServerSocket ss=null;
		
		try{
			ss=new ServerSocket(1234);				
			System.out.println("서버 준비 중입니다.");
			soc=ss.accept();								
			
			isr=new InputStreamReader(soc.getInputStream());
			br=new BufferedReader(isr, 512);
			
			while(true){
				String data=br.readLine();
		
				if(data.equalsIgnoreCase("Q") ) {
					System.out.println("챗팅을 종료입니다.");
					break;
				}
				
				System.out.println("전송받은 메시지:"  + data + "\t\t" + soc.getInetAddress());	
			}
		
		}catch(IOException e){
			System.out.println("네트워크 입출력시 에러가 발생하였습니다");
			e.printStackTrace();
		}finally{
			try{
				if(br !=null) br.close();
				if(isr !=null) isr.close();
				if(soc !=null) soc.close();
				if(ss !=null) ss.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
