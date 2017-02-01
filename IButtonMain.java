package ch09;

public class IButtonMain {
	public static void main(String[] args) {
		IButton.OnClickListener btn1 = new ICallListener();
		btn1.onClick();
		
		//IMessageListener.도 가능 
		IButton.OnClickListener btn2 = new IMessageListener();
		btn2.onClick();
		
		System.out.println("\n\n");
		
		IButton ibtn = new IButton();
		ibtn.setClickListener(new ICallListener());
		ibtn.touch();
		
		ibtn.setClickListener(new IMessageListener());
		ibtn.touch();
		
		ibtn.setClickListener(new IButton.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다");
			}
		});
		
		
		ibtn.touch();
	}

}
