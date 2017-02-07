package api08.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 7.
 * @���� : java.util ��Ű���� Date Ŭ���� 
 */

public class ADate {

	public static void main(String[] args) throws ParseException {
		
		Date today = new Date();
		System.out.println(today.toString() + "\t" + today);
		
		System.out.print(today.getYear() + "�⵵ ");
		System.out.print(today.getMonth()+1 +"�� ");
		System.out.print(today.getDate() + "�� ");
		
		System.out.print(today.getHours() + "�� " );
		System.out.print(today.getMinutes() + "�� ");
		System.out.print(today.getSeconds() + "��");
		
		System.out.println();
		
		Date now = new Date();	// ���������� ���� X
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy�� MM�� dd�� E����");
		System.out.println(sdf2.format(now));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");	// ������ ���� ���� ���� ( ����, ����, ��ȭ �� �� ��� )
		System.out.println(sdf3.format(now));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("������ D��° ��");
		System.out.println(sdf4.format(now));
		
		System.out.println();
		
		// ���ڿ��� Date ��ȯ 
		String str = "1994-03-02";
		Date strDate = sdf1.parse(str);
		System.out.println(strDate.getMonth() + 1 + "�⵵");
		System.out.println(strDate.toString());
		
	}

}
