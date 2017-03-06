package ch09.quiz;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("수를 입력하세요:");
		String su=sc.next();
		
		try{
			if(su.length() !=10){
				NumberFormatException e=new NumberFormatException();
				throw e;
			}
			System.out.println("입력하신 수는" + Integer.parseInt(su)  + "입니다.");
		}catch(NumberFormatException e){
			System.out.println("에러발생!! 정확히 10자리만 입력 가능합니다.");		
		}finally{
			sc.close();
		}
		
		sc.close();

	}

}
