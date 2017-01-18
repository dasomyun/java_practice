package ch03;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 18.
 * @내용 : 2차원 배열
 */

public class Exam35 {

	public static void main(String[] args) {
		int[][] array = new int[][] {{10, 20, 30}, 
									 {40, 50, 60}};
									 
		System.out.println(array[0][1] + "\n");
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("배열의 행의 갯수 : " + array.length);
		System.out.println("배열의 1행의 열수 :" + array[0].length);
		System.out.println("배열의 2행의 열수 : " + array[1].length);
		
		for (int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
