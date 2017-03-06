package api09.Quiz;

/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 30) 문자열 "123,456,777.5"를 소수점 첫 번째 자리에서 반올림 하고 
 *                                          그 값을 만단위다마 컴마(,)로 구분해서 출력
 */

import java.text.DecimalFormat;

public class Quiz30 {
	public static void main(String[] args) throws Exception{
		String str="123,456,777.5";
		DecimalFormat df=new DecimalFormat("#,###.#");
		Number num=df.parse(str);
		double d=num.doubleValue();
		
		DecimalFormat dft=new DecimalFormat("#,###");
		
		System.out.println("반올림:" + Math.round(d));
		System.out.println("만단위:" + dft.format(d));
	}
}
