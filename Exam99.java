package ch08;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : 단방향 연관관계  
 */

class AA {
	private int x;
	private int y;
	
	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void disp() {
		System.out.println(x + "\t" + y);
	}
}

class BB {
	private AA aa;//3

	public AA getAa() {
		return aa;
	}

	public void setAa(AA aa) {//2
		this.aa = aa;
	}
	
}


public class Exam99 {

	public static void main(String[] args) {
		AA aa = new AA();
		aa.setData(77, 88);
		
		BB bb = new BB();
		bb.setAa(aa);//1
		
		AA result = bb.getAa();
		result.disp();
	}

}
