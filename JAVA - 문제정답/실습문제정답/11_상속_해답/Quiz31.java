package ch06.quiz;

class Person{
	protected String name;
	protected int kor, eng, math, tot;
	protected float avg;
	
	public void setData(String name, int kor, int eng, int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}

class Sungjuk extends Person{
	public void total(){
		tot=kor+eng+math;
	}
	
	public void average(){
		avg=(float) tot/3;
	}

	public void disp(){
		System.out.println(name + "\t" + kor + "\t" + eng + "\t"+ math + "\t" + tot + "\t" + avg);
	}
}

public class Quiz31 {
	public static void main(String[] args) {
		Sungjuk s=new Sungjuk();
		s.setData("ȫ�浿", 100, 70, 80);
		s.total();
		s.average();
		s.disp();
	}
}
