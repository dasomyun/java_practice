package network12.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveEx {
	public static void main(String[] args) {
		// 익명구현클래스를 쓰레드 클래스로 구현 		
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				DatagramSocket soc = null;
				try {
					soc = new DatagramSocket(9898);
					System.out.println("서버 준비중");
					
					while(true) {
						byte[] arrBy = new byte[65536];
						DatagramPacket dp = new DatagramPacket(arrBy,arrBy.length);
						soc.receive(dp);
						
						String data = new String(dp.getData(),0,dp.getLength());
						Thread.sleep(1000);					                                                                                                                                                                                                                                                        	
						System.out.println("받은 내용 : " + data);
					}
					
				} catch(Exception e) {
					System.out.println("ReceiveEx Error");
					e.printStackTrace();
				} finally {
					if(soc != null) soc.close();
				}
			}
		};
		thread.start();
	}
}
