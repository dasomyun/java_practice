package ch03;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 18.
 * @���� : �迭 
 */

public class Exam31 {

	public static void main(String[] args) {
		
		char [] ch = new char[] { 'A','B','C'};//6byte
		
		System.out.println("ù��° �迭: " + ch[0]);
		System.out.println("�ι�° �迭: " + ch[1]);
		System.out.println("����° �迭: " + ch[2]);
		
		ch[1]='*';
		System.out.println("�ι�° �迭: " + ch[1]);
		
		System.out.println("\n");
		
		System.out.println("ch�迭�� ��: "+ ch.length);
		
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i] + " \t "); 
		}
		
		System.out.println("\n");
		
		int[] array = new int[] {10, 20, 30, 40, 50}; //20 byte
		for(int i=0; i<array.length; i++){
			if(array[i] > 20)
				System.out.print(array[i] + "\t");
		}
		
		System.out.println("\n\n");
		
		String[] str = new String[] {"apple" , "�ȳ��ϼ���", "hi", "^&^" };
		for(int i=0; i<str.length; i++){
			System.out.print(str[i] + "\t");
				}	
		
		
		
		
		
		
		}
}
		
		
		
		
		
		