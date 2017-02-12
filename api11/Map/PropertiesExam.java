package api11.Map;

import java.io.FileReader;
import java.io.Reader;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author : 곽선아
 * @date : 2017. 2. 9.
 * @description : 
 * 		//★★★★★ data.properties 외부파일 key,value 사이 = 등호표시 사용   //정말많이사용
		//mvc2패턴..... 할게많다  그러니까 properties 파일을 구별해야 한다
		//data.properties 위치를 가져와야 한다
	    //영문을 사용한다(한글거의사용안함). 한글치면 인코딩. 뿌릴때 디코딩

 */
public class PropertiesExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//경로 : 클래스명.class.getResource().getPath() 를String으로 받음
		try{
		
			String path = PropertiesExam.class.getResource("data.properties").getPath();
		              //내가만든클래스.리소스파일(data.properties)읽고.경로를가지고와라
		
		System.out.println(path + "\n");
		
		//한글은 디코딩 작업 해줘야 한다
		path=URLDecoder.decode(path, "URF-8");
		
		//읽어가지고 온다
			Properties pro = new Properties();
			pro.load(new FileReader(path));	
			String value= pro.getProperty("animal");
			System.out.println(value);
			
			Iterator<Object> it = pro.keySet().iterator();//Object로 뽑아옴
			while(it.hasNext()){
				String key = (String) it.next();
				System.out.println(pro.getProperty(key));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
