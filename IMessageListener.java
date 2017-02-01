package ch09;

public class IMessageListener implements IButton.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다");
	}
	

}
