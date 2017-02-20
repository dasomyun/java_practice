package network09.File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 20.
 * @내용 : 웹의 게시판에서 파일 업로드에서 꼭 사용하는 문제이므로 모르면 외울정도로 숙지 !!! 
 */

public class ServerDown {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedInputStream bis = null;

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// 클라이언트에게 파일 읽기 
			serverSocket = new ServerSocket(5959);
			System.out.println("서버가 연결을 기다리고 있습니다");

			socket = serverSocket.accept();
			bis = new BufferedInputStream(socket.getInputStream(),512);
			
			File file = new File("C:\\Temp\\down\\Penguins.jpg");
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos,512);
			
			byte[] bytes = new byte[100];
			
			while(true) {
				int count = bis.read(bytes);
				if(count == -1) break;
				
				// FTP 서버 저장
				bos.write(bytes);
				bos.flush();
			}
			
			System.out.println("파일 받기 완료");

			if(file.isFile()){
				System.out.println("파일 이름 : " + file.getName());
				System.out.println("파일 경로 : " + file.getAbsolutePath());
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
