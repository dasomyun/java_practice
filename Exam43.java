package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 19.
 * @���� : �Լ� - Call By Value
 */

public class Exam43 {

	public static void main(String[] args) {
		sub(2,5);
		//sub("hi". "baboo"); error!!
		System.out.println("hahaha");
		System.out.println();
		
		sub(3,3);
		System.out.println("����Ŀ�");
		System.out.println();
		
		sub(2,10);
		System.out.println("��������");
		System.out.println();
	}
	
	public static void sub(int x, int y){
		for(int i=0; i<x; i++){
			for(int j=0; j<y; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
