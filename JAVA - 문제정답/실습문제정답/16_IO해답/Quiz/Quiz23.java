package io06.Quiz;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Quiz23 {
	public static void main(String[] args){
		File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try{
			file=new File("C:\\Temp\\quiz\\quiz23.txt");
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis, 1024);
			
			while(true){
				int cnt=bis.read();
				if(cnt==-1) break;
				String str=String.valueOf((char) cnt);
				System.out.print(str.toUpperCase());
			}
			
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾지 못하였습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}finally{
			try{
				if(bis !=null) bis.close();
				if(fis !=null) fis.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
	}
}
