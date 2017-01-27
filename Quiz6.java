package practice;
/* ���� : �� ���� java�� ������ ���� ���ٱ��� p355
 * [2���� �迭�� ���� Ȱ��]
 * ����2. ������ ���·� ǥ���� 2���� �迭�� �����Ѵٰ� �����غ���.
 * 1	2	3
 * 4	5	6	
 * 7	8	9
 * �̷��� ���¸� ���� int�� 2���� �迭�� ���ڷ� ���޵Ǹ� ������ ���·� �迭�� ������ �����Ű�� �޼ҵ带 �����غ���
 * 7	8	9
 * 1	2	3
 * 4	5	6
 */

public class Quiz6 {
	public static void change (int[][] arr){
		int[] last = arr[2];
		
		for(int i=2; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0] = last;
	}
	 
	public static void show (int[][] arr) {
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
		public static void main(String[] args) {
	
		int[][] arr = {{1,2,3},
					  {4,5,6},
					  {7,8,9}};
		
		System.out.println("�ٲٱ�");
		change(arr);
		show(arr);

	}
}

