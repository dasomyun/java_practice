package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 16.
 * @���� : for�� ��ø - ������
 */

public class Exam21 {

	public static void main(String[] args) {
		
		
		  System.out.println("\t\t\t ������");
		  for(int i=2;i<=9;i++){
		   System.out.print(i + "��" + "\t");
		  }
		  System.out.println();
		  
		    //
		  System.out.println("��켱 ������");
		  for(int i=1;i<=9;i++){
		   for(int j=2;j<=9;j++){
		    System.out.print(j+"*"+i+"="+(j*i)+ "\t");
		            }
		   System.out.println();
		  }
		  
		  System.out.println();
		  
		  //
		  System.out.println("���켱 ������");
		  for(int i=2;i<=9;i++){
		   for(int j=1;j<=9;j++){
		    System.out.println(i+"*"+j+"="+(i*j));
		            }
		   System.out.println();
	
		} 
	}

}
