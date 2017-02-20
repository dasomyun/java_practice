package network09.File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 20.
 * @���� :  ��Ʈ��ũ�� ���� ���� �а� ���� ( PC : Input , FTP ���� : Output )
 */

public class ClientUp {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		Socket socket = null;
		BufferedOutputStream bos = null;
		
		try {
			
			// �� PC���� ���� �о���� 
			fis = new FileInputStream("C:\\Temp\\up\\Penguins.jpg");
			bis = new BufferedInputStream(fis, 512);
			
			socket = new Socket("211.63.89.103",5959);
			bos = new BufferedOutputStream(socket.getOutputStream(), 512);	
			
			byte[] bytes = new byte[100];
			
			while(true) {
				int count = bis.read(bytes);
				if(count == -1) break;
				
				// ���� ���
				bos.write(bytes);
			}
			
			bos.flush();
			System.out.println("���� �������� �Ϸ�");
			
		} catch(Exception e) {
			System.out.println("ClinetUp Error");
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
				if(bos != null) bos.close();
				if(socket != null) socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
