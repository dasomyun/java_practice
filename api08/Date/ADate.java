package api08.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 7.
 * @내용 : java.util 패키지의 Date 클래스 
 */

public class ADate {

	public static void main(String[] args) throws ParseException {
		
		Date today = new Date();
		System.out.println(today.toString() + "\t" + today);
		
		System.out.print(today.getYear() + "년도 ");
		System.out.print(today.getMonth()+1 +"월 ");
		System.out.print(today.getDate() + "일 ");
		
		System.out.print(today.getHours() + "시 " );
		System.out.print(today.getMinutes() + "분 ");
		System.out.print(today.getSeconds() + "초");
		
		System.out.println();
		
		Date now = new Date();	// 원본데이터 영향 X
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		System.out.println(sdf2.format(now));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");	// 굉장히 많이 쓰는 형테 ( 메일, 쪽지, 대화 할 때 사용 )
		System.out.println(sdf3.format(now));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf4.format(now));
		
		System.out.println();
		
		// 문자열을 Date 변환 
		String str = "1994-03-02";
		Date strDate = sdf1.parse(str);
		System.out.println(strDate.getMonth() + 1 + "년도");
		System.out.println(strDate.toString());
		
	}

}
