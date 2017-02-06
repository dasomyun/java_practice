package api04.String;

import java.util.StringTokenizer;

/**
 * @ÀÛ¼ºÀÚ : À±´Ù¼Ø
 * @³¯Â¥ : 2017. 2. 6.
 * @³»¿ë : api - StringTokenizer  
 */

public class StringTokenizer07 {

	public static void main(String[] args) {
		
		String strText = "À±´Ù¼Ø,ÀÌ¿µÀÚ,Á¶ÀÎ¼º";
		StringTokenizer st = new StringTokenizer(strText, ",");
		System.out.println("cout : " + st.countTokens());
		
		while(st.hasMoreTokens()) {		// À±´Ù¼Ø,
			String str = st.nextToken();
			System.out.println(str);	// À±´Ù¼Ø 
		}
		
		System.out.println("cout: " + st.countTokens());
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println("str: " + str);
		}
		
		System.out.println("\n");
		
		String strValue = "È«±æµ¿/ÀÌ¿µÀÚ*Á¶ÀÎ¼º";
		StringTokenizer stoken = new StringTokenizer(strValue , "/");
		
		while(stoken.hasMoreTokens()){
			String str = stoken.nextToken();
			//System.out.println(str);
			StringTokenizer ken = new StringTokenizer(str, "*");
			
			while(ken.hasMoreElements()) {
				System.out.println(ken.nextToken());
			}
		}
		
		
		
		
	}

}
