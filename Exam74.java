package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 24.
 * @���� : Ŭ���� �迭 
 */

import java.util.Scanner;

class TestE {
	private String name;
	private int age;
	private Scanner sc;
	
	public void input() {
		sc = new Scanner(System.in);
		
		System.out.print("name : ");
		name = sc.next();
		
		System.out.print("age : ");
		age = sc.nextInt();
		
		System.out.println();
	}
	
	public void output(){
		System.out.println( name + "\t" + age );
	}
		
}

public class Exam74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο��� �Է� : ");
		int inwon = sc.nextInt();
		
		TestE[] e = new TestE[inwon];
		
		for(int i=0; i<e.length; i++) {
			e[i] = new TestE();
		}
		
		for(int i=0; i<e.length; i++) {
			e[i].input();
		}
		
		for(int i=0; i<e.length; i++) {
			e[i].output();
		}

		sc.close();
	}
}

