package workingwithobjects.hashcode;

public class SecondObject {
	
	private String Name;
	private int id;
	
	public SecondObject(String name, int id) {
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