package api09.Generic;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 8.
 * @���� : ���׸� ( Generic ) �� �ʿ伺 
 */

class Box { 
	private Object obj;
	
	public void setObj (Object obj) {		// ��� �����ʰ� �� ��ü�� �ѱ�� �� !
		this.obj = obj;
		
		/*
		if(obj instanceof Apple) {
			Apple a = (Apple) obj;
		}
		else if(obj instanceof Banana){
			Banana b = (Banana) obj;
		}
		*/
	}
	
	public Object getObj () {
		return obj;
	}
	
}



class Apple { }
class Banana { }


public class Ex01 {

	public static void main(String[] args) {
		
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		Box box = new Box();
		
		box.setObj(apple);
		Apple a = (Apple) box.getObj();
		
		box.setObj(banana);
		Banana b = (Banana)box.getObj();		
	}

}


// �� ��ü�� �ѱ�� �� 
// �Լ� �ߺ� , ���ɽ���~�ٿ�ĳ���� , �Ű������� Object�� �ޱ� 
// �̰��� ���ŷο� ���׸��� ������� 