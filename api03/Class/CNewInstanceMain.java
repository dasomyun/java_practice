package api03.Class;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 3.
 * @내용 : 동적 객체 생성 
 * 			나중에 MVC2에서 많이 사용한다. 
 */

public class CNewInstanceMain {

	public static void main(String[] args) {
		try {
			Class<?> cla = Class.forName("api03.Class.CSendAction");
			CSendAction send = (CSendAction) cla.newInstance();
			send.excute();
			
			cla = Class.forName("api03.Class.CReceiveAction");
			CReceiveAction re = (CReceiveAction) cla.newInstance();
			re.excute();
			
		} catch (Exception e) {
			System.out.println("해당 클래스가 없습니다");
			e.printStackTrace();
		}
		
		String[] className = new String[] { "api03.Class.CSendAction" , "api03.Class.CReceiveAction" };
		
		for(int i=0; i<className.length; i++){
			try{
				Class<?> c = Class.forName(className[i]);
				
				 Object obj = c.newInstance();
				 CAction action = (CAction) obj;
				
//				CAction action = (CAction)c.newInstance();
//				action.excute();
				
				if(action instanceof CSendAction){
					CSendAction send = (CSendAction) action;
					send.sub();
				}
				
			} catch (Exception e) {
				// 사용자에게 나중에 알람을 뿌려주기 위한 것
				System.out.println("해당 클래스가 없습니다");
				// 개발자를 위해서 간단한 메시지로 에러 출력 
				System.out.println(e.getMessage());
				//개발자를 위해서 예외발생 코드를 추적한 내용을 출력
				e.printStackTrace();
			}
		}
	}
}
