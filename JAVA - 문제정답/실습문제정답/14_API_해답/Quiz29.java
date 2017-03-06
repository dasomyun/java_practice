package api09.Quiz;

/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 29) indexOf(), charAt()
 */

public class Quiz29 {
	public static void main(String[] args) {
		String str="1!2@3^4~5";
		String delStr="!@^~";
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			char strCh=str.charAt(i);
			if(delStr.indexOf(strCh)==-1){			// 포함되지 않으면 -1
				sb.append(strCh);
			}
		}
		
		System.out.println(sb.toString());
	}
}








