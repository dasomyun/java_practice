package api11.Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author : 곽선아
 * @date : 2017. 2. 8.  
 * @description : HashMap value 다를 경우 object로 받는다
 * 					아이디 비밀번호 맞는지 확인하기
 */
public class HashMap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Object> map = new HashMap<String,Object>();//key String 
		
		map.put("id", "teacher");// value: String
		map.put("pass", 1234);//    value: integer 서로 다를 때   value Object로 해준다.
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("id:");
			String id = sc.next();
			
			System.out.println("pass:");
			int pass = sc.nextInt();
			
			String dbId=(String) map.get("id");//다운캐스팅
			int dbPws=(Integer)map.get("pass");
			
			if(dbId.equals(id)){
				if(dbPws==pass){
					System.out.println("로그인성공");
					sc.close();
					break;
				}else{
					System.out.println("비밀번호를 확인하세요");
				}
				
			}else{
				System.out.println("아이디를 체크하세요");
			}
		}
		
	}

}
