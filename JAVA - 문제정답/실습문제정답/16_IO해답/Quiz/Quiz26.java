package io06.Quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz26 {
	public static void main(String[] args) {
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		Scanner sc=null;
		
		try{
			file=new File("C:/Temp/quiz/quiz26.txt");
			fw=new FileWriter(file);
            bw=new BufferedWriter(fw, 1024);

            sc=new Scanner(System.in);
            System.out.println("데이터를 입력해 주세요. (종료: Q)");
            while(true){
            	String str=sc.nextLine();
            	if(str.equalsIgnoreCase("Q")) break;
            	bw.write(str + "\r\n");
            }
            
            System.out.println("종료되었습니다.");
            bw.flush();
		}catch(FileNotFoundException e){
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}finally{
			try{
				if(sc !=null) sc.close();
				if(fw !=null) fw.close();
				if(bw !=null) bw.close();
			}catch(Exception e){
				System.out.println("Cloase Error");
				e.printStackTrace();
			}
		}
	}
}
