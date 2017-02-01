package ch09;

public class ICallListener implements IButton.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}

}
