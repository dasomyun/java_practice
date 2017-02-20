package network11.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 20.
 * @���� : time, date, datetime�� �Է��ϸ� �ð�, ��¥, ��¥�ð� ���
 * 			*��� ������ ���� ����*
 */

public class SendEx {
	public static void main(String[] args) {
		
		DatagramSocket soc = null;
		DatagramPacket dp = null;
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.print("�����ϼ���(time, date, datetime) : ");
			String data = sc.next();
			
			// ���� ������ (time, date, datetime)
			InetSocketAddress isa = new InetSocketAddress("211.63.89.103" , 7878);
			dp = new DatagramPacket(data.getBytes(),data.getBytes().length, isa);
			
			isa = new InetSocketAddress(5656); // Ŭ���̾�Ʈ �ּҷ� �ޱ� ������ ip�ּ� �Ƚ���
			soc = new DatagramSocket(isa);
			soc.send(dp);
			
			// ���� �ޱ� 
			byte[] arrBy = new byte[65536];
			dp = new DatagramPacket(arrBy, arrBy.length);
			soc.receive(dp);
			
			String str = new String(dp.getData(),0,dp.getLength(), "euc-kr");
			System.out.println("�������� �� ���� : " + str);
			
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
