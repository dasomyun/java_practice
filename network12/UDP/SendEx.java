package network12.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class SendEx {

	public static void main(String[] args) {

		DatagramSocket soc = null;
		DatagramPacket dp = null;
		
		try {
			System.out.println("발신 시작 ... ");
			
			for(int i=1; i<=5; i++) {
				String data = "MSG" + i;
				
				InetSocketAddress isa = new InetSocketAddress("211.63.89.103", 9898);
				dp = new DatagramPacket(data.getBytes(), data.getBytes().length, isa);
				soc = new DatagramSocket();
				soc.send(dp);
				
			}
			
			System.out.println("발신종료 ... ");
			
		} catch(Exception e) {
			System.out.println("SendEx Error");
			e.printStackTrace();
		} finally { 
			if(soc != null) soc.close();
		}
		
	}

}
