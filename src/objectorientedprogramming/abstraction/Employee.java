package objectorientedprogramming.abstraction;

class Employee extends Person {
	
	protected int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void printName() {
		System.out.println(name);
	}

}
