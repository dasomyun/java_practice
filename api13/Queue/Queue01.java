package api13.Queue;

import java.util.LinkedList;

/**
 * @author : 곽선아
 * @date : 2017. 2. 9.
 * @description :  Queue(LinkedList)
 *       	 		key,value 값은 없지만 예측 가능
 *       			먼저 들어온게 먼저 나온다(FIFO)
 *       			중간 삽입,삭제 불가능
 */
public class Queue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		
		//뽑아오기 while( 비어있지 않으면 출력) {뽑아오는 명령어.poll() 뽑고서 공간을 비운다}
		//
		while(!queue.isEmpty()){
			System.out.println(queue.poll() + "\t" + queue.size());
			
			System.out.println("\n");
			
		
	
		}
			//앞,뒤 공간은 추가,삭제 가능	
		LinkedList<Float> fq = new LinkedList<Float>();
		fq.offer(0.5f);
		fq.offer(0.6f);
		fq.offer(0.7f);
		fq.offer(0.8f);
		
		fq.removeFirst();    //
		fq.addFirst(22.5f);  //추가
		fq.removeLast();     //삭제
		fq.addLast(55.6f);  
		
		while(!fq.isEmpty()){
			System.out.println(fq.poll() + "\t");
		}
	}

}
