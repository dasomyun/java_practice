package ch05.quiz02;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 12.
 * @Author : 좌민혜
 * @Description :  클래스2- 실습문제 26) 전화번호입력
 */

class Phone{
	private String name, tel;
	private Scanner sc;
	public Phone(){
		sc=new Scanner(System.in);
		
		System.out.print("이름 입력 >>>");
		this.name=sc.next();
		
		System.out.print("전화번호 입력 >>>");
		this.tel=sc.next();
	}
	
	public String getName(){
		return name;
	}
	
	public String getTel(){
		return tel;
	}
	
}

public class Quiz26 {
	public static void main(String[] args) {
		Phone kim=new Phone();
		Phone lee=new Phone();
		System.out.println(kim.getName() + "\t" + kim.getTel());
		System.out.println(lee.getName() + "\t" + lee.getTel());
	}
}
