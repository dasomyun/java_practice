package ch08;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : 양 방향의 클래스의 지역객체 
 */

class Strawberry {
	private Grape grape;
	
	public void setGrape(Grape grape) {  
		this.grape = grape;
		System.out.println("setGrape");
	}
	
	public Grape getGrape() {
		System.out.println("getGrape");
		return grape;
	}
	
}

class Grape {
	private Strawberry strawberry;
	
	public void setStrawberry(Strawberry strawberry){
		this.strawberry = strawberry;
		System.out.println("setStrawberry");
	}
	
	public Strawberry getStrawberry() {
		System.out.println("getStrawberry");
		return strawberry;
	}
	
}

public class Exam98 {

	public static void main(String[] args) {
		Grape g = new Grape();
		Strawberry s = new Strawberry();
		
		s.setGrape(g);
		Grape gr = s.getGrape();
		
		g.setStrawberry(s);
		Strawberry st = g.getStrawberry();

	}

}
