package ch03;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 18.
 * @���� : 2���� �迭
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
		
		System.out.println("�迭�� ���� ���� : " + array.length);
		System.out.println("�迭�� 1���� ���� :" + array[0].length);
		System.out.println("�迭�� 2���� ���� : " + array[1].length);
		
		for (int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
