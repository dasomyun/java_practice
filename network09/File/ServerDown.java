package network09.File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 20.
 * @���� : ���� �Խ��ǿ��� ���� ���ε忡�� �� ����ϴ� �����̹Ƿ� �𸣸� �ܿ������� ���� !!! 
 */

public class ServerDown {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedInputStream bis = null;

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// Ŭ���̾�Ʈ���� ���� �б� 
			serverSocket = new ServerSocket(5959);
			System.out.println("������ ������ ��ٸ��� �ֽ��ϴ�");

			socket = serverSocket.accept();
			bis = new BufferedInputStream(socket.getInputStream(),512);
			
			File file = new File("C:\\Temp\\down\\Penguins.jpg");
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos,512);
			
			byte[] bytes = new byte[100];
			
			while(true) {
				int count = bis.read(bytes);
				if(count == -1) break;
				
				// FTP ���� ����
				bos.write(bytes);
				bos.flush();
			}
			
			System.out.println("���� �ޱ� �Ϸ�");

			if(file.isFile()){
				System.out.println("���� �̸� : " + file.getName());
				System.out.println("���� ��� : " + file.getAbsolutePath());
			}
			
		} catch(Exception e) {
			System.out.println("ServerDown Error");
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close();
				if(fos != null) fos.close();
				if(bis != null) bis.close();				
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();

			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
