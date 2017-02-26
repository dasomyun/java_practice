package population;
import java.util.Scanner;
import dbUnit.DriverProvider;

public class PopulationView {
	public static void main(String[] args) {
		
		DriverProvider.getDriver();
		PopulationDao popul = new PopulationDao();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("선택 1.전체출력 2.삭제 3.수정  4.남성/여성총합계  5.연령대별 남/여 인원수 6. 연령대별 남/여 인원수 검색  7.각동의 가장많은 인원수 8.1인가구수 9.동당 평균인구수 10.빈집 0.종료");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				popul.allData(); // 전체 출력
			} else if(choice == 2) {
				popul.delete(); // 호의 인구 삭제
			} else if(choice == 3) {
				popul.update(); // 인구수 수정
			} else if(choice == 4) {
				popul.gender();
			} else if(choice == 0) {
				sc.close();
				System.out.println("종료합니다");
				System.exit(0);
			} else if(choice == 5) {
				popul.age();
			} else if(choice == 6) {
				popul.selectGender();
			} else if (choice == 7) {
				popul.most();
			} else if (choice == 8) {
				popul.alone();
			} else if (choice == 9) {
				popul.average();
			} else if (choice == 10) {
				popul.nobody();
			}
 			
		}
		
	}
}
