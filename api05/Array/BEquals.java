package api05.Array;

import java.util.Arrays;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 7.
 * @내용 : api - 배열의 equals() 클래스 
 */

public class BEquals {

	public static void main(String[] args) {
		
		char[] a = {'J','A','V','A'};
		char[] b = a;	// 주소값 공유 
		char[] c = Arrays.copyOf(a,a.length);
		
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
		System.out.println("c: " + Arrays.toString(c));
		
		System.out.println("배열비교 주소값 : " + (a == b));	// 주소값 비교 
		System.out.println("배열비교 주소값 : " + (a == c));
		System.out.println("실제 데이터 값 비교 : " + (Arrays.equals(a, b))); // 실제 데이터 값 비교 
		System.out.println("실제 데이터 값 비교 : " + (Arrays.equals(a, c)));
		
		// 2차원 배열 
		int [][] original = {{1,2} , {3,4}};
		int [][] cloned = Arrays.copyOf(original, original.length);		// 복사하여 다른 주소값에 저장 
		
		System.out.println("배열의 주소값 비교 : " + (original == cloned));
		System.out.println("실제 데이터값 비교 : " + (Arrays.deepEquals(original, cloned)) + "\n"); // 2차원 배열에서 실제 데이터값 비교시 deepEquals 사용 
		// System.out.println("실제 데이터값 비교 : " + (Arrays.equals(original, cloned)));
		
		// 정렬 (내림차순, 오름차순)
		int [] scores = {97, 99, 2, 4, 55};
		System.out.println("데이터 : " + Arrays.toString(scores));
		Arrays.sort(scores);	// 원본 데이터가 영향 받음 
		System.out.println("오름차순 : " + Arrays.toString(scores)); 
		
		for(int i=(scores.length-1); i>=0; i--) {	// 내림차순
			System.out.print(scores[i] + "\t");
		}
		
		System.out.println("\n");
		
		String[] names = { "홍길동" , "박동수" , "김민수" };
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		for(int i=(names.length-1); i>=0; i--) {	// 내림차순 
			System.out.print(names[i] + "\t");
		}
		
	}

}
