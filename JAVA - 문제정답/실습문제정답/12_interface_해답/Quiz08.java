package ch07.quiz;

interface Soundable{		
	public String sound();
}

class Cat implements Soundable{
	@Override
	public String sound() {	
		return "具克";
	}
}

class Dog implements Soundable{
	@Override
	public String sound() {
		return "港港";
	}	
}

public class Quiz08 {
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

	private static void printSound(Soundable soundable){
		System.out.println(soundable.sound());
	}
}
