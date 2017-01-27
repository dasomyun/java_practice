package practice;
/* 내용 : 난 정말 java를 공부한 적이 없다구요 p355
 * [2차원 배열의 구조 활용]
 * 문제1. 다음 메소드는 int형 1차원 배열에 저장된 값을 두번째 매개변수로 전달된 값의 크기만큼 전부 증가시킨다.
 * 이 메소드를 기반으로 int형 2차원 배열에 저장된 값 전부를 증가시키는 메소드를 다음의 형태로 정의하자.
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
