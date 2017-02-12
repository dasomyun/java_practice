package api13.Queue;

import java.util.LinkedList;


/**
 * @author : 곽선아
 * @date : 2017. 2. 9.
 * @description :  내가만든 class 가져오기 Queue
 */

public class Queue02 {

	public static void main(String[] args) {
		LinkedList<Message> queue = new LinkedList<Message>();
		
		queue.offer(new Message("sendMail", "홍길동"));
		queue.offer(new Message("sendSMS" , "조인성"));
		queue.offer(new Message("sendKaKaoTalk" , "김자바"));
		
		while(!queue.isEmpty()){
			Message message = queue.poll();
			System.out.println(message.to + "님께 " + message.command + " 보냅니다");
		}

	}

}
