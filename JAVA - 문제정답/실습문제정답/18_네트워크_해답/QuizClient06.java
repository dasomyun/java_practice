package network13.Quiz;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import java.io.IOException;
import java.util.Scanner;

public class QuizClient06 {
	public static void main(String[] ar){
			DatagramSocket soc=null;
			DatagramPacket dp=null;
			Scanner sc=null;
			
			try{
				// 서버로 보내기
				sc=new Scanner(System.in);
				
				System.out.print("첫번째 수 입력:");
				int su=sc.nextInt();
				
				System.out.print("부호입력:");
				char bunho=(char) System.in.read();
				System.in.read();
				System.in.read();
				
				System.out.print("두번째 수 입력:");
				int value=sc.nextInt();
				
				String data=su + "," +  bunho + "," +  value;
				
				InetSocketAddress isa=new InetSocketAddress("127.0.0.1", 7878);
				dp=new DatagramPacket(data.getBytes(), data.getBytes().length, isa);
				soc=new DatagramSocket(9090);
				soc.send(dp);
				
				// 서버로 받기
				byte[] by=new byte[65508];
				dp=new DatagramPacket(by, by.length);
				soc.receive(dp);
				String str=new String(dp.getData(), 0, dp.getLength());
				System.out.println("사칙연산 결과:" + str);
							
		}catch(UnknownHostException e){
			System.out.println("호스트가 존재하지 않습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("네트워크 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}finally{
			if(!soc.isClosed() || soc !=null) soc.close();
			if(sc !=null) sc.close();
		}
	}
}





