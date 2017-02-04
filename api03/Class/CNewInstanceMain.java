package api03.Class;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 3.
 * @���� : ���� ��ü ���� 
 * 			���߿� MVC2���� ���� ����Ѵ�. 
 */

public class CNewInstanceMain {

	public static void main(String[] args) {
		try {
			Class<?> cla = Class.forName("api03.Class.CSendAction");
			CSendAction send = (CSendAction) cla.newInstance();
			send.excute();
			
			cla = Class.forName("api03.Class.CReceiveAction");
			CReceiveAction re = (CReceiveAction) cla.newInstance();
			re.excute();
			
		} catch (Exception e) {
			System.out.println("�ش� Ŭ������ �����ϴ�");
			e.printStackTrace();
		}
		
		String[] className = new String[] { "api03.Class.CSendAction" , "api03.Class.CReceiveAction" };
		
		for(int i=0; i<className.length; i++){
			try{
				Class<?> c = Class.forName(className[i]);
				
				 Object obj = c.newInstance();
				 CAction action = (CAction) obj;
				
//				CAction action = (CAction)c.newInstance();
//				action.excute();
				
				if(action instanceof CSendAction){
					CSendAction send = (CSendAction) action;
					send.sub();
				}
				
			} catch (Exception e) {
				// ����ڿ��� ���߿� �˶��� �ѷ��ֱ� ���� ��
				System.out.println("�ش� Ŭ������ �����ϴ�");
				// �����ڸ� ���ؼ� ������ �޽����� ���� ��� 
				System.out.println(e.getMessage());
				//�����ڸ� ���ؼ� ���ܹ߻� �ڵ带 ������ ������ ���
				e.printStackTrace();
			}
		}
	}
}
