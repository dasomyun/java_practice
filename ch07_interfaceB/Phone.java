package ch07_interfaceB;
 
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : ��� - interface 
 * 		   A���ڿ��� �پ��� ����Ʈ���� ����ϴ�.
 * 		   �𵨺� ������ ������ ����. 
 * 		   ��ǰ��	 ��ȭ��/����	3G&LTE	  TV���������
 * 		   APhone		 ����	      LTE        ��ž�� 
 * 		   BPhone 		 ����         3G          ž��
 * 		   CPhone 	     ����	      LTE		 ��ž��
 */

public interface Phone {
	public void callSend();
	public void canLte();
	public void tvRemote();
	
}
