package network11.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 20.
 * @내용 : time, date, datetime을 입력하면 시간, 날짜, 날짜시간 출력
			들어가는 소켓의 포트번호와 나가는 소켓의 포트번호를 다르게 해야 한다.
 */

public class ReceiveEx {

	public static void main(String[] args) {

		DatagramPacket dp = null;
		DatagramSocket soc = null;
		
		try {
			System.out.println("서버 준비중 ... ");
			
			// 데이터 받기
			InetSocketAddress isa = new InetSocketAddress(7878);
			soc = new DatagramSocket(isa);
			
			byte[] arrBy = new byte[65536];
			dp = new DatagramPacket(arrBy, arrBy.length);
			
			soc.receive(dp);
			String str = new String(dp.getData(),0,dp.getLength());
			
			Date date = new Date();
			SimpleDateFormat sdf= null;
			String msg = null;
			
			if(str.equals("time")) {
				 sdf = new SimpleDateFormat("HH:mm:ss");
				 msg = sdf.format(date);
			} else if(str.equals("date")) {
				sdf = new SimpleDateFormat("YYYY-MM-dd");
				msg = sdf.format(date);
			} else if(str.equals("datetime")){
				sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				msg = sdf.format(date);
			} else {
				System.out.println("잘못 입력하셨습니다");
			}
			
			// System.out.println(str + "\t\t" + msg);
			
			// 보내기
			isa = new InetSocketAddress(dp.getAddress(),5656);
			dp = new DatagramPacket(msg.getBytes("euc-kr"), msg.getBytes().length, isa);
			soc.send(dp);
			
			
		} catch(Exception e) {
			System.out.println("ReceiveEx error");
			e.printStackTrace();
		} finally {
			if(soc != null) soc.close();	
		}
		
	}

}
