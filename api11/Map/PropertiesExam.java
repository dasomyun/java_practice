package api11.Map;

import java.io.FileReader;
import java.io.Reader;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author : ������
 * @date : 2017. 2. 9.
 * @description : 
 * 		//�ڡڡڡڡ� data.properties �ܺ����� key,value ���� = ��ȣǥ�� ���   //�������̻��
		//mvc2����..... �ҰԸ���  �׷��ϱ� properties ������ �����ؾ� �Ѵ�
		//data.properties ��ġ�� �����;� �Ѵ�
	    //������ ����Ѵ�(�ѱ۰��ǻ�����). �ѱ�ġ�� ���ڵ�. �Ѹ��� ���ڵ�

 */
public class PropertiesExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��� : Ŭ������.class.getResource().getPath() ��String���� ����
		try{
		
			String path = PropertiesExam.class.getResource("data.properties").getPath();
		              //��������Ŭ����.���ҽ�����(data.properties)�а�.��θ�������Ͷ�
		
		System.out.println(path + "\n");
		
		//�ѱ��� ���ڵ� �۾� ����� �Ѵ�
		path=URLDecoder.decode(path, "URF-8");
		
		//�о���� �´�
			Properties pro = new Properties();
			pro.load(new FileReader(path));	
			String value= pro.getProperty("animal");
			System.out.println(value);
			
			Iterator<Object> it = pro.keySet().iterator();//Object�� �̾ƿ�
			while(it.hasNext()){
				String key = (String) it.next();
				System.out.println(pro.getProperty(key));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
