package Thread11.Notify;

import java.util.Stack;

public class AutoMachine {		// 공유 클래스 , 자판기 
	
	private Stack<String> store = new Stack<String>();
	
	public synchronized void setDrink(String drink){
		if(!store.isEmpty()) {
			notify();
		}		
		store.push(drink);
	}
	
	public synchronized String getDrink() {
		while(store.isEmpty()) {
			try {
				wait();		// 일정 시간이 지나면 자동으로 꺠워짐 (notify 됨)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return store.pop();
	}
	
	
	
	

}
