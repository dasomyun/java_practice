package api01.System;

import java.util.Properties;
import java.util.Set;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 3.
 * @���� : api - getPorperties
 */

public class DgetPorperties {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String javaVersion = System.getProperty("java.version");
		
		System.out.println("���ü �̸� : " + osName);
		System.out.println("����� �̸� : " + userName);
		System.out.println("����� Ȩ ���丮 : " + userHome);
		System.out.println("�ڹ� ���� : " + javaVersion + "\n\n");
		
		// Ű���� �������� api�� ���������� �� get�޼ҵ带 �̿��� key���� �̾Ƴ�����.
		Properties props = System.getProperties();
		Set<Object>keys = props.keySet();
		for(Object objKey:keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[" + key + "] : " + value);
		}
	}

}
