package Thread11.Notify;

import java.util.Stack;

public class AutoMachine {		// ���� Ŭ���� , ���Ǳ� 
	
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
				wait();		// ���� �ð��� ������ �ڵ����� �ƿ��� (notify ��)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return store.pop();
	}
	
	
	
	

}
