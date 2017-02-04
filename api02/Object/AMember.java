package api02.Object;

public class AMember {	//extends Object
	private String id;
	
	public AMember(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof AMember) {	//안써도 되지만 확인 
			AMember objE = (AMember) obj;	//다운캐스팅
			
			if(this.id.equals(objE.id)) {
				return true;
			}
		}
		
		
		return false;
	} 
	
	
}
