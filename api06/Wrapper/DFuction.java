package api06.Wrapper;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 7.
 * @내용 : boxing , unBoxing, 
 */

public class DFuction {

	public static void main(String[] args) {

		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int bytesSu = Integer.BYTES;
		int size = Integer.SIZE;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("bytesSu : " + bytesSu);
		System.out.println("size : " + size + "\n\n");
		
		String binary = Integer.toBinaryString(10); // 2진수
		String octal = Integer.toOctalString(10); // 8진수
		String hex = Integer.toHexString(10); // 16진수
		
		System.out.println("binary : " + binary);
		System.out.println("octal : " + octal );
		System.out.println("hex: " + hex.toUpperCase() + "\n\n");
		
		// 문자를 정수형으로 변환 
		String su = "10";
		Integer a = new Integer(su);
		int vsu = Integer.valueOf(su);
		int psu = Integer.parseInt(su);

		System.out.println(++ a);
		System.out.println(++ vsu);
		System.out.println(++ psu);
		
		System.out.println();
		
		Double value = new Double("24.5");
		double dvalue = Double.valueOf("24.5");
		double pvalue = Double.parseDouble("24.5");
		
		System.out.println(++ value);
		System.out.println(++ dvalue);
		System.out.println(++ pvalue);
		
		// 문자로 변환 
		String ds = String.valueOf(24.5);
		String is = String.valueOf(su);
		System.out.println(ds + "\t" + is);
	
	}

}
