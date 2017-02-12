package api10.List;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		
		ArrayList<Data> list = new ArrayList<Data>();
		
		Data a = new Data(10, 20);
		Data b = new Data(30, 40);
		Data c = new Data(50, 60);
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(new Data(70, 80));
		
		for(int i=0; i<list.size(); i++){
			Data data = list.get(i);
			data.yonsan();
			data.disp();
		}
		
		System.out.println("\n\n");
		
		list.add(new Data(100,200));
		System.out.println("추가 : " + list);
		
		list.add(2, new Data(300, 400));
		System.out.println("추가 : " + list);
		
		list.set(0, new Data(77, 88));
		System.out.println("교체 : " + list);
		
		list.remove(0);
		System.out.println("삭제 : " + list);
		
	}

}
