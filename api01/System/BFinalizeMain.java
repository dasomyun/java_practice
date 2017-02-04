package api01.System;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : System Ŭ���� - gc()
 * 			GC(garbage collector)�� ���� ������ �������� �ʴ�. �޸𸮰� �����ϰų� CPU�� �Ѱ��� ���� JVM�� ���� �ڵ� ����ȴ�.
 */

public class BFinalizeMain {

	public static void main(String[] args) {
		
		BFinalize emp;
		
		emp = new BFinalize(1);
		emp = null;	// ����ִµ� �������� ���� ���̴� 
		
		emp = new BFinalize(2);
		emp = new BFinalize(3);
		
		System.out.println("���������� �����ϴ� ���� : " + emp.eno);
		System.gc(); 	// ������ ������ ���� ��û -> �Ҹ��� ����
	}

}
