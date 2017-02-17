package network01.Basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 16.
 * @���� : ip�ּ� , �����γ��� ������ 
 */

public class Network {
	public static void main(String[] args) {
	
		try {
			// Ư��ȸ�� (�ֿ�)
			InetAddress a = InetAddress.getByName("www.sist.co.kr"); 	
			System.out.println("IP �ּ� : " + a.getHostAddress());		// ip�ּ�
			System.out.println("�����γ��� : " + a.getHostName() + "\n");		// �����γ���
			
			// ���л���Ʈ(���̹�, ����, ����)
			InetAddress[] arr = InetAddress.getAllByName("www.google.com"); 	
			for(int i=0; i<arr.length; i++) {
				System.out.println("IP�ּ� : " + arr[i].getHostAddress());
				System.out.println("������ ���� : " + arr[i].getHostName() );
			}
			
			System.out.println();
			
			//�� PC : 211.63.89.103
			InetAddress me = InetAddress.getLocalHost();
			System.out.println("IP�ּ� : " + me.getHostAddress());
			System.out.println("������ ���� : " + me.getHostName());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
