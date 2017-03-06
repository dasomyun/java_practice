package ch05.quiz01;

/**
 * @Data : 2016. 7. 12.
 * @Author : ÁÂ¹ÎÇý
 * @Description :  Å¬·¡½º1 - ½Ç½À¹®Á¦ 10)
 */

class Member{
	private String name;
	private String id;
	private String password;
	private int age;
	
	public boolean login(String id, String password){
		boolean check=false;
		
		if(id=="hong" && password=="1234"){
			check=true;
		}
		
		return check;
	}
	
	public void logout(String id){
		System.out.println(id + "´Ô ·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù.");
	}
}


public class Quiz10 {
	public static void main(String[] args) {
		Member m=new Member();
		boolean check=m.login("hong", "1234");
		if(check==true){
			m.logout("hong");
		}
	}
}
