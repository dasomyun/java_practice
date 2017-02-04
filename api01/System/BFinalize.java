package api01.System;

//객체 생성 (생성자 호출) -- 작업을 한다 -- 객체 소멸(소멸자 호출) -- GC 소멸

public class BFinalize {//(extends Object)생략가능 	
	public int eno;
	
	public BFinalize(int eno){		//생성자
		this.eno = eno;
		System.out.println(eno + " : 메모리에서 생성");
	}

	@Override
	protected void finalize() throws Throwable {	//소멸자
		System.out.println(eno + " : 메모리에서 소멸");
	}

}
