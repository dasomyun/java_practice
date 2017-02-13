package io02.Byte;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : 보조 스트림 - DataInputStream / DataOutputStream
 */

public class Byte10 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("C:\\Temp\\byte\\sub.dat");
			dis = new DataInputStream(fis);
			
			String str = dis.readUTF();
			double value = dis.readDouble();
			int su = dis.readInt();
			
			System.out.println("str : " + str);
			System.out.println("value : " + value);
			System.out.println("su : " + su);
		
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력시 에러");
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
				if(fis != null) fis.close();
			} catch(Exception e) {
				System.out.println("close 에러 발생");
				e.printStackTrace();
			}
		}
		
	}
}
