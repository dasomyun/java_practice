package api07.Math;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 7.
 * @���� : java.lang�� math class�� �ݿø��Լ� 
 * 			�ݿø�(round), �����ǿø�(ceil), �����ǳ���(floor)
 */

public class BRound {

	public static void main(String[] args) {
		
		double x = 123.5672;
		double y = 456.4678;
		
		// �ݿø� 
		long a = (int)Math.round(x);
		System.out.println("a : " + a);
		// ������ �ø�
		int b = (int)Math.ceil(y);
		System.out.println("b : " + b);		
		// ������ ����
		int c = (int)Math.floor(x);
		System.out.println("c : " + c);
		
		// �Ҽ� ��° �ڸ� �ݿø� , ù° �ڸ����� ��� 
		// 123.5672   123.6
		double r = Math.round(x*10)/10.0;
		System.out.println("r : " + r);
		
		// �Ҽ� ��° �ڸ� �ݿø�, ��° �ڸ����� ���
		double rr = Math.round(x*100)/100.0;
		System.out.println("rr : " + rr);
		
		// �Ҽ� ��° �ڸ� �ݿø� , ��° �ڸ����� ���
		double rrr = Math.round(x*1000)/1000.0;
		System.out.println("rrr : " + rrr);
		
		// �Ҽ� ��° �ڸ� �ø�, ��° �ڸ����� ��� 
		double k = Math.ceil(x*100)/100.0;
		System.out.println("k : " + k);
		
		// �Ҽ� ��° �ڸ� ����, ��° �ڸ����� ��� 
		double i = Math.floor(x*100)/100.0;
		System.out.println("i : " + i + "\n\n");
		System.out.println("PI : " + Math.PI);
		
		double pi = Math.floor(Math.PI*1000000)/(double)1000000;
		System.out.println("pi : " + pi);
		
	}

}
