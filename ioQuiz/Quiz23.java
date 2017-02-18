package ioQuiz;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 18.
 * @���� : 23. ���� quiz23.txt ������ ���� �� ��� �빮�ڷ� �ٲ㼭 ����ϴ� ���α׷��� �ۼ��ϼ��� (���� ��Ʈ�� ���)
 */

public class Quiz23 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz23.txt");
			bis = new BufferedInputStream(fis,1024);
			
			byte[] data = new byte[65536];
			while(true){
				int count = bis.read(data);
				if(count == -1) break;	
				String str = new String(data,0,count);
				System.out.println(str.toUpperCase());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(bis != null) bis.close();				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
