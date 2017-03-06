package ch05.quiz02;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 12.
 * @Author : 좌민혜
 * @Description :  클래스2- 실습문제 27) 정사각형 넓이 구하기
 */

class Rect{
	private int width, height;
	public Rect(int width,  int height){
		this.width=width;
		this.height=height;
	}
	
	public int getArea(){
		return width*height;
	}
}

public class Quiz27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rect[] array=new Rect[4];
		
		for(int i=0;i<array.length;i++){
			System.out.print("너비와 높이>>");
			int width=sc.nextInt();
			int height=sc.nextInt();
			
			array[i]=new Rect(width, height);
		}

		for(int i=0;i<array.length;i++){
			System.out.println((i+1) + "번째 정사각형의 넓이는 " + array[i].getArea() + "입니다");
		}
		sc.close();
	}
}
