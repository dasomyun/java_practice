package api02.Object;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 3.
 * @���� :  api - String ( ToString )
 */

public class BSmartPhone {
	private String company;
	private String os;
	
	public BSmartPhone (String company, String os) {
		this.company = company;
		this.os = os;	
	}
//
//	@Override
//	public String toString() {
//		return company + "," + os;
//	}

	@Override
	public String toString() {
		return "BSmartPhone [company=" + company + ", os=" + os + "]";
	}
	
	
}
