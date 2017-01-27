package practice;
/* 내용 : 난 정말 java를 공부한 적이 없다구요 p338
 * 문 : 열명의 수강생 점수를 입력 받아서, A학점의 기준이 되는 점수를 출력한다.
 * 	      단 A 학점은 최고 점수를 취득한 2명에게만 준다고 가정한다.
 */
import java.util.Scanner ;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		
		for(int i =0; i<10; i++){
			System.out.print("점수 입력 : ");
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
