package network08.ChatMulti;

import java.net.Socket;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 17.
 * @내용 : 단체 채팅 
 */

public class ClientEx {

	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("이름은 입력하거나 하나만 입력하세요 : " );
			return;
		}
		
		try {
			//보내기
			Socket socket = new Socket("211.63.89.103", 5959);
			ClientSender sender = new ClientSender(socket , args[0]);
			sender.start();
			
			//받기
			ClientReceiver receiver = new ClientReceiver(socket);
			receiver.start();
			
			
		} catch(Exception e) {
			System.out.println("ClientEx Error");
			e.printStackTrace();
		}
		
	}

}
