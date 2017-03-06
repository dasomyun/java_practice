package ch05.quiz01;

/**
 * @Data : 2016. 7. 12.
 * @Author : ÁÂ¹ÎÇý
 * @Description :  Å¬·¡½º1 - ½Ç½À¹®Á¦ 14)
 */

class Plus{
	private int x, y;
	
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public int getX(){
		return ++x;
	}
	
	public int getY(){
		return ++y;
	}
}

public class Quiz14 {
	public static void main(String[] args) {
		Plus p=new Plus();
		p.setX(10);
		p.setY(20);
		
		System.out.println(p.getX() + "," +  p.getY());
	}
}
