package ch03;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 18.
 * @���� : 2���� double Ÿ�� �迭 , �迭 ���� ���
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
											
		//�迭 ���� ���
		int [][] a = new int[][] {{},{}};
		int b[][]  = new int [][] {{},{}};
		int c[][] = {{},{}};
		
		int [][] x;
		//x={{},{}};
		x=new int[][] {{},{}};
											
		
	}

}
