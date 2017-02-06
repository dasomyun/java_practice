package api04.String;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 6.
 * @내용 : api - String 클래스 ( split() )
 */

//대기업 시험 문제에서 많이 나옴 

public class String06 {

	public static void main(String[] args) {
		// 디비 할때 자주 사용
		
		String str = "홍길동, 이수홍, 박연수, 김자바, 최명호";
		String[] strArr = str.split(",");
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
		}
		System.out.println("\n" + str);
		System.out.println("\n\n");
		
		String text = "홍길동&이수홍 , 박연수, 김자바-최명호";
		String[] textArr = text.split("&|.|-");
		for(int i=0; i<textArr.length; i++) {
			System.out.print(textArr[i]+"\t");
		}
		
	}

}
