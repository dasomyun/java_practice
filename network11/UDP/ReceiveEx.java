package network11.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 20.
 * @���� : time, date, datetime�� �Է��ϸ� �ð�, ��¥, ��¥�ð� ���
			���� ������ ��Ʈ��ȣ�� ������ ������ ��Ʈ��ȣ�� �ٸ��� �ؾ� �Ѵ�.
 */

public class ReceiveEx {

	public static void main(String[] args) {

		DatagramPacket dp = null;
		DatagramSocket soc = null;
		
		try {
			System.out.println("���� �غ��� ... ");
			
			// ������ �ޱ�
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
			
			// System.out.println(str + "\t\t" + msg);
			
			// ������
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
