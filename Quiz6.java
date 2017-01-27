package practice;
/* 내용 : 난 정말 java를 공부한 적이 없다구요 p355
 * [2차원 배열의 구조 활용]
 * 문제2. 다음의 형태로 표현된 2차원 배열이 존재한다고 가정해보자.
 * 1	2	3
 * 4	5	6	
 * 7	8	9
 * 이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면 다음의 형태로 배열의 구조를 변경시키는 메소드를 정의해보자
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
		
		System.out.println("바꾸기");
		change(arr);
		show(arr);

	}
}

