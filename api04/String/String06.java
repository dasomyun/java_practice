package api04.String;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 6.
 * @���� : api - String Ŭ���� ( split() )
 */

//���� ���� �������� ���� ���� 

public class String06 {

	public static void main(String[] args) {
		// ��� �Ҷ� ���� ���
		
		String str = "ȫ�浿, �̼�ȫ, �ڿ���, ���ڹ�, �ָ�ȣ";
		String[] strArr = str.split(",");
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
		}
		System.out.println("\n" + str);
		System.out.println("\n\n");
		
		String text = "ȫ�浿&�̼�ȫ , �ڿ���, ���ڹ�-�ָ�ȣ";
		String[] textArr = text.split("&|.|-");
		for(int i=0; i<textArr.length; i++) {
			System.out.print(textArr[i]+"\t");
		}
		
	}

}
