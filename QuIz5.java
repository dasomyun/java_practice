package practice;
/* ���� : �� ���� java�� ������ ���� ���ٱ��� p355
 * [2���� �迭�� ���� Ȱ��]
 * ����1. ���� �޼ҵ�� int�� 1���� �迭�� ����� ���� �ι�° �Ű������� ���޵� ���� ũ�⸸ŭ ���� ������Ų��.
 * �� �޼ҵ带 ������� int�� 2���� �迭�� ����� �� ���θ� ������Ű�� �޼ҵ带 ������ ���·� ��������.
 */

public class QuIz5 {

	public static void addOneDArr(int[][] arr , int add) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] += add;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[][] arr ={{1,2,3},
					  {4,5,6,7}};
		
		QuIz5.addOneDArr(arr, 1);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
	}

}
