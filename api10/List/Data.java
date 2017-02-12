package api10.List;

public class Data {
	private int x, y, z ;
	
	public Data() { }
	
	public Data(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void yonsan() {
		z = x+y;
	}
	
	public void disp() {
		System.out.println(x +"\t" + y + "\t" + z);
	}
	
	// 오버라이딩 해줘야 값 나옴 
	@Override
	public String toString() {
		return "[" + x +"\t" + y + "\t" + z + "]";
	}
	
	
	
}
