package bankConsole;

public class AccountDto {

	private short num;		// �ڵ�������ȣ
	private String id;		// ���¹�ȣ
	private String name;		// �̸�
	private long balance;	// �ܾ�
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
