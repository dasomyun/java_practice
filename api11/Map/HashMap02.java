package api11.Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author : ������
 * @date : 2017. 2. 8.  
 * @description : HashMap value �ٸ� ��� object�� �޴´�
 * 					���̵� ��й�ȣ �´��� Ȯ���ϱ�
 */
public class HashMap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Object> map = new HashMap<String,Object>();//key String 
		
		map.put("id", "teacher");// value: String
		map.put("pass", 1234);//    value: integer ���� �ٸ� ��   value Object�� ���ش�.
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("id:");
			String id = sc.next();
			
			System.out.println("pass:");
			int pass = sc.nextInt();
			
			String dbId=(String) map.get("id");//�ٿ�ĳ����
			int dbPws=(Integer)map.get("pass");
			
			if(dbId.equals(id)){
				if(dbPws==pass){
					System.out.println("�α��μ���");
					sc.close();
					break;
				}else{
					System.out.println("��й�ȣ�� Ȯ���ϼ���");
				}
				
			}else{
				System.out.println("���̵� üũ�ϼ���");
			}
		}
		
	}

}
