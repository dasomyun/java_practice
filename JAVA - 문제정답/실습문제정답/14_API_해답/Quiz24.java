package api09.Quiz;

/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 24) 
 */

import java.util.StringTokenizer;

public class Quiz24 {
	public static void main(String[] args) {
		String str="아이디, 이름, 패스워드";
		
		// splict() 메소드 이용
		String[] tokens=str.split(",");
		for(int i=0;i<tokens.length;i++){
			String token=tokens[i];
			System.out.println(token);
		}
		System.out.println();
		
		// StringTokenizer 이용
		StringTokenizer st=new StringTokenizer("아이디, 이름, 패스워드", ",");
		while(st.hasMoreTokens()){
			String token=st.nextToken();
			System.out.println(token);
		}
	}
}
