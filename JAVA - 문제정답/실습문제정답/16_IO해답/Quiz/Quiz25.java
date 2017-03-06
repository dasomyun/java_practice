package io06.Quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Quiz25 {
	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try{
			file=new File("C:/Temp/quiz/quiz25.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr, 1024);
			
			while(true){
				String str=br.readLine();
				if(str==null) break;
				
				StringTokenizer token=new StringTokenizer(str);
				int sum=0;
				while(token.hasMoreTokens()){
					// System.out.println(token.nextToken() + "\t");
					sum=sum+Integer.parseInt(token.nextToken());
				}
				
				System.out.println("합은:" + sum);
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
		}
	}
}
