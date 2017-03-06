package ch03.quiz;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 3.
 * @Author : 강사
 * @Description :  배열 실습문제 11번
 *                      문제11) 인원수를 입력 받아 총점, 평균을 구하는 성적표를 작성하세요.
 */

public class Quiz11 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);

		System.out.print("인원수를 입력하세요:");
		int inwon=sc.nextInt();
		
		String[] name=new String[inwon];
		int[] kor=new int[inwon];
		int[] eng=new int[inwon];
		int[] mat=new int[inwon];
		int[] tot=new int[inwon];
		float[] avg=new float[inwon];
		
		for(int i=0;i<inwon;i++){
			System.out.print("이름:");
			name[i]=sc.next();
			
			System.out.print("국어:");
			kor[i]=sc.nextInt();
			
			System.out.print("수학:");
			mat[i]=sc.nextInt();
			
			System.out.print("영어:");
			eng[i]=sc.nextInt();
			System.out.println();
		}
		
		for(int i=0;i<inwon;i++){
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=(float)tot[i]/3;
		}
		
		System.out.println("이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t");
		for(int i=0;i<inwon;i++){
			System.out.println(name[i] + "\t" + kor[i] + "\t" + mat[i] + "\t" + eng[i] 
			                    + "\t" + tot[i] + "\t" + avg[i]);
		}
		
		sc.close();
	}
}





