package network04.TCP;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 16.
 * @내용 : 클라이언트 --> 보내기 
 */

public class ClientEx {

	public static void main(String[] args) {
		
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;
		
		try {
			InetSocketAddress isa = new InetSocketAddress("211.63.89.103",7890);
			socket = new Socket();
			socket.connect(isa);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow,512);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);
		
			System.out.print("전송할 문자 : ");
			String msg = sc.nextLine();
			
			pw.write(msg);
			pw.flush();
			
		} catch (Exception e) {
			System.out.println("ClientEx Error");
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();
				if(pw != null) pw.close();
				if(bw != null) bw.close();
				if(ow != null) ow.close();
				if(os != null) os.close();
				if(socket != null) socket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		} 
		
	}

}
