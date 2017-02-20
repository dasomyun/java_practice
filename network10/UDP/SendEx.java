package network10.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 20.
 * @내용 : 입력한 문자 1줄 보내는 클래스 (DatagramPacket)
 */

public class SendEx {
	public static void main(String[] args) {
		
		DatagramSocket soc = null;
		DatagramPacket dp = null;
		Scanner sc = null;
		
		try{	
			sc = new Scanner(System.in);
			System.out.print("전송할 데이터 : ");
			String data = sc.nextLine();
			
			InetSocketAddress isa = new InetSocketAddress("211.63.89.103",2346);
			soc = new DatagramSocket(); // 소포 주소 
			dp = new DatagramPacket(data.getBytes("euc-kr"), data.getBytes().length, isa); // 소포 무게 
			soc.send(dp);
			
		} catch(Exception e) {
			System.out.println("SendEx error");
			e.printStackTrace();
		} finally {
			if(sc != null) sc.close();
			if(soc != null) soc.close();
		}
		
	}
}

