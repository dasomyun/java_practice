package api07.Math;

import java.util.Arrays;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 7.
 * @내용 : java.lang의 math class의 random함수 
 */

public class ARandom {

	public static void main(String[] args) {
		
		System.out.println("20의 절대값 : " + Math.abs(-20));
		System.out.println("최대값 : " + Math.max(10, 20));
		System.out.println("최소값 : " + Math.min(1.5, 1.3));
		System.out.println("2의 3승 : " + (int) Math.pow(2, 3));
		
		double ran = Math.random();		//0~1
		System.out.println("ran : " + ran);
		System.out.println("ran : " + (int) ran);

		int r = (int) (Math.random() *20);
		System.out.println("r : " + r);
		
		String[] array = new String[] { "전영수" , "박승운" , "김선교" , "윤다솜", "곽선아" , "유지현" , "김명정"};
		int x = (int) (Math.random() * (array.length-1));	// 0 ~ 7
		System.out.println("랜덤함수 : " + array[x] + "\n\n");
		
		// 내가 마트에서 산 번호
		int[] selectLotto = new int[6];
		System.out.print("my select lotto : ");
		
		for(int i=0; i<selectLotto.length; i++) {
			selectLotto[i] =(int)(Math.random()*45)+1;
		}
		
		Arrays.sort(selectLotto);
		System.out.println(Arrays.toString(selectLotto));
		
		
		// TV 로또 당첨 번호
		int[] lotto = new int[6];
		System.out.print("로또 당첨번호: ");
		for(int i=0; i<lotto.length; i++){
			lotto[i] = (int)(Math.random()*45)+1;	//0이 되면 안되니까 +1	
		}
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		// 최종 결과 
		boolean result = Arrays.equals(selectLotto , lotto);
		if(result) {
			System.out.println("당첨!!");
		} else {
			System.out.println("당첨되지 않음");
		}
		
	}

}
