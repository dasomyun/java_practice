package network08.ChatMulti;

import java.net.Socket;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 17.
 * @���� : ��ü ä�� 
 */

public class ClientEx {

	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("�̸��� �Է��ϰų� �ϳ��� �Է��ϼ��� : " );
			return;
		}
		
		try {
			//������
			Socket socket = new Socket("211.63.89.103", 5959);
			ClientSender sender = new ClientSender(socket , args[0]);
			sender.start();
			
			//�ޱ�
			ClientReceiver receiver = new ClientReceiver(socket);
			receiver.start();
			
			
		} catch(Exception e) {
			System.out.println("ClientEx Error");
			e.printStackTrace();
		}
		
	}

}
