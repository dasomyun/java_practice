package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : for문 중첩 - 구구단
 */

public class Exam21 {

	public static void main(String[] args) {
		
		
		  System.out.println("\t\t\t 구구단");
		  for(int i=2;i<=9;i++){
		   System.out.print(i + "단" + "\t");
		  }
		  System.out.println();
		  
		    //
		  System.out.println("행우선 구구단");
		  for(int i=1;i<=9;i++){
		   for(int j=2;j<=9;j++){
		    System.out.print(j+"*"+i+"="+(j*i)+ "\t");
		            }
		   System.out.println();
		  }
		  
		  System.out.println();
		  
		  //
		  System.out.println("열우선 구구단");
		  for(int i=2;i<=9;i++){
		   for(int j=1;j<=9;j++){
		    System.out.println(i+"*"+j+"="+(i*j));
		            }
		   System.out.println();
	
		} 
	}

}
