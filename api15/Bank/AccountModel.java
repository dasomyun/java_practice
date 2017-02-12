package api15.Bank;

/**����Ŭ����
 * @author : ���ټ�
 * @date : 2017. 2. 9.
 * @description : DB ���õ� �� get,set / ������ / toString ����� �ش�
 */
public class AccountModel {
	
	private int id;//DB�� int ���� �������� number ..... 
	private String name;
	private long balance;
	
	//������
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
	public String toString() {//�̰� �� ���ִ��� ã�Ƽ� �����ϱ�
		return "AccountMode1 [id = " + id + ", name = " + name + ", balance = " + balance + "]" ;
	}

}
