package api15.Bank;

/**구현클래스
 * @author : 윤다솜
 * @date : 2017. 2. 9.
 * @description : DB 관련된 것 get,set / 생성자 / toString 만들어 준다
 */
public class AccountModel {
	
	private int id;//DB는 int 없다 정수형은 number ..... 
	private String name;
	private long balance;
	
	//생성자
	public AccountModel(){}
	
	public AccountModel(int id, String name, long balance){
		this.id=id;
		this. name= name;
		this.balance=balance;
	}

	//getter setter
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long getBalance() {
		return balance;
	}

	

	//toString @Override
	public String toString() {//이거 왜 해주는지 찾아서 공부하기
		return "AccountMode1 [id = " + id + ", name = " + name + ", balance = " + balance + "]" ;
	}

}
