package ch03;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 18.
 * @내용 : 2차원 double 타입 배열 , 배열 선언 방법
 */

public class Exam37 {

	public static void main(String[] args) {
		double score[][] = new double [][] {{3.3, 3.4},
											{3.5, 3.6},
											{3.7, 4.0},
											{4.0, 4.2}}; 
		double sum = 0;
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++){
				sum=sum+score[i][j];
			}
		}
		
		System.out.println("sum : " + sum);		
		System.out.println("avg : " + (sum/(score.length*score[0].length)));
											
		//배열 선언 방법
		int [][] a = new int[][] {{},{}};
		int b[][]  = new int [][] {{},{}};
		int c[][] = {{},{}};
		
		int [][] x;
		//x={{},{}};
		x=new int[][] {{},{}};
											
		
	}

}
