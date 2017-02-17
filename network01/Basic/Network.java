package network01.Basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 16.
 * @내용 : ip주소 , 도메인네임 얻어오기 
 */

public class Network {
	public static void main(String[] args) {
	
		try {
			// 특정회사 (쌍용)
			InetAddress a = InetAddress.getByName("www.sist.co.kr"); 	
			System.out.println("IP 주소 : " + a.getHostAddress());		// ip주소
			System.out.println("도메인네임 : " + a.getHostName() + "\n");		// 도메인네임
			
			// 포털사이트(네이버, 구글, 다음)
			InetAddress[] arr = InetAddress.getAllByName("www.google.com"); 	
			for(int i=0; i<arr.length; i++) {
				System.out.println("IP주소 : " + arr[i].getHostAddress());
				System.out.println("도메인 네임 : " + arr[i].getHostName() );
			}
			
			System.out.println();
			
			//내 PC : 211.63.89.103
			InetAddress me = InetAddress.getLocalHost();
			System.out.println("IP주소 : " + me.getHostAddress());
			System.out.println("도메인 네임 : " + me.getHostName());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
