package api09.Quiz;

/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 22) 
 */

class Member{
	private String id;
	private String name;
	
	public Member(String id, String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return id + ":" + name;
	}
}

public class Quiz22 {
	public static void main(String[] args) {
		Member member=new Member("blue", "이파란");
		System.out.println(member.toString());
	}
}
