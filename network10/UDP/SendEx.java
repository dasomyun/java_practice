package network10.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 20.
 * @���� : �Է��� ���� 1�� ������ Ŭ���� (DatagramPacket)
 */

public class SendEx {
	public static void main(String[] args) {
		
		DatagramSocket soc = null;
		DatagramPacket dp = null;
		Scanner sc = null;
		
		try{	
			sc = new Scanner(System.in);
			System.out.print("������ ������ : ");
			String data = sc.nextLine();
			
			InetSocketAddress isa = new InetSocketAddress("211.63.89.103",2346);
			soc = new DatagramSocket(); // ���� �ּ� 
			dp = new DatagramPacket(data.getBytes("euc-kr"), data.getBytes().length, isa); // ���� ���� 
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

