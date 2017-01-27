package practice;
/* 내용 : 난 정말 java를 공부한 적이 없다구요 p202
 * 문제 1. 밑변과 높이 정보를 저장할 수 있는 Triangle 클래스를 정의하자. 그리고 생성과 동시에 초기화가 가능한 생성자도 정의하자.
 * 끝으로 밑변과 높이 정보를 변경시킬 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의하자.
 */

class Triangle {
	public int m;
	public int h;
	public float result;
	
	public Triangle (int m , int h){
		this.m = m;
		this.h = h;
		result = 0.0f;
	}
	
	public void setM (int m) {
		this.m = m;
	}
	
	public void setH (int h) {
		this.h = h;
	}
	
	public float Result (){
		result = m*h/2;
		return result;
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(5,2);
		System.out.println("넓이 : " + triangle.Result());

		triangle.setM(10);
		triangle.setH(20);
		System.out.println("넓이 : " + triangle.Result());
		
	}

}
