package api01.System;

import java.util.Properties;
import java.util.Set;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 3.
 * @내용 : api - getPorperties
 */

public class DgetPorperties {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String javaVersion = System.getProperty("java.version");
		
		System.out.println("운영제체 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈 디렉토리 : " + userHome);
		System.out.println("자바 버전 : " + javaVersion + "\n\n");
		
		// 키값이 무엇인지 api에 안적혀있을 때 get메소드를 이용해 key값을 뽑아내본다.
		Properties props = System.getProperties();
		Set<Object>keys = props.keySet();
		for(Object objKey:keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[" + key + "] : " + value);
		}
	}

}
