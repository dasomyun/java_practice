package api02.Object;

public class AMember {	//extends Object
	private String id;
	
	public AMember(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof AMember) {	//�Ƚᵵ ������ Ȯ�� 
			AMember objE = (AMember) obj;	//�ٿ�ĳ����
			
			if(this.id.equals(objE.id)) {
				return true;
			}
		}
		
		
		return false;
	} 
	
	
}
