package ch07_interfaceA;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : �������̽� 
 */

public interface RemoteControl {
	
	//public static final ���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//public abstract �Լ� 
	public void trunOn();
	public void trunOff();
	public void setVolum(int volum);
}
