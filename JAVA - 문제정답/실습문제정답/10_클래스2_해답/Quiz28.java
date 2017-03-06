package ch05.quiz02;

/**
 * @Data : 2016. 7. 12.
 * @Author : ÁÂ¹ÎÇı
 * @Description :  Å¬·¡½º2- ½Ç½À¹®Á¦ 28) ÇĞÁ¡±¸ÇÏ±â
 */

class HakJum{
	private int jumsu;
	private char grade;
	
	public HakJum(int jumsu){
		this.jumsu=jumsu;
	}
	
	public void getHakjum(){
		if(jumsu >= 90) 
			grade='A';
		else if(jumsu >=80)
			grade='B';
		else if(jumsu >=70)
			grade='C';
		else if(jumsu >=60)
			grade='D';
		else if(jumsu < 60)
			grade='F';
	}
	
	public void disp(){
		System.out.println("jumsu:" + jumsu + "\t" + "grade:" + grade);
	}
}

public class Quiz28 {
	public static void main(String[] args) {
		HakJum h=new HakJum(88);
		h.getHakjum();
		h.disp();
	}
}
