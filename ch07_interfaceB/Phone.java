package ch07_interfaceB;
 
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : 상속 - interface 
 * 		   A전자에서 다양한 스마트폰을 만듭니다.
 * 		   모델별 스펙은 다음과 같다. 
 * 		   제품명	 전화송/수신	3G&LTE	  TV리모컨기능
 * 		   APhone		 가능	      LTE        미탑재 
 * 		   BPhone 		 가능         3G          탑재
 * 		   CPhone 	     가능	      LTE		 미탑재
 */

public interface Phone {
	public void callSend();
	public void canLte();
	public void tvRemote();
	
}
