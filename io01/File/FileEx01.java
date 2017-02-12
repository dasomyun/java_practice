package io01.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 10.
 * @내용 : File - 파일 정보들
 */

public class FileEx01 {

	public static void main(String[] args) {
		// 뭔지 모를때 for문으로 돌려보기 file[]가 뭐지? 하고 찍어보기 
		// 함수가 뭔지 많이 찍어보기 
		
		File[] roots = File.listRoots();
		
		for(int i=0; i<roots.length; i++) {
			System.out.println(i + ":" + roots[i]);
		}
		
		System.out.println("\n\n");
		
		File file = new File("C:\\dsy\\java\\workspace\\pro03\\src\\api13\\Queue");  //  \\ /  // 기억해두기
		System.out.println(file.exists());  // 존재 여부의 메서드
		
		if(file.exists()) {
			String[] str = file.list();
			// System.out.println(file.isFile());
			
			for(int i=0; i<str.length; i++) {
				System.out.println(str[i]);
			}
			
		}
		
		File f = new File ("C:\\dsy\\java\\workspace\\pro03\\src\\api13\\Queue","Queue01.java"); // 기억해두기
		System.out.println(f.exists());
		System.out.println(f.isFile());
		
		if(f.exists() && f.isFile()) {
			System.out.println("파일명 : " + f.getName());
			System.out.println("경로명 : " + f.getParent());
			System.out.println("파일&경로 : " + f.getAbsolutePath());	// 잊어버리지 말기 !
			System.out.println("쓰기기능 : " + f.canWrite());
			System.out.println("읽기기능 : " + f.canRead());
			System.out.println("파일크기 : " + f.length() + "byte");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date(f.lastModified());
			
			System.out.println(date);
		}
		
		
		
	}

}
