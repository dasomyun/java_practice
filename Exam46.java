package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call By Value
 */
import java.util.Scanner;
public class Exam46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("KOR : ");
		int kor = sc.nextInt();
		
		System.out.print("ENG : ");
		int eng = sc.nextInt();
		
		System.out.print("MAT : ");
		int mat = sc.nextInt();
		
		total( kor, eng, mat );
		average( kor, eng, mat );
		
		sc.close();
		
	}
	
	public static void total( int kor, int eng, int mat){
		int tot = kor + eng + mat;
		System.out.println("TOT : " + tot);
	}
	
	public static void average (int kor, int eng, int mat){
		float avg = (float)(kor+eng+mat)/3;
		System.out.println("AVG : " + avg);
		
	}

}
