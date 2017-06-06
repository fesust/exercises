package workingwithobjects.hashcode;

public class FirstObject {
	
	private String Name;
	private int id;
	
	public FirstObject(String name, int id) {
		Name = name;
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public int getId() {
		return id;
	}
	
}