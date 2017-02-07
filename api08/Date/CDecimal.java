package api08.Date;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 7.
 * @내용 : java.text패키지의 DecimalFormat 클래스 
 * 			숫자 형태를 일정 패턴으로 출력 
 */

public class CDecimal {

	public static void main(String[] args) throws ParseException {
		
		double x = 1234567.89;
		
		DecimalFormat df1 = new DecimalFormat("0000000.0");
		DecimalFormat df2 = new DecimalFormat("0.0");
		DecimalFormat df3 = new DecimalFormat("0.00");
		DecimalFormat df4 = new DecimalFormat("0.0000");	// 소수 셋째, 넷째는 0으로 채워짐 
		
		System.out.println("df1 : " + df1.format(x));
		System.out.println("df2 : " + df2.format(x));
		System.out.println("df3 : " + df3.format(x));
		System.out.println("df4 : " + df4.format(x) +"\n\n");
		
		DecimalFormat df5 = new DecimalFormat("#######.#");
		DecimalFormat df6 = new DecimalFormat("#.#");
		DecimalFormat df7 = new DecimalFormat("#.##");
		DecimalFormat df8 = new DecimalFormat("#.####");	// 소수 셋째, 넷째는 0으로 채워지지 않음 
		
		System.out.println("df5 : " + df5.format(x));
		System.out.println("df6 : " + df6.format(x));
		System.out.println("df7 : " + df7.format(x));
		System.out.println("df8 : " + df8.format(x));
		
		int y =1234567890;
		DecimalFormat df9 = new DecimalFormat("#,###");
		DecimalFormat df10 = new DecimalFormat("#,####");
		DecimalFormat df11 = new DecimalFormat("#,#####");
		DecimalFormat df12 = new DecimalFormat("\u00A4 #,###");
		
		System.out.println("df9 : " + df9.format(y));
		System.out.println("df10 : " + df10.format(y));
		System.out.println("df11 : " + df11.format(y));
		System.out.println("df12 : " + df12.format(y) + "\n\n");
		
		String str = "1,123,456";
		Number num = df9.parse(str);
		int su = num.intValue();
		System.out.println("su : " + su);
		
	}
}
