package ch02.quiz_control;

import java.io.IOException;

/**
 * @Data : 2016. 6. 30.
 * @Author : ����
 * @Description : ��� �ǽ����� 6�� Ǯ��
 *                    ���� 6) Ű����κ��� �Է��� ���ڰ� M �Ǵ� m�̸� man, W �Ǵ� w�̸� woman,
 *							    �� �� �̸� ???�� ȭ��� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (if��)
 */

public class Quiz06 {
	public static void main(String[] args) throws IOException{		
		System.out.print("���ڸ� �Է��ϼ���:");
		char ch=(char)System.in.read();
		System.in.read();
		System.in.read();
		
		if(ch=='m' || ch=='M'){
			System.out.println("man");
		}else if(ch=='w' || ch=='W'){
			System.out.println("woman");
		}else{
			System.out.println("???");
		}
	}
}
