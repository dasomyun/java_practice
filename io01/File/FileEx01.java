package io01.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 10.
 * @���� : File - ���� ������
 */

public class FileEx01 {

	public static void main(String[] args) {
		// ���� �𸦶� for������ �������� file[]�� ����? �ϰ� ���� 
		// �Լ��� ���� ���� ���� 
		
		File[] roots = File.listRoots();
		
		for(int i=0; i<roots.length; i++) {
			System.out.println(i + ":" + roots[i]);
		}
		
		System.out.println("\n\n");
		
		File file = new File("C:\\dsy\\java\\workspace\\pro03\\src\\api13\\Queue");  //  \\ /  // ����صα�
		System.out.println(file.exists());  // ���� ������ �޼���
		
		if(file.exists()) {
			String[] str = file.list();
			// System.out.println(file.isFile());
			
			for(int i=0; i<str.length; i++) {
				System.out.println(str[i]);
			}
			
		}
		
		File f = new File ("C:\\dsy\\java\\workspace\\pro03\\src\\api13\\Queue","Queue01.java"); // ����صα�
		System.out.println(f.exists());
		System.out.println(f.isFile());
		
		if(f.exists() && f.isFile()) {
			System.out.println("���ϸ� : " + f.getName());
			System.out.println("��θ� : " + f.getParent());
			System.out.println("����&��� : " + f.getAbsolutePath());	// �ؾ������ ���� !
			System.out.println("������ : " + f.canWrite());
			System.out.println("�б��� : " + f.canRead());
			System.out.println("����ũ�� : " + f.length() + "byte");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date(f.lastModified());
			
			System.out.println(date);
		}
		
		
		
	}

}
