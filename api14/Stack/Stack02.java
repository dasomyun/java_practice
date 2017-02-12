package api14.Stack;

import java.util.Stack;

/**
 * @author : 곽선아
 * @date : 2017. 2. 9.
 * @description : 내가만든 Coin Class 가져다 쓰기
 */
public class Stack02 {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.empty()){
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 :"+coin.getValue()+" 원 ");
		}

	}

}
