package thread08.Synchronized;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 15.
 * @내용 : 동기화 ( Synchronized ) : 한번에 하나의 스레드만 실행할 수 있다 
 */

public class EX {

	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		
		Family father = new Family(toilet);
		father.setName("아버지");
		father.start();
		
		Family mother = new Family(toilet);
		mother.setName("어머니");
		mother.start();
		
		Family sister = new Family(toilet);
		sister.setName("누나");
		sister.start();
		
		Family brother = new Family(toilet);
		brother.setName("형");
		brother.start();
		
		Family me = new Family(toilet);
		me.setName("나");
		me.start();
		
	}

}
