package io02.Byte;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : 보조 스트림 - DataInputStream / DataOutputStream
 * 						바이트 스트림에서 자바의 기본 데이터 타입을 입출력
 * 						(이런게 있구나 정도만) 
 */

public class Byte09 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("C:\\Temp\\byte\\sub.dat");
			dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeDouble(95.3);
			dos.writeInt(10);
			
			dos.flush();
			System.out.println("출력 완료");
			
		} catch(FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("파일 입출력시 에러");
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
				if(fos != null) fos.close();
			} catch (Exception e) {
				System.out.println("close 에러 발생");
				e.printStackTrace();
			}
		}
		
	}

}
