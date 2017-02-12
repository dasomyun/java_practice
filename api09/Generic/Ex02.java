package api09.Generic;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 8.
 * @���� : ���׸� (Generic) : �ڹ� 5���� �߰��� ���. �÷���, ��Ʈ�� ��� �θ� ���ȴ�.
 */

// �̷������� ���ư��� �� �˾Ƶ� �� 


class Fruit<T> {	// T = Melon    T�� Ŭ������ ���� �� ����  , <T> : Ÿ�� �Ķ����
	private T t;	// Melon = t;
	
	public void setData(T t) {
		this.t = t;
	}
	
	public T getData() {
		return t;
	}
	
} 

class Melon { }
class Orange { } 

public class Ex02 {

	public static void main(String[] args) {
		
		Fruit<Melon> f = new Fruit<Melon>();
		f.setData(new Melon());
		
		Fruit<Orange> g= new Fruit<Orange>();
		g.setData(new Orange());
	
	}

}
