package io02.Byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : 보조 스트림 - 겹쳐서 쓸수 있다?
 */

public class Byte11 {

	public static void main(String[] args) {
		 
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos  = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			File file = new File("C:\\Temp\\byte\\sub.dat");
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos,1024);
			dos = new DataOutputStream(bos); // bos 에게 보내주고 bos는 fos에게 보내줌 
			
			dos.writeUTF("홍길동");
			dos.writeDouble(98.8);
			dos.writeInt(10);
			dos.flush();
			System.out.println("출력완료");
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis,1024);
			dis = new DataInputStream(bis);
			
			String str = dis.readUTF();
			double value = dis.readDouble();
			int su = dis.readInt();		
			System.out.println(str + "\t" + value + "\t" + su);
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력시 에러");
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
				if(bis != null) bis.close();
				if(fis != null) fis.close();
				
				if(dos != null) dos.close();
				if(bos != null) bos.close();
				if(fos != null) fos.close();
			} catch(Exception e) {
				System.out.println("close 에러 발생");
				e.printStackTrace();
			}
		}
		
		
	}

}
