package network03.TCP;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 16.
 * @���� : ���� 1�� ������ 
 */

public class ClientEx {

	public static void main(String[] args) {
		
		Socket socket = null;
		OutputStream os = null;
		BufferedOutputStream bos = null;
		Scanner sc = null;
		
		try {
			// ���� IP , PORT
			InetSocketAddress isa = new InetSocketAddress("211.63.89.103", 1234);
			socket = new Socket();
			socket.connect(isa);
			
			// ���� connect()
			
			// �����Է� --> Stream --> Socket
			os = socket.getOutputStream(); // socket�� getOutputStream()���� ���� 
			bos = new BufferedOutputStream(os, 512);
			
			sc= new Scanner(System.in);
			System.out.print("������ ���� : ");
			String msg = sc.nextLine();
			
			bos.write(msg.getBytes("UTF-8"));  // getBytes ����Ʈ�� ��ȯ
			bos.flush();
			
		} catch (Exception e) {
			System.out.println("ClientEx Error");
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(os != null) os.close();
				if(bos != null) bos.close();
				if(sc != null) sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
