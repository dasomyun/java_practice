package network03.TCP;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 16.
 * @내용 : 문자 1줄 보내기 
 */

public class ClientEx {

	public static void main(String[] args) {
		
		Socket socket = null;
		OutputStream os = null;
		BufferedOutputStream bos = null;
		Scanner sc = null;
		
		try {
			// 접속 IP , PORT
			InetSocketAddress isa = new InetSocketAddress("211.63.89.103", 1234);
			socket = new Socket();
			socket.connect(isa);
			
			// 소켓 connect()
			
			// 문자입력 --> Stream --> Socket
			os = socket.getOutputStream(); // socket의 getOutputStream()으로 나감 
			bos = new BufferedOutputStream(os, 512);
			
			sc= new Scanner(System.in);
			System.out.print("전송할 내용 : ");
			String msg = sc.nextLine();
			
			bos.write(msg.getBytes("UTF-8"));  // getBytes 바이트로 변환
			bos.flush();
			
		} catch (Exception e) {
			System.out.println("ClientEx Error");
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(os != null) os.close();
				if(bos != null) bos.close();
				if(sc != null) sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
