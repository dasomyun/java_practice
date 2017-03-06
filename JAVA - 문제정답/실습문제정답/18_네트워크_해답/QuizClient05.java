package network13.Quiz;

import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class QuizClient05 {
	public static void main(String[] args) {
		OutputStream is=null;
		BufferedOutputStream bos=null;
		Socket socket=null;
			
		try{
			socket=new Socket("localhost", 8080);
			is=socket.getOutputStream();
			bos=new BufferedOutputStream(is, 514);
			
			byte[] array=new byte[]{'A', 'B', 'C', 'D', 'E', 'F'};
			bos.write(array);
			bos.flush();
			System.out.println("전송 완료");
			
		}catch(UnknownHostException e){
			System.out.println("호스트가 존재하지 않습니다." + e);
		}catch(IOException e){
			System.out.println("네트워크 입출력시 에러가 발생하였습니다." + e);
		}finally{
			try{
				if(socket !=null) socket.close();
				if(is !=null) socket.close();
				if(bos !=null) socket.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
