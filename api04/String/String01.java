package api04.String;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 6.
 * @���� : api - String Ŭ���� 
 * 				charAt() , indexOf() , length()
 */

public class String01 {
	public static void main(String[] args) {
		String a = new String("apple");
		String b = "banana";
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		String subject = "�ڹ����α׷���";
		char ch = subject.charAt(5); // 0 1 2 3 4 5 
		System.out.println("���� ���� : " + ch);
		
		int index = subject.indexOf("���α׷���");
		System.out.println("���۵Ǵ� ���ڿ��� ��ġ ��� : " + index);	// �ڹ����α׷��ֿ��� ���α׷����̶�� �ܾ ���۵Ǵ� ��ġ ��� 
		System.out.println("���۵Ǵ� ���ڿ��� ��ġ ��� : " + subject.indexOf("������"));	//���ԵǴ� ���ڿ��� ������ -1 ��ȯ
		
		int leng = subject.length();
		System.out.println("���ڿ� ���� : " + leng);
		
		System.out.println("�ֹι�ȣ ���� üũ");
		String juminBunho = "123456-1234567"; //���� 1, 3, 5 ���� 2, 4, 6
		
//		if(juminBunho.charAt(7) == '1' || juminBunho.charAt(7) == '3' || juminBunho.charAt(7) == '5') 
//			System.out.println("����");
//			else 
//			System.out.println("����");
		
		if( juminBunho.length() == 14){
			char sex = juminBunho.charAt(7);
			
			switch(sex) {
			case '1': case '3': case '5':
				System.out.println("����");
				break;
				
			case '2': case'4': case'6':
				System.out.println("����");
				break;
				
			default : 
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		} else { 
			System.out.println("�ֹι�ȣ �ڸ��� Ʋ���ϴ�");
		}
			
		System.out.println("\n");
		//��ġ�� �̾ƿ���
		if(juminBunho.length() == 14) {
			int location = juminBunho.indexOf("-");
			System.out.println("location : " + location);
		//loaction (-) ����
		//juminBunho --> int�� �ٲ۴�.
			
		}
			
		}
	}


