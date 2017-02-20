package network12.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveEx {
	public static void main(String[] args) {
		// �͸���Ŭ������ ������ Ŭ������ ���� 		
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				DatagramSocket soc = null;
				try {
					soc = new DatagramSocket(9898);
					System.out.println("���� �غ���");
					
					while(true) {
						byte[] arrBy = new byte[65536];
						DatagramPacket dp = new DatagramPacket(arrBy,arrBy.length);
						soc.receive(dp);
						
						String data = new String(dp.getData(),0,dp.getLength());
						Thread.sleep(1000);					                                                                                                                                                                                                                                                        	
						System.out.println("���� ���� : " + data);
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
