package population;
import java.util.Scanner;
import dbUnit.DriverProvider;
import population.PopulationDao;
import population.PopulationDaoReport;
import population.PopulationDaoSearch;

public class PopulationView {
	
	public static void line(){
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		
		DriverProvider.getDriver();
		PopulationDao pd = new PopulationDao();
		PopulationDaoSearch pds = new PopulationDaoSearch();
		PopulationDaoReport pdr = new PopulationDaoReport();
		Scanner sc = new Scanner(System.in);

		line();//구분선 : 중복되어서 메소드로 뺌
		System.out.println("※쌍용아파트 입주민 인구수 조사 센터입니다.원하시는 보기를 선택하여 사용하시기 바랍니다.※");
		System.out.println("1.인원수 입력 : 동,호수를 입력하고 연령대와 성별로 인원수를 입력합니다");
		System.out.println("2.수정");
		System.out.println("3.삭제: ");
		System.out.println("4.전체출력: 쌍용아파트 전체 인원수를 보여줍니다.");
		System.out.println("5.검색: 동,호수를 입력하면 거주하고 있는 연령대의 인원수를 보여줍니다.");
		System.out.println("6.동별통계 검색: 남,여,연령대를 검색하여 동별 통계를 보여줍니다.");
		System.out.println("7.보고서: 쌍용아파트의 총인원, 남여비율, 거주율 등을 보여줍니다. ");
		System.out.println("8.종료: 프로그램을 완전 종료합니다.");
		System.out.println("\n☞사용방법이 어려우신 분들은 고객센터로 연락주시기 바랍니다.");
		System.out.println("☎02-3482-4632, 주소:서울특별시 강남구 테헤란로 132(역삼동) 한독약품빌딩 8층 쌍용교육센터");
		line();
		
		while(true) {
			System.out.println("1.인원수 입력 | 2.수정 | 3.삭제 | 4.전체출력 | 5.검색 | 6.동별통계 검색 | 7.보고서 | 8.종료 ");
			System.out.print(">>");
			int choice = sc.nextInt();
			
			if(choice==1){//1.인원수 입력
				line();
				System.out.println("※쌍용아파트 주거민 인구수 조사를 시작합니다. 아래의 내용을 충분히 읽어보신 후 사용하시기 바랍니다.※");
				System.out.println("①동을 입력하세요. ②호를 입력하세요. ③연령대 별로 남여 인원수를 순서대로 입력하세요");
				System.out.println("☞인원수 입력이 잘못됐을 경우 2.수정을 선택하여 수정하시기 바랍니다.");
				line();
				pd.insert();
			}else if(choice==2){//2.수정
				line();
				System.out.println("※인원수 수정을 시작합니다. 아래의 내용을 충분히 읽어보신 후 사용하시기 바랍니다.※");
				System.out.println("①수정할 동을 입력하세요. ②수정할 호를 입력하세요. ③수정할 연령대를 선택하세요. ④수정할 성별을 선택하세요. ⑤수정할 인원수를 입력하세요");
				line();
				pd.update();
			}else if(choice==3){//3.삭제
				line();
				System.out.println("※인원수 삭제를 시작합니다. 아래의 내용을 충분히 읽어보신 후 사용하시기 바랍니다.※");
				System.out.println("①삭제할 동을 입력하세요. ②삭제할 호를 입력하세요.");
				line();
				pd.delete();
			}else if(choice==4){//4.전체출력
				line();
				System.out.println("※쌍용아파트 전체의 연령대별 남,여 인원수와 총 인원수를 보여줍니다※");
				line();
				pd.showAllData();
			}else if(choice==5){//5.동호수로 인원수 검색
				line();
				System.out.println("※동,호수를 입력하면 연령대별 남,여 인원수와 총 인원수를 보여줍니다. 아래의 내용을 충분히 읽어보신 후 사용하시기 바랍니다.※");
				System.out.println("①검색할 동을 입력하세요. ②검색할 호를 입력하세요.");
				line();
				pd.search();
			}else if(choice==6){//6.동별통계 검색
				line();
				System.out.println("※남,여,연령대 별로 검색하여 동별 통계를 출력합니다. 아래의 내용을 읽어보신 후 알맞은 번호를 선택해주세요.※");
				System.out.println("1. 남/여 인원수 : 동별로 남자인원수, 여자인원수, 총인원수를 보여줍니다.");
				System.out.println("2. 연령대별 남/여 인원수 : 동에 거주하는 연령대별 인원수를 보여줍니다.");
				System.out.println("3. 연령대별 남/여 인원수 검색 : 연령대와 성별을 선택하여 동에 거주하는 인원수를 보여줍니다.");
				System.out.println("4. 각동의 가장 많은 가구 : 동에서 가장 많이 거주하는 가구의 동호수와 인원수를 보여줍니다.");
				System.out.println("5. 1인 가구 : 1인가구의 동과 호수를 보여줍니다.");
				System.out.println("6. 동당 평균 인구수 : 동별로 평균 거주하는 인구수를 보여줍니다.");
				line();
				
				while(true){
					System.out.println("1.남/여 인원수 | 2.연령대별 남/여 인원수 | 3.연령대별 남/여 인원수 검색 | 4.각동의 가장 많은 가구 | 5.1인 가구 | 6.동당 평균 인구수 | 7.비거주 가구 | 8.돌아가기");
					System.out.print(">>");
					int select = sc.nextInt();
					if(select ==1){//1.남/여 인원수
						pds.gender();
					}else if(select==2){//2.연령대별 남/여 인원수
						pds.age();
					}else if(select==3){//3.연령대별 남/여 인원수 검색
						pds.selectGender();
					}else if(select==4){//4.각동의 가장많은 가구
						pds.most();
					}else if(select==5){//5.1인 가구
						pds.alone();
					}else if(select==6){//6.동당 평균인구수
						pds.average();
					}else if(select==7){//7.비거주 가구
						pds.nobody();
					}else if(select==8){
						break;
					}
				}
			}else if(choice==7){//보고서
				line();
				pdr.report();
				line();
			}else if(choice==8){//프로그램종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}else{
				System.out.println("잘못입력하셨습니다.다시입력해주세요");
				sc.close();
			}
		}
		
	}
}
