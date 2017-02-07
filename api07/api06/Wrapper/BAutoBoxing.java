package api06.Wrapper;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 7.
 * @내용 :  Boxing, UnBoxing, AutoUnBoxing
 */

public class BAutoBoxing {

	public static void main(String[] args) {
		
		// Auto Boxing
		Integer obj = 100;
		System.out.println("obj : " + obj);
		
		// Integer obj = new Integer(100);
		// System.out.println("obj : " + obj.toString());
		
		// Auto UnBoxing
		int value = obj;		// int value = Integer.valueOf(obj);
		System.out.println("value : " + value);
		
		// 연산 - UnBoxing
		Integer su = new Integer(77);
		int imsi = 70;
		int r = su.intValue() +imsi;

		//연산 - AutoUnBoxing
		Integer x = 10;
		int z = x + imsi;
		System.out.println(r + "\t" + z);
		
		
	}

}
