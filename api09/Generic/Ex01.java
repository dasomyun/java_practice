package api09.Generic;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 8.
 * @내용 : 제네릭 ( Generic ) 의 필요성 
 */

class Box { 
	private Object obj;
	
	public void setObj (Object obj) {		// 상속 받지않고 두 객체를 넘기는 법 !
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


// 두 객체를 넘기는 법 
// 함수 중복 , 업케스팅~다운캐스팅 , 매개변수를 Object로 받기 
// 이것이 번거로워 제네릭이 만들어짐 