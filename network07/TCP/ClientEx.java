package network07.TCP;

import java.net.Socket;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 17.
 * @���� : ��� ������ �ִ°� 
 */

public class ClientEx {

	public static void main(String[] args) {
		
		if(args.length == 0){
			System.out.println("�г����� �Է��ϼ���");
			return;
		}
		
		Socket socket = null;
		try{
			socket = new Socket("211.63.89.103",7890);
			
			// ���
			ClientSender s = new ClientSender(socket, args[0]);
			s.start();
			
			// �Է�
			ClientReceiver r = new ClientReceiver(socket);
			r.start();

		} catch(Exception e) {
			System.out.println("ClientEx Error");
			e.printStackTrace();
		}
		
	}
}
