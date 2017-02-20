package network10.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;


/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 20.
 * @���� : �Է��� ���� 1�� �޴� Ŭ���� (DatagramSocket)
 */

public class ReceiveEx {

	public static void main(String[] args) {

		DatagramPacket dp = null;
		DatagramSocket soc = null;
			
		try {
			System.out.println("���� �غ��� ...");
			
			InetSocketAddress isa = new InetSocketAddress(2346);
			soc = new DatagramSocket(isa);
			
			byte[] arrBy = new byte[65536]; 
			dp = new DatagramPacket(arrBy, arrBy.length);
			soc.receive(dp);
			
			String str = new String(dp.getData(),0,dp.getLength(),"euc-kr");
			System.out.println("MSG : " + str);
			
		} catch(Exception e) {
			System.out.println("ReceiveEx error");
			e.printStackTrace();
		} finally {
			if(soc != null) soc.close();
		}
		
	}

}
