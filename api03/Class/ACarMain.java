package api03.Class;

public class ACarMain {
	public static void main(String[] args) {
		ACar car = new ACar();
		Class<?> cls = car.getClass();		// �Լ� , �ʵ�, ������ ������ �����´�
		
		System.out.println("Ǯ���� : " + cls.getName());
		System.out.println("Ŭ������ : " + cls.getSimpleName());
		System.out.println("��Ű���� : " + cls.getPackage().getName());
	
		
		// ���� ��ü ���� String ���·� �̾ƿ� �� ���� 
		
		try{
			// ���ڿ� Ŭ������ 
			Class<?> clsz = Class.forName("api03.Class.ACar");
			System.out.println("Ǯ���� : " + clsz.getName());
			System.out.println("Ŭ������ : " + clsz.getSimpleName());
			System.out.println("��Ű���� : " + clsz.getPackage().getName());
			
			//clsz�� ��ü
			ACar cara = (ACar) clsz.newInstance();
		} catch (Exception e) {
			System.out.println("Ŭ���� �������� ����");
		}
		
	}

}
