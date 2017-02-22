package bankConsole;

public class AccountDto {

	private short num;		// 자동증가번호
	private String id;		// 계좌번호
	private String name;		// 이름
	private long balance;	// 잔액
	public short getNum() {
		return num;
	}
	
	public void setNum(short num) {
		this.num = num;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String nae) {
		this.name = nae;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "AccountDto [num=" + num + ", id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
	
	
}
