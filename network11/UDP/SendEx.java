package network11.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 20.
 * @내용 : time, date, datetime을 입력하면 시간, 날짜, 날짜시간 출력
 * 			*기술 문제에 많이 나옴*
 */

public class SendEx {
	public static void main(String[] args) {
		
		DatagramSocket soc = null;
		DatagramPacket dp = null;
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.print("선택하세요(time, date, datetime) : ");
			String data = sc.next();
			
			// 내용 보내기 (time, date, datetime)
			InetSocketAddress isa = new InetSocketAddress("211.63.89.103" , 7878);
			dp = new DatagramPacket(data.getBytes(),data.getBytes().length, isa);
			
			isa = new InetSocketAddress(5656); // 클라이언트 주소로 받기 때문에 ip주소 안써줌
			soc = new DatagramSocket(isa);
			soc.send(dp);
			
			// 내용 받기 
			byte[] arrBy = new byte[65536];
			dp = new DatagramPacket(arrBy, arrBy.length);
			soc.receive(dp);
			
			String str = new String(dp.getData(),0,dp.getLength(), "euc-kr");
			System.out.println("서버에서 온 내용 : " + str);
			
		} catch(Exception e) {
			System.out.println("SendEx error!");
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();		
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
