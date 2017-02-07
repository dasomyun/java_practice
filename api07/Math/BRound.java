package api07.Math;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 7.
 * @내용 : java.lang의 math class의 반올림함수 
 * 			반올림(round), 무조건올림(ceil), 무조건내림(floor)
 */

public class BRound {

	public static void main(String[] args) {
		
		double x = 123.5672;
		double y = 456.4678;
		
		// 반올림 
		long a = (int)Math.round(x);
		System.out.println("a : " + a);
		// 무조건 올림
		int b = (int)Math.ceil(y);
		System.out.println("b : " + b);		
		// 무조건 내림
		int c = (int)Math.floor(x);
		System.out.println("c : " + c);
		
		// 소수 둘째 자리 반올림 , 첫째 자리까지 출력 
		// 123.5672   123.6
		double r = Math.round(x*10)/10.0;
		System.out.println("r : " + r);
		
		// 소수 셋째 자리 반올림, 둘째 자리까지 출력
		double rr = Math.round(x*100)/100.0;
		System.out.println("rr : " + rr);
		
		// 소수 넷째 자리 반올림 , 셋째 자리까지 출력
		double rrr = Math.round(x*1000)/1000.0;
		System.out.println("rrr : " + rrr);
		
		// 소수 셋째 자리 올림, 둘째 자리까지 출력 
		double k = Math.ceil(x*100)/100.0;
		System.out.println("k : " + k);
		
		// 소수 셋째 자리 내림, 둘째 자리까지 출력 
		double i = Math.floor(x*100)/100.0;
		System.out.println("i : " + i + "\n\n");
		System.out.println("PI : " + Math.PI);
		
		double pi = Math.floor(Math.PI*1000000)/(double)1000000;
		System.out.println("pi : " + pi);
		
	}

}
