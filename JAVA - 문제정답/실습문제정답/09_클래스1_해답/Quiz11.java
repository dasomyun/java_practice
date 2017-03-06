package ch05.quiz01;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 12.
 * @Author : 좌민혜
 * @Description :  클래스1 - 실습문제 11)
 */

class Employee{
	public String name;			// 이름
	public int number;			// 사번
	public int age;				// 나이
	public String title;			// 직함
	public String dept;			// 근무부서
	public String grade;		// 인사등급
	
	public void input(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름:");
		name=sc.next();
		
		System.out.print("사번:");
		number=sc.nextInt();
		
		System.out.print("나이:");
		age=sc.nextInt();
		
		System.out.print("직함:");
		title=sc.next();
		
		System.out.print("근무부서:");
		dept=sc.next();
		
		System.out.print("인사등급:");
		grade=sc.next();
		
		sc.close();
	}
	
	public void output(){
		System.out.println("\n" + name + "\t" + number + "\t" + age + "\t" + title + "\t" + dept + "\t" + grade);
	}
	
}
  
public class Quiz11 {
	public static void main(String[] ar){
		Employee emp=new Employee();
		emp.input();
		emp.output();
	}
}

