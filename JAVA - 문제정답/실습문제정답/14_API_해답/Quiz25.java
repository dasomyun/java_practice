package api09.Quiz;

/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 25)  toString(), equals() 오버라이딩
 */

class Point{
	private int x, y, z;
	
	public Point(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public boolean equals(Object obj){
		Point p=(Point) obj;
		boolean result=false;
		
		if(this.x==p.x && this.y==p.y && this.z==p.z){
			result=true;
		}
		return result;
	}
	
	public String toString(){
		return "[" + x  +"\t" +  y + "\t" + z + "]";
	}
}
public class Quiz25 {
	public static void main(String[] args) {
		Point p=new Point(1, 2, 3);
		Point o=new Point(1, 2, 3);
		
		System.out.println(p);
		System.out.println(o);
		System.out.println("결과:" + p.equals(o));
	}
}
