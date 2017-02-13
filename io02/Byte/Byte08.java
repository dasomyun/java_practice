package io02.Byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 13.
 * @내용 : 이미지파일 , 엑셀파일 읽고 쓰기 ( 05번 예제를 버퍼 이용하기 ) *중요*
 */

// 파일 업로드 (input, output)시 이 예제를 가장 많이 사용
// 동영상, 멀티미디어파일도 가능 

public class Byte08 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
				
		try {
	
			fis = new FileInputStream("C:\\Users\\sist\\Desktop\\메모리 영역.xlsx");
			bis = new BufferedInputStream(fis,1024);
			
			fos = new FileOutputStream("C:/Temp/byte/memory.xlsx");
			bos = new BufferedOutputStream(fos, 1024); // fos 만 써도 됨 1024가 디폴트 
			
			byte[] data = new byte[65536];
			
			while(true) {
				int count = bis.read(data);
				if(count==-1) break;
				
				bos.write(data);
			}
			
			bos.flush();
			System.out.println("출력 완료");
			
		} catch(FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("파일 입출력시 에러");
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close();
				if(fos != null) fos.close();
				if(bis != null) bis.close();
				if(fis != null) fis.close();
				
			} catch(Exception e) {
				System.out.println("close 에러 발생");
				e.printStackTrace();
			}
		}
		
	}

}
