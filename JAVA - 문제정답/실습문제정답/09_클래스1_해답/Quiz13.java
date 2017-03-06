package ch05.quiz01;

/**
 * @Data : 2016. 7. 12.
 * @Author : ÁÂ¹ÎÇý
 * @Description :  Å¬·¡½º1 - ½Ç½À¹®Á¦ 13)
 */

class ABS{
	public int value;
	public int result;
	
	public void setValue(int v){
		value=v;
	}
	
	public void resultAbs(){
		// result=value >=0 ? value:-value;
		if(value<0) value=-(value);
	}
	
	public void disp(){
		System.out.println("result:" + result);
	}
}

public class Quiz13 {
	public static void main(String[] args){
		ABS abs=new ABS();
		abs.setValue(-10);
		abs.resultAbs();
		abs.disp();
	}
}
