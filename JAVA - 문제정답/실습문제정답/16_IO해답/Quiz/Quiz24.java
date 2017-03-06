package io06.Quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Quiz24 {
	public static void main(String[] args){
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("문자를 입력:");
		String word=sc.next();
		
		try{
			file=new File("C:\\Temp\\quiz\\quiz22.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr, 1024);
			
			while(true){
				String str=br.readLine();
				if(str==null) break;
				if(word.equals(str)) {
					System.out.println("동일한문자열 존재합니다.[" + str + "]");
				}else{
					System.out.println("동일한문자열 존재하지 않습니다.");
				}
			}

		}catch(FileNotFoundException e){
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다." );
			e.printStackTrace();
		}finally{
			try{
				if(br !=null) br.close();
				if(fr !=null) fr.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
			
			sc.close();
		}
	}
}
