package thread07.Synchronized;

public class Calculator { 		// �����ϴ� Ŭ���� 

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// �� �����尡 ���� ������ �����ؾ� �Ѵ�
	// ���ǿ��� : �� �ϳ��� �����常 ����	
	public synchronized void setMemory(int memory) { 	// �޼��� ����ȭ 
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// synchronized(this) { }      ���ǿ��� : Ư���κ� ����ȭ
		System.out.println(Thread.currentThread().getName() + ":" + this.toString());
		
	}

	@Override
	public String toString() {
		return "Calculator [memory=" + memory + "]";
	}
	
}
