package api09.Quiz;

/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 28) indexOf(), subString()
 */

public class Quiz28 {
	public static void main(String[] args) {
		String fullPath="c:\\jdk1.5\\work\\PathSeparateTest.java";
		int index=fullPath.indexOf("P");
		System.out.println(fullPath.substring(index));
	}
}
