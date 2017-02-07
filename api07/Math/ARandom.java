package api07.Math;

import java.util.Arrays;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 7.
 * @���� : java.lang�� math class�� random�Լ� 
 */

public class ARandom {

	public static void main(String[] args) {
		
		System.out.println("20�� ���밪 : " + Math.abs(-20));
		System.out.println("�ִ밪 : " + Math.max(10, 20));
		System.out.println("�ּҰ� : " + Math.min(1.5, 1.3));
		System.out.println("2�� 3�� : " + (int) Math.pow(2, 3));
		
		double ran = Math.random();		//0~1
		System.out.println("ran : " + ran);
		System.out.println("ran : " + (int) ran);

		int r = (int) (Math.random() *20);
		System.out.println("r : " + r);
		
		String[] array = new String[] { "������" , "�ڽ¿�" , "�輱��" , "���ټ�", "������" , "������" , "�����"};
		int x = (int) (Math.random() * (array.length-1));	// 0 ~ 7
		System.out.println("�����Լ� : " + array[x] + "\n\n");
		
		// ���� ��Ʈ���� �� ��ȣ
		int[] selectLotto = new int[6];
		System.out.print("my select lotto : ");
		
		for(int i=0; i<selectLotto.length; i++) {
			selectLotto[i] =(int)(Math.random()*45)+1;
		}
		
		Arrays.sort(selectLotto);
		System.out.println(Arrays.toString(selectLotto));
		
		
		// TV �ζ� ��÷ ��ȣ
		int[] lotto = new int[6];
		System.out.print("�ζ� ��÷��ȣ: ");
		for(int i=0; i<lotto.length; i++){
			lotto[i] = (int)(Math.random()*45)+1;	//0�� �Ǹ� �ȵǴϱ� +1	
		}
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		// ���� ��� 
		boolean result = Arrays.equals(selectLotto , lotto);
		if(result) {
			System.out.println("��÷!!");
		} else {
			System.out.println("��÷���� ����");
		}
		
	}

}
