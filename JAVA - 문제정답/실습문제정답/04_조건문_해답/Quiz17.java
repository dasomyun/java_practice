package ch02.quiz_if;

public class Quiz17 {
	public static void main(String[] args) {
		char gread='B';
		
		if(gread=='A' || gread=='a'){
			System.out.println("우수회원입니다.");
		}else if(gread=='B' || gread=='B'){
			System.out.println("정회원입니다.");
		}else if(gread=='C' || gread=='c'){
			System.out.println("일반회원입니다.");
		}else if(gread=='F' || gread=='f'){
			System.out.println("손님입니다.");
		}
	}
}
