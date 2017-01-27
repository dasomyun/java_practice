package practice;
/* 내용 : 난 정말 java를 공부한 적이 없다구요 p349
 * 2차원 배열 예제
 */

public class TwoDimenArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		
		for(int i=0; i<3; i++)
			for(int j=0; j<4; j++)
				arr[i][j]=i+j;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println("");

		}
	}

}
