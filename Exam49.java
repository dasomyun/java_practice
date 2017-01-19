package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call By Value (배열)
 */

public class Exam49 {

	public static void main(String[] args) {
		int[] x = new int[] { 1 , 2 , 3 , 4 , 5 }; // x = 0x100
		int[] y = x; // y=x=0x100
		
		System.out.println("x : " + x.length);
		System.out.println("y : " + y.length);
	
		x = null;
		//System.out.println("x : " + x.length);
		System.out.println("y : " + y.length);
		
		y = null;	//프로그램 중간에 메모리값을 지워줄 수 있다
		
		int[] array = new int[] { 55 , 66 , 77 };	// array = 0x200
		sub(array);
		int [] arr = abc();
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void sub(int[] array){
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static int[] abc() {
		int[] arr = new int[] { 100, 200, 300 };
		return arr;
	}
	
	
}
