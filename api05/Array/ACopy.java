package api05.Array;

import java.util.Arrays;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 6.
 * @내용 : api = Arrays 클래스 : 배열관련된 클래스 
 */

public class ACopy {

	public static void main(String[] args) {
		char[] a = {'J','A','V','A'};
		char[] b = a;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(a == b);	 	//얕은 복사 (주소값만 복사 하는 것) //메모리공간 절약
		
		// 깊은 복사 - 전체복사 (데이터값도 복사 하는 것 , 힙영역 복사)
		// 메모리 손실 예방
		char [] c = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(c));
		System.out.println(a == c);
		
		// 부분복사	
		char[] d = Arrays.copyOfRange(a,1,3); // 1~2번지 까지
		System.out.println(Arrays.toString(d));
		
		
		
	}

}
