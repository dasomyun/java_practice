package api09.Quiz;

/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 18) 
 */

public class Quiz18 {
	public static void main(String[] args) {
			String str="";
			for(int i=1;i<=100;i++){
				str+=i;
			}
			System.out.println(str);

			StringBuilder sb=new StringBuilder();
			for(int i=1;i<=100;i++){
				sb.append(i);
			}
			System.out.println(sb.toString());
	}
}
