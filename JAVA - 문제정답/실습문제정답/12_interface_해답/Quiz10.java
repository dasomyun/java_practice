package ch07.quiz;

interface Action{
	void work();
}

public class Quiz10 {
	public static void main(String[] args) {
		Action action=new Action(){
			@Override
			public void work() {
				System.out.println("열심히 공부합니다.");
				
			}		
		};
		
		action.work();
	}
}
