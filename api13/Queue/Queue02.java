package api13.Queue;

import java.util.LinkedList;


/**
 * @author : ������
 * @date : 2017. 2. 9.
 * @description :  �������� class �������� Queue
 */

public class Queue02 {

	public static void main(String[] args) {
		LinkedList<Message> queue = new LinkedList<Message>();
		
		queue.offer(new Message("sendMail", "ȫ�浿"));
		queue.offer(new Message("sendSMS" , "���μ�"));
		queue.offer(new Message("sendKaKaoTalk" , "���ڹ�"));
		
		while(!queue.isEmpty()){
			Message message = queue.poll();
			System.out.println(message.to + "�Բ� " + message.command + " �����ϴ�");
		}

	}

}
