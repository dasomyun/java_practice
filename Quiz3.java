package practice;
/* ���� : �� ���� java�� ������ ���� ���ٱ��� p338
 * �� : ������ ������ ������ �Է� �޾Ƽ�, A������ ������ �Ǵ� ������ ����Ѵ�.
 * 	      �� A ������ �ְ� ������ ����� 2���Ը� �شٰ� �����Ѵ�.
 */
import java.util.Scanner ;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		
		for(int i =0; i<10; i++){
			System.out.print("���� �Է� : ");
			array[i] = sc.nextInt();
		}
		for(int i =0; i<10; i++){
			int j=0;
			if(array[i] >= 90 && array[i] < 100){
				System.out.println(array[i]);
				++j;
				if(j>3){
					break;
				}
			}
		}
		sc.close();
	}

}
