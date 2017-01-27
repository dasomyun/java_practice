package practice;

public class ArrayAndMethods {

	public static int[] addAllArray(int[] ar , int addVal) { //arr[] , 7
		for(int i=0; i<ar.length; i++) 
			ar[i] += addVal; //ar[0]=8, ar[1]=9 ,ar[2]=10, ar[3]=11, ar[4]=12
		
		return ar;
		}
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] ref;
		
		ref = addAllArray(arr, 7);
		//ref[0]=8 ref[1]=9, ref[2]=10 ref[3]=11 ref[4]=12
		
		if(arr == ref)
			System.out.println("동일 배열 참조");
		else 
			System.out.println("다른 배열 참조");
		
		for(int i=0; i<ref.length; i++) 
			System.out.print(arr[i] + " ");
	}

}
