package api13.Queue;

import java.util.LinkedList;

/**
 * @author : ������
 * @date : 2017. 2. 9.
 * @description :  Queue(LinkedList)
 *       	 		key,value ���� ������ ���� ����
 *       			���� ���°� ���� ���´�(FIFO)
 *       			�߰� ����,���� �Ұ���
 */
public class Queue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		
		//�̾ƿ��� while( ������� ������ ���) {�̾ƿ��� ��ɾ�.poll() �̰� ������ ����}
		//
		while(!queue.isEmpty()){
			System.out.println(queue.poll() + "\t" + queue.size());
			
			System.out.println("\n");
			
		
	
		}
			//��,�� ������ �߰�,���� ����	
		LinkedList<Float> fq = new LinkedList<Float>();
		fq.offer(0.5f);
		fq.offer(0.6f);
		fq.offer(0.7f);
		fq.offer(0.8f);
		
		fq.removeFirst();    //
		fq.addFirst(22.5f);  //�߰�
		fq.removeLast();     //����
		fq.addLast(55.6f);  
		
		while(!fq.isEmpty()){
			System.out.println(fq.poll() + "\t");
		}
	}

}
