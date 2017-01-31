package ch06;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31
 * @내용 : 11. 인원수를 입력 받아 총점, 평균을 구하는 성적표를 작성하세요
 */

import java.util.Scanner;

public class ArrayQuiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("인원수를 입력하세요 : ");
		int inwon = sc.nextInt();
		
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] mat = new int[inwon];
		int[] eng = new int[inwon];
		int[] tot = new int[inwon];
		float[] avg = new float[inwon];
		
		
		for(int i=0; i<inwon; i++) {
			System.out.print("이름 : ");
			name[i] = sc.next();
			System.out.print("국어 : ");
			kor[i] = sc.nextInt();
			System.out.print("수학 : ");
			mat[i] = sc.nextInt();
			System.out.print("영어 : ");
			eng[i] = sc.nextInt();
			tot[i] = kor[i] + mat[i] + eng[i] ;
			avg[i] = (float)tot[i]/inwon;
		}
		
		System.out.println("이름\t영어\t수학\t총점\t평균");
		for(int i=0; i<inwon; i++) {
			System.out.println(name[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + tot[i] + "\t" + avg[i]);
		}
		
		sc.close();
	}

}
