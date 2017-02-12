package io01.File;

import java.io.File;
import java.io.IOException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 10.
 * @내용 : File - 디렉토리 파일 생성 , 삭제 
 */

public class FileEx02 {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("C:\\Temp\\Dir");	// 경로만듬
		System.out.println("디렉토리 존재여부 : " + dir.exists());
		
		if(dir.exists() == false) {
			dir.mkdirs();	// 디렉토리 생성
			System.out.println("디렉토리 만들어짐");
		}
		
		File file = new File(dir, "abc.txt");	 
		if(dir.exists() == true) {
			if(file.isFile() == false){
				file.createNewFile(); 	// 만들어진 경로에 abc.txt 생성
				System.out.println("존재합니다");
			}
		}
		
		// 삭제 
		if(dir.exists() && file.isFile()) {
			file.delete();
			System.out.println("파일 삭제");
			
			dir.delete();
			System.out.println("디렉토리 삭제");
		}	
		
	}

}
