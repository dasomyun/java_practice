package network07.TCP;

import java.net.Socket;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 17.
 * @내용 : 계속 보낼수 있는거 
 */

public class ClientEx {

	public static void main(String[] args) {
		
		if(args.length == 0){
			System.out.println("닉네임을 입력하세요");
			return;
		}
		
		Socket socket = null;
		try{
			socket = new Socket("211.63.89.103",7890);
			
			// 출력
			ClientSender s = new ClientSender(socket, args[0]);
			s.start();
			
			// 입력
			ClientReceiver r = new ClientReceiver(socket);
			r.start();

		} catch(Exception e) {
			System.out.println("ClientEx Error");
			e.printStackTrace();
		}
		
	}
}
