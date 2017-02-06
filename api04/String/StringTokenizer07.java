package api04.String;

import java.util.StringTokenizer;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 6.
 * @���� : api - StringTokenizer  
 */

public class StringTokenizer07 {

	public static void main(String[] args) {
		
		String strText = "���ټ�,�̿���,���μ�";
		StringTokenizer st = new StringTokenizer(strText, ",");
		System.out.println("cout : " + st.countTokens());
		
		while(st.hasMoreTokens()) {		// ���ټ�,
			String str = st.nextToken();
			System.out.println(str);	// ���ټ� 
		}
		
		System.out.println("cout: " + st.countTokens());
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println("str: " + str);
		}
		
		System.out.println("\n");
		
		String strValue = "ȫ�浿/�̿���*���μ�";
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
