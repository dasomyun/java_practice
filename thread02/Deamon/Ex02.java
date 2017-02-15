package thread02.Deamon;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 14.
 * @내용 : AutoSave 예제의 실행 메서드 ( setDaemon )
 * 		
 */

public class Ex02 {

	public static void main(String[] args) {
		AutoSave autoSave = new AutoSave();
		autoSave.setDaemon(true);     // 이거 안쓰면 계속 돌아감 
		autoSave.start();
		
		try {
			Thread.sleep(5000);       // 5초후 종료
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
