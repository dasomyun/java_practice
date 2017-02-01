package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 중첩 인터페이스 
 */
//안드로이드에서 많이 사용 

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
