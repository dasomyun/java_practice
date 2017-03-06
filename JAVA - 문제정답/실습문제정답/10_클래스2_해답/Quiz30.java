package ch05.quiz02;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 12.
 * @Author : 좌민혜
 * @Description :  클래스2- 실습문제 29) 반성적표
 */

class SungJuk{
	private String name;
	private int kor, eng, mat, tot;
	private float avg;
	private Scanner sc;
	
	private static int banTot;
	private static float banAvg;
	private static int inwon;
	
	public SungJuk(){
		++inwon;
		
		sc=new Scanner(System.in);
		
		System.out.print("이름:");
		name=sc.next();
		
		System.out.print("국어:");
		kor=sc.nextInt();
		
		System.out.print("영어:");
		eng=sc.nextInt();
		
		System.out.print("수학:");
		mat=sc.nextInt();
		
		System.out.println();
	}
	
	public void total(){
		tot=kor+eng+mat;
	}
	
	public void average(){
		avg=(float)tot/3;
	}
	
	public void banTotal(){
		banTot=banTot+tot;
	}
	
	public void banAverage(){
		banAvg=banTot/(inwon*3);
	}
	
	public void disp(){
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
	}
	
	public static void title(){
		System.out.println("이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t"+ "평균\t");
	}
	
	public static void banDisp(){
		System.out.println("====================");
		System.out.print("반총점:" + banTot + "\t");
		System.out.print("반평균:" + banAvg + "\t");
		System.out.println("인원수:" + inwon);
	}
}

public class Quiz30 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("인원수 입력:");
		int inwon=sc.nextInt();
		
		SungJuk[] array=new SungJuk[inwon];		
		for(int i=0;i<array.length;i++){
			array[i]=new SungJuk();
		}
		
		SungJuk.title();
		for(int i=0;i<array.length;i++){
			array[i].total();
			array[i].average();
			array[i].disp();
			array[i].banTotal();
			array[i].banAverage();
		}
		SungJuk.banDisp();
				
		sc.close();
	}
}
