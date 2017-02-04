package api03.Class;

public class ACar {
	private String model;
	private String owner;
	
	public ACar() {	}

	public ACar(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "ACar [model=" + model + ", owner=" + owner + "]";
	}
	
	
	
}
