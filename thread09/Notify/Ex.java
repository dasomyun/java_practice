package thread09.Notify;

/**
 * @ÀÛ¼ºÀÚ : À±´Ù¼Ø
 * @³¯Â¥ : 2017. 2. 15.
 * @³»¿ë : µ¿±âÈ­ ( Synchronized ) , Notify
 */

public class Ex {

	public static void main(String[] args) {
		
		WorkObject workObject = new WorkObject();
		
		A a = new A(workObject);
		a.setName("a °´Ã¼ : ");
		
//		A b = new A(workObject);
//		b.setName("b °´Ã¼ : ");
		
		B c = new B(workObject);
		c.setName("c °´Ã¼ : ");
		
//		B d = new B(workObject);
//		d.setName("d °´Ã¼ : ");
		
		a.start();
//		b.start();
		c.start();
//		d.start();
		
	}

}
