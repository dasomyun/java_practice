package dbUnit;

public class DriverProvider {

	public static void getDriver() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException e){
			System.out.println("DriverProvider getDriver Error");
			e.printStackTrace();
		}
	}
	
}
