package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call By Value 
 */

import java.util.Scanner;

public class Exam45 {

	public static void main(String[] args) {	//내 파일 바깥은 다 스트링 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력 : ");
		String name =sc.next();
		
		System.out.print("주민번호 입력(생년월일) : ");
		String juminBunho=sc.next(); 	//123456-1234567
		
		System.out.print("주소입력 :");
		String address = sc.next();
		
		output(name, juminBunho, address);
		
		sc.close();
	}
	
	public static void output(String n, String j, String a){
		System.out.println("이름 : " + n);
		System.out.println("주민번호 : " + j);
		System.out.println("주소 : " + a);
		
		
	}
	

}
