package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : ��ø �������̽� 
 */
//�ȵ���̵忡�� ���� ��� 

public class IButton {
	private OnClickListener listener;
	
	public void setClickListener(OnClickListener listehner) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		public void onClick();
	}
}
